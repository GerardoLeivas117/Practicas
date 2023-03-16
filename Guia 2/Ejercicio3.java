package ejercicio3;

import java.util.Scanner;

/**
 * @author Gerardo 
 * Escribir un programa que pida una frase y la muestre toda en
 * may�sculas y despu�s toda en min�sculas.
 *
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Utilizamos la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Pedimos que nos ingrese una frase y la guardamos en una variable
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        //Mostramos por pantalla la frase toda en may�scula y min�scula
        System.out.println("Su frase en may�sculas ->"+frase.toUpperCase());
        System.out.println("Su frase en min�sculas ->"+frase.toLowerCase());
        //Cerramos el Scanner
        leer.close();
    }

}
