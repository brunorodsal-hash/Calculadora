package Calculadora;

import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    double[] nums1 = leerDosNumeros(sc);
                    System.out.printf("Resultado: %.6f%n", sumar(nums1[0], nums1[1]));
                    break;
                case "2":
                    double[] nums2 = leerDosNumeros(sc);
                    System.out.printf("Resultado: %.6f%n", restar(nums2[0], nums2[1]));
                    break;
                case "3":
                    double[] nums3 = leerDosNumeros(sc);
                    System.out.printf("Resultado: %.6f%n", multiplicar(nums3[0], nums3[1]));
                    break;
                case "4":
                    double[] nums4 = leerDosNumeros(sc);
                    if (nums4[1] == 0) {
                        System.out.println("Error: División por cero no permitida.");
                    } else {
                        System.out.printf("Resultado: %.6f%n", dividir(nums4[0], nums4[1]));
                    }
                    break;
                case "5":
                    double[] nums5 = leerDosNumeros(sc);
                    if (nums5[1] == 0) {
                        System.out.println("Error: Módulo por cero no permitido.");
                    } else {
                        System.out.printf("Resultado: %.6f%n", modulo(nums5[0], nums5[1]));
                    }
                    break;
                case "6":
                    salir = true;
                    System.out.println("Saliendo. ¡Hasta luego!");
                    break;
                case "7":
                    System.out.print("Introduce la base: ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.print("Introduce el exponente: ");
                    double exp = Double.parseDouble(sc.nextLine());
                    System.out.printf("Resultado: %.6f%n", FuncionesExtra.potencia(base, exp));
                    break;
                case "8":
                    System.out.print("Introduce el número: ");
                    double num = Double.parseDouble(sc.nextLine());
                    try {
                        System.out.printf("Resultado: %.6f%n", FuncionesExtra.raizCuadrada(num));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            if (!salir) {
                System.out.println(); // línea en blanco antes del siguiente menú
            }
        }

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("=== Calculadora Básica ===");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Módulo");
        System.out.println("6) Salir");
        System.out.println("7) Potencia");
        System.out.println("8) Raíz cuadrada");
    }

    private static double[] leerDosNumeros(Scanner sc) {
        double a = leerNumero(sc, "Introduce el primer número: ");
        double b = leerNumero(sc, "Introduce el segundo número: ");
        return new double[] { a, b };
    }

    private static double leerNumero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce un número válido.");
            }
        }
    }

    private static double sumar(double a, double b) {
        return a + b;
    }

    private static double restar(double a, double b) {
        return a - b;
    }

    private static double multiplicar(double a, double b) {
        return a * b;
    }

    private static double dividir(double a, double b) {
        return a / b;
    }

    private static double modulo(double a, double b) {
        return a % b;
    }

}
