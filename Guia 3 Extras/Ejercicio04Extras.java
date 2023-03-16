package ejercicio4extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 *
 */
public class Ejercicio4Extras {

    public static void main(String[] args) {
        // crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // pedir al usuario que ingrese un número entre 1 y 10
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = leer.nextInt();  // leer el número ingresado por el usuario

        // validar que el número esté dentro del rango permitido
        if (numero < 1 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            // mostrar el número romano equivalente al número ingresado por el usuario
            System.out.print("El número " + numero + " en números romanos es ");

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
