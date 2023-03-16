package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Crea una aplicaci�n que nos pida un n�mero por teclado y con una funci�n se
 * lo pasamos por par�metro para que nos indique si es o no un n�mero primo,
 * debe devolver true si es primo, sino false. Un n�mero primo es aquel que solo
 * puede dividirse entre 1 y s� mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo
 *
 */
public class Ejercicio4 {

    /**
     * Este m�todo principal ejecuta el programa para verificar si un n�mero
     * ingresado por el usuario es primo o no.
     * Utiliza la f�ncion leerNumeros(); para solicitar un n�mero v�lido y correcto.
     * Utiliza el m�todo "consultaPrimo()" para realizar el c�lculo, que
     * devuelve true si el n�mero es primo y false en caso contrario. Imprime un
     * mensaje en la consola que indica si el n�mero es primo o no.
     */
    public static void main(String[] args) {
        if (consultaPrimo(leerNumeros())) {
            System.out.println("El n�mero es primo.");
        } else {
            System.out.println("El n�mero no es primo.");
        }
    }

    /**
     *
     * M�todo para leer un n�mero ingresado por el usuario desde la consola.
     *
     * @return el n�mero ingresado por el usuario
     */
    private static long leerNumeros() {
        Scanner leer = new Scanner(System.in); // Crear objeto Scanner para leer desde la consola
        long num;
        while (true) { // Repetir hasta que se ingrese un n�mero v�lido
            try {
                System.out.println("Ingrese un n�mero:"); // Pedir al usuario que ingrese un n�mero
                num = leer.nextLong(); // Leer el n�mero ingresado por el usuario
                break; // Salir del bucle while si se ingres� un n�mero v�lido
            } catch (Exception e) {
                System.out.println("Error: Ingreso Inv�lido. Intente nuevamente."); // Indicar al usuario que se ingres� un valor inv�lido
                leer.next(); // Descartar la entrada inv�lida
            }
        }
        leer.close(); // Cerrar el objeto Scanner
        return num; // Retornar el n�mero ingresado por el usuario
    }

    /**
     *
     * Funci�n para evaluar si un n�mero es Primo.
     *
     * @param num numero a evaluar.
     * @return devuelve verdadero si el n�mero es primo y falso si no lo es.
     */
    private static boolean consultaPrimo(long num) {
        long i = num - 1; // Se inicializa la variable i en num-1 para comenzar a verificar si el n�mero es primo desde el n�mero anterior a �l
        if (num <= 1) { // Si el n�mero es menor o igual que 1, no es primo
            return false;
        }

        while (i >= 2) { // Se itera mientras i sea mayor o igual que 2
            if (((num) % i) == 0) { // Si el n�mero es divisible entre i, entonces no es primo
                return false;
            }
            i--; // Se decrementa el valor de i en cada iteraci�n
        }
        return true; // Si no se encontr� un divisor del n�mero, entonces es primo
    }

}
