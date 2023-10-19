package seminars.third.hm;

import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    @Test
    public void testEvenOddNumberWithEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4)); // Передаем четное число
    }

    @Test
    public void testEvenOddNumberWithOddNumber() {
        assertFalse(MainHW.evenOddNumber(7)); // Передаем нечетное число
    }

    @Test
    public void testEvenOddNumberWithZero() {
        assertTrue(MainHW.evenOddNumber(0)); // Передаем ноль (число четное)
    }

    @Test
    public void testNumberInIntervalWithValidNumber() {
        assertTrue(MainHW.numberInInterval(50)); // Передаем число в интервале (25;100)
    }

    @Test
    public void testNumberInIntervalWithLowerBound() {
        assertFalse(MainHW.numberInInterval(25)); // Граничное значение интервала (левая граница)
    }

    @Test
    public void testNumberInIntervalWithUpperBound() {
        assertFalse(MainHW.numberInInterval(100)); // Граничное значение интервала (правая граница)
    }

    @Test
    public void testNumberInIntervalWithOutOfRange() {
        assertFalse(MainHW.numberInInterval(10)); // Число вне интервала
    }
}
