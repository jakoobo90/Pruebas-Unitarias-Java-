package Generation.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pruebas unitarias de la clase Calculator")
public class CalculatorTest {

    @Test
    @DisplayName("Suma de números positivos")
    void addTest() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(3, 2), "Suma 3 + 2 debe ser 5");
        assertEquals(0, cal.add(0, 0), "Suma 0 + 0 debe ser 0");
    }

    @Test
    @DisplayName("Resta de números positivos")
    void subtractTest() {
        Calculator cal = new Calculator();
        assertEquals(1, cal.subtract(3, 2), "Resta 3 - 2 debe ser 1");
        assertEquals(-1, cal.subtract(2, 3), "Resta 2 - 3 debe ser -1");
    }

    @Test
    @DisplayName("Multiplicación de números positivos")
    void multiplyTest() {
        Calculator cal = new Calculator();
        assertEquals(6, cal.multiply(3, 2), "Multiplicación 3 × 2 debe ser 6");
        assertEquals(0, cal.multiply(5, 0), "Multiplicación con 0 debe dar 0");
    }

    @Test
    @DisplayName("División de números positivos")
    void divideTest() {
        Calculator cal = new Calculator();
        assertEquals(2, cal.divide(6, 3), "División 6 ÷ 3 debe ser 2");
    }

    @Test
    @DisplayName("División entre cero lanza excepción")
    void divideByZeroTest() {
        Calculator cal = new Calculator();
        assertThrows(ArithmeticException.class, () -> cal.divide(6, 0));
    }
}

