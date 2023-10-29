package seminars.six;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListComparerTest {
    @Test
    public void testCompareLists_EmptyLists() {
        ListComparer comparer = new ListComparer();

        // Тест на сравнение пустых списков
        assertEquals("Средние значения равны", comparer.compareLists(Collections.emptyList(), Collections.emptyList()));
        assertEquals("Средние значения равны", comparer.compareLists(Collections.emptyList(), List.of(1)));
        assertEquals("Средние значения равны", comparer.compareLists(List.of(2, 3), Collections.emptyList()));

    }

    @Test
    public void testCompareLists_SingleElementLists() {
        ListComparer comparer = new ListComparer();

        // Тесты на сравнение списков с одним элементом
        assertEquals("Средние значения равны", comparer.compareLists(List.of(42), List.of(42)));
        assertEquals("Первый список имеет большее среднее значение", comparer.compareLists(List.of(42), List.of(3)));
        assertEquals("Второй список имеет большее среднее значение", comparer.compareLists(List.of(1), List.of(42)));
    }

    @Test
    public void testCompareLists_FirstListGreaterAverage() {
        ListComparer comparer = new ListComparer();

        assertEquals("Первый список имеет большее среднее значение", comparer.compareLists(List.of(1, 2, 3), List.of(4, 5, 6)));
    }

    @Test
    public void testCompareLists_SecondListGreaterAverage() {
        ListComparer comparer = new ListComparer();

        assertEquals("Второй список имеет большее среднее значение", comparer.compareLists(List.of(1, 2, 3), List.of(2, 3, 4)));
    }

    @Test
    public void testCompareLists_EqualAverageValues() {
        ListComparer comparer = new ListComparer();

        assertEquals("Средние значения равны", comparer.compareLists(List.of(1, 2, 3), List.of(2, 3, 4, 0)));
    }
}
