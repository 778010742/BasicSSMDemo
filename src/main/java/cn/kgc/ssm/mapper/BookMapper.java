package cn.kgc.ssm.mapper;

import cn.kgc.ssm.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图书模块业务实现接口
 * Created by sam on 2018/9/5.
 */
public interface BookMapper {
    //添加图书
    void addBook(Book book);
    //删除图书
    void removeBook(int id);
    //修改图书
     void modifyBook(@Param("id")int id,@Param("newBook") Book newBook);
    //查询某本书
    List<Book> queryBook(@Param("queryType") String queryType,@Param("queryText")String queryText);
    //查询所有图书
     List<Book> queryAllBook();
}
