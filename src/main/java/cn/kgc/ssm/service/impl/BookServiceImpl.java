package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.BookMapper;
import cn.kgc.ssm.model.Book;
import cn.kgc.ssm.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void removeBook(int id) {
        bookMapper.removeBook(id);
    }

    @Override
    public void modifyBook(int id, Book newBook) {
        bookMapper.modifyBook(id,newBook);
    }

    @Override
    public List<Book> queryBook(String queryType,String queryText) {
        queryText="%"+queryText+"%";
        return bookMapper.queryBook(queryType,queryText);
    }

    @Override
    public List<Book> queryAllBook() {
        return  bookMapper.queryAllBook();
    }
}
