package cn.kgc.ssm.service;
import  cn.kgc.ssm.model.Book;

import java.util.List;

public interface BookService {
    //添加图书
    void addBook(Book book);
    //删除图书
    void removeBook(int id);
    //修改图书
    void modifyBook(int id,Book newBook);
    //查询某本书
    List<Book> queryBook(String queryType,String queryText);
    //查询所有图书
    List<Book> queryAllBook();
}
