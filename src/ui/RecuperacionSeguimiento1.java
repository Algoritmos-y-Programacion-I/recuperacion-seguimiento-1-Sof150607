package ui;

import java.util.Scanner;
import java.lang.Math;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // EJERCICIO 1
        System.out.println("EJERCICIO 1:");
        System.out.print("Ingrese el primer parámetro: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo parámetro: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer parámetro: ");
        int num3 = scanner.nextInt();
        run(num1, num2, num3);

        scanner.nextLine(); 



        // EJERCICIO 2
        System.out.println("EJERCICIO 2:");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese un número (1 o 0): ");
        int opcion = scanner.nextInt();
        run(nombre, opcion);

        scanner.nextLine(); 



        // EJERCICIO 3
        System.out.println("EJERCICIO 3:");
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.print("Ingrese la tercera palabra: ");
        String palabra3 = scanner.nextLine();
        System.out.println("El resultado es: " + run(palabra1, palabra2, palabra3));




        // EJERCICIO 4
        System.out.println("EJERCICIO 4:");
        System.out.print("Ingrese la primera palabra: ");
        String palabra4_1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra4_2 = scanner.nextLine();
        System.out.println("Resultado de comparación: " + compararCaracteres(palabra4_1, palabra4_2));




        // EJERCICIO 5
        System.out.println("EJERCICIO 5:");
        System.out.print("Coeficiente a: ");
        double coefA = scanner.nextDouble();
        System.out.print("Coeficiente b: ");
        double coefB = scanner.nextDouble();
        System.out.print("Coeficiente c: ");
        double coefC = scanner.nextDouble();
        calcularRaices(coefA, coefB, coefC);

        scanner.close();
    }




    // EJERCICIO 1
    public static void run(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("3");
        } else if (a == b || a == c || b == c) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }



    // EJERCICIO 2
    public static void run(String nombre, int num) {
        if (num == 1) {
            System.out.println("Hola " + nombre);
        } else if (num == 0) {
            System.out.println("Chao " + nombre);
        } else {
            System.out.println("Error: número inválido.");
        }
    }



    // EJERCICIO 3
    public static int run(String p1, String p2, String p3) {
        int count = 0;
        if (p1.length() >= 4) count++;
        if (p2.length() >= 4) count++;
        if (p3.length() >= 4) count++;
        return count;
    }




    // EJERCICIO 4
    public static String compararCaracteres(String p1, String p2) {
        if (p1.length() < 3 || p2.length() < 3) {
            return "Las palabras deben tener al menos 3 caracteres.";
        }
        return (p1.charAt(2) == p2.charAt(2)) ? "true" : "false";
    }


	

    // EJERCICIO 5
    public static void calcularRaices(double a, double b, double c) {
        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser igual a 0.");
            return;
        }

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Solo hay una raíz real: x = " + x);
        } else {
            System.out.println("No hay raíces reales.");
        }
    }
}