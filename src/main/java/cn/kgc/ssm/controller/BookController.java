package cn.kgc.ssm.controller;

import cn.kgc.ssm.model.Book;
import cn.kgc.ssm.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping("/queryAllBook")
    public String queryAllBook(Model model){
        List<Book> bookList;
            bookList = bookService.queryAllBook();
            model.addAttribute("bookList", bookList);
            return  "queryAllBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(Model model, HttpServletRequest request){
        String queryText= request.getParameter("queryText");
        String queryType = request.getParameter("queryType");
        List<Book> bookList;
        bookList = bookService.queryBook(queryType,queryText);
        model.addAttribute("bookList", bookList);
        return  "queryBook";
    }
    @RequestMapping("/addBook")
    public String addBook(HttpServletRequest request){
        Book book = new Book();
        book.setBookName(request.getParameter("book_Name"));
        book.setBookAuthor(request.getParameter("book_Author"));
        book.setBookPage(Integer.parseInt(request.getParameter("book_Page")));
        book.setBookPrice(Double.parseDouble(request.getParameter("book_Price")));
        book.setBookPulish(request.getParameter("book_Pulish"));
        bookService.addBook(book);
        return "addBook";
    }

    @RequestMapping("/preAddBook")
    public  String preAddBook(){
        return "preAddBook";
    }

}
