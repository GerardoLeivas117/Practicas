package ejercicio11extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo Escribir un programa que lea un número entero y devuelva el
 * número de dígitos que componen ese número. Por ejemplo, si introducimos el
 * número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
 * matemáticamente utilizando el operador de división. Nota: recordar que las
 * variables de tipo entero truncan los números o resultados.
 *
 */
public class Ejercicio11Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long numero1, digitos = 0; // declaramos las variables para el número ingresado y la cantidad de dígitos
        
        System.out.println("Ingrese un número")                ;
        numero1 = leer.nextLong(); // leemos el número ingresado por el usuario
        
        if (numero1 == 0) { // si el número ingresado es cero
            digitos = 1; // entonces la cantidad de dígitos es uno
        } else {
            while (numero1 > 0) { // mientras el número ingresado sea mayor que cero
                digitos++; // aumentamos la cantidad de dígitos en uno
                numero1 /= 10; // eliminamos el último dígito del número
            }

        }
        System.out.println("La cantidad de dígitos del número es:" + digitos); // mostramos la cantidad de dígitos del número
        //Cerramos el scanner
        leer.close();
    }

}
