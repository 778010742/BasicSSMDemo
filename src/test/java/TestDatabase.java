import cn.kgc.ssm.model.Book;
import cn.kgc.ssm.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-*.xml")
public class TestDatabase {

    @Resource
    private BookService bookService;

    @Test
    public void queryAllbook(){
        List<Book> books = bookService.queryAllBook();
        for (Book book:books) {
            System.out.println(book.toString());
        }
    }
}
