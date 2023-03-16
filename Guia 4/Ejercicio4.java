package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo
 *
 */
public class Ejercicio4 {

    /**
     * Este método principal ejecuta el programa para verificar si un número
     * ingresado por el usuario es primo o no.
     * Utiliza la fúncion leerNumeros(); para solicitar un número válido y correcto.
     * Utiliza el método "consultaPrimo()" para realizar el cálculo, que
     * devuelve true si el número es primo y false en caso contrario. Imprime un
     * mensaje en la consola que indica si el número es primo o no.
     */
    public static void main(String[] args) {
        if (consultaPrimo(leerNumeros())) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }

    /**
     *
     * Método para leer un número ingresado por el usuario desde la consola.
     *
     * @return el número ingresado por el usuario
     */
    private static long leerNumeros() {
        Scanner leer = new Scanner(System.in); // Crear objeto Scanner para leer desde la consola
        long num;
        while (true) { // Repetir hasta que se ingrese un número válido
            try {
                System.out.println("Ingrese un número:"); // Pedir al usuario que ingrese un número
                num = leer.nextLong(); // Leer el número ingresado por el usuario
                break; // Salir del bucle while si se ingresó un número válido
            } catch (Exception e) {
                System.out.println("Error: Ingreso Inválido. Intente nuevamente."); // Indicar al usuario que se ingresó un valor inválido
                leer.next(); // Descartar la entrada inválida
            }
        }
        leer.close(); // Cerrar el objeto Scanner
        return num; // Retornar el número ingresado por el usuario
    }

    /**
     *
     * Función para evaluar si un número es Primo.
     *
     * @param num numero a evaluar.
     * @return devuelve verdadero si el número es primo y falso si no lo es.
     */
    private static boolean consultaPrimo(long num) {
        long i = num - 1; // Se inicializa la variable i en num-1 para comenzar a verificar si el número es primo desde el número anterior a él
        if (num <= 1) { // Si el número es menor o igual que 1, no es primo
            return false;
        }

        while (i >= 2) { // Se itera mientras i sea mayor o igual que 2
            if (((num) % i) == 0) { // Si el número es divisible entre i, entonces no es primo
                return false;
            }
            i--; // Se decrementa el valor de i en cada iteración
        }
        return true; // Si no se encontró un divisor del número, entonces es primo
    }

}
