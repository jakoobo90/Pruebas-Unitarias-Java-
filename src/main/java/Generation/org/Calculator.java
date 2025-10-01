package Generation.org;

public class Calculator {

    // Método que hace la suma de dos números
    public int add(int a, int b) {
        return a + b;
    }

    // Método que hace la resta de dos números
    public int subtract(int a, int b) {
        return a - b;
    }

    // Método que hace la división de dos números
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    // (Opcional) Método que hace la multiplicación de dos números
    public int multiply(int a, int b) {
        return a * b;
    }
}
