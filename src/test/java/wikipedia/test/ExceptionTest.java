package wikipedia.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    void exception() {
        try {
            System.out.println((char[])null);
            Assertions.assertTrue(false);
        } catch (NullPointerException e) {
            System.out.println("Исключение NullPointerException обработано");
        } catch (AssertionError e){
            System.out.println("Исключение AssertionError обработано");
        }
    }
}