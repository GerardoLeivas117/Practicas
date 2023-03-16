package ejercicio4extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Elaborar un algoritmo en el cu�l se ingrese un n�mero entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 */
public class Ejercicio4Extras {

    public static void main(String[] args) {
        // crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // pedir al usuario que ingrese un n�mero entre 1 y 10
        System.out.print("Ingrese un n�mero entre 1 y 10: ");
        int numero = leer.nextInt();  // leer el n�mero ingresado por el usuario

        // validar que el n�mero est� dentro del rango permitido
        if (numero < 1 || numero > 10) {
            System.out.println("El n�mero ingresado est� fuera del rango permitido.");
        } else {
            // mostrar el n�mero romano equivalente al n�mero ingresado por el usuario
            System.out.print("El n�mero " + numero + " en n�meros romanos es ");

            switch (numero) {
                case 1:
                    System.out.println("I.");
                    break;
                case 2:
                    System.out.println("II.");
                    break;
                case 3:
                    System.out.println("III.");
                    break;
                case 4:
                    System.out.println("IV.");
                    break;
                case 5:
                    System.out.println("V.");
                    break;
                case 6:
                    System.out.println("VI.");
                    break;
                case 7:
                    System.out.println("VII.");
                    break;
                case 8:
                    System.out.println("VIII.");
                    break;
                case 9:
                    System.out.println("IX.");
                    break;
                case 10:
                    System.out.println("X.");
                    break;
                default:
                    break;
            }
        }
        //Cerramos el scanner
        leer.close();
    }

}
