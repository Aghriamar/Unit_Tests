package seminars.fourth.hm;
import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;

import static org.assertj.core.api.Assertions.*;
public class BookTest {
    @Test
    void testGettersAndSetters() {
        Book book = new Book("1", "Book1", "Author1");

        assertThat(book.getId()).isEqualTo("1");
        assertThat(book.getTitle()).isEqualTo("Book1");
        assertThat(book.getAuthor()).isEqualTo("Author1");

        book.setId("2");
        book.setTitle("NewTitle");
        book.setAuthor("NewAuthor");

        assertThat(book.getId()).isEqualTo("2");
        assertThat(book.getTitle()).isEqualTo("NewTitle");
        assertThat(book.getAuthor()).isEqualTo("NewAuthor");
    }
}
