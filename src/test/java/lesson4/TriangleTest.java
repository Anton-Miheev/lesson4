package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import static lesson4.TriangleSquareCalculationTest.countTriangleArea;

public class TriangleTest {
    @Test
    void calcArea() throws BadTriangleException {
        double result = countTriangleArea(5, 5, 5);
        Assertions.assertEquals(10.825317547305483, result);
    }

    @Test
    void badTriangleTest() {
        assertThatExceptionOfType(BadTriangleException.class).isThrownBy(
                () -> countTriangleArea(-2, 3, 3));
    }
}
