package ejercicio11extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo Escribir un programa que lea un n�mero entero y devuelva el
 * n�mero de d�gitos que componen ese n�mero. Por ejemplo, si introducimos el
 * n�mero 12345, el programa deber� devolver 5. Calcular la cantidad de d�gitos
 * matem�ticamente utilizando el operador de divisi�n. Nota: recordar que las
 * variables de tipo entero truncan los n�meros o resultados.
 *
 */
public class Ejercicio11Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long numero1, digitos = 0; // declaramos las variables para el n�mero ingresado y la cantidad de d�gitos
        
        System.out.println("Ingrese un n�mero")                ;
        numero1 = leer.nextLong(); // leemos el n�mero ingresado por el usuario
        
        if (numero1 == 0) { // si el n�mero ingresado es cero
            digitos = 1; // entonces la cantidad de d�gitos es uno
        } else {
            while (numero1 > 0) { // mientras el n�mero ingresado sea mayor que cero
                digitos++; // aumentamos la cantidad de d�gitos en uno
                numero1 /= 10; // eliminamos el �ltimo d�gito del n�mero
            }

        }
        System.out.println("La cantidad de d�gitos del n�mero es:" + digitos); // mostramos la cantidad de d�gitos del n�mero
        //Cerramos el scanner
        leer.close();
    }

}
