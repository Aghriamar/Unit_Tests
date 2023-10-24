package seminars.fourth.hm;

import org.junit.jupiter.api.BeforeEach;
import seminars.fourth.book.Book;
import seminars.fourth.book.InMemoryBookRepository;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class InMemoryBookRepositoryTest {
    private InMemoryBookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository = new InMemoryBookRepository();
    }

    @Test
    public void testFindById() {
        Book book = bookRepository.findById("1");
        assertEquals("1", book.getId());
    }

    @Test
    public void testFindAll() {
        List<Book> books = bookRepository.findAll();
        assertEquals(2, books.size());
    }
}
