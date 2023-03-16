
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 * 
 * Crear un programa que dado un número determine si es par o impar.
 * 
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Usamos la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        //Definimos una variable entera para guardar valores por teclado
        int numero1;
        //Solicitamos por pantalla el ingreso por teclado de un número
        System.out.println("Ingrese un número:");
        //Guardamos el valor ingresado en numero1
        numero1 = leer.nextInt();
        /**
         * Un numero es par cuando su división con 2 es exacta sin resto
         */
        //Nos preguntamos si es par
        if( (numero1 % 2) == 0){
            /**
             * Entramos si la expresión es verdadera, significa que la división
             * de numero1 y 2 produce el resto 0.
             * 
             */
            //Mostramos por pantalla que el número es par
            System.out.println("El número es par");
        
        }else{
            /**
             * Entramos si la expresión es falsa, significa que el resto del dividir
             * el numero1 con 2 no fue exacto
             */
            //Mostramos por pantalla que el número es impar
            System.out.println("El número es impar");
        }
        //Cerramos el Scanner
        leer.close();
    }
    
}
