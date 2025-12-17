package Calculadora;

public class FuncionesExtra {

    // Metodo para calcular la potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Metodo para calcular la raíz cuadrada
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
