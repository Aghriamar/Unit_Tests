package seminars.fourth.hm;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindBookById() {
        Book expectedBook = new Book("1", "Book1", "Author1");
        when(bookRepository.findById("1")).thenReturn(expectedBook);

        Book result = bookService.findBookById("1");

        verify(bookRepository).findById("1");

        assertThat(result).isEqualTo(expectedBook);
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book1", "Author1"));
        expectedBooks.add(new Book("2", "Book2", "Author2"));
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> result = bookService.findAllBooks();

        verify(bookRepository).findAll();

        assertThat(result).isEqualTo(expectedBooks);
    }
}
