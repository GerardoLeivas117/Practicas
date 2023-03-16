package ejercicio1;
import java.util.Scanner;
/**
 * @author Gerardo
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Usamos la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        //Declaramos dos variables para los números enteros y una para el resultado de la suma
        int numero1,numero2,resultado;
        //Solicitamos que nos ingresen valores por teclado
        System.out.println("Ingrese un valor para numero 1");
        numero1 = leer.nextInt(); // Parse String a Int
        System.out.println("Ingrese un valor para numero 2");
        numero2 = leer.nextInt();
        //Realizamos la suma y guardamos su resultado
        resultado = numero1 + numero2;
        //Informamos el resultado
        System.out.println(numero1+"+"+numero2+"="+resultado);
        //Cerramos el Scanner
        leer.close();
    }

}
