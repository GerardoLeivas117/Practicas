package ejercicio3;

import java.util.Scanner;

/**
 * @author Gerardo 
 * Escribir un programa que pida una frase y la muestre toda en
 * mayúsculas y después toda en minúsculas.
 *
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Utilizamos la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Pedimos que nos ingrese una frase y la guardamos en una variable
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        //Mostramos por pantalla la frase toda en mayúscula y minúscula
        System.out.println("Su frase en mayúsculas ->"+frase.toUpperCase());
        System.out.println("Su frase en minúsculas ->"+frase.toLowerCase());
        //Cerramos el Scanner
        leer.close();
    }

}
