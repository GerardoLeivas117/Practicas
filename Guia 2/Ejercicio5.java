package ejercicio5;

import java.util.Scanner;

/**
 * @author Gerardo
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //Usamos una variable tipo Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        //Declaramos una variable para el número entero
        int numero1;
        //Solicitamos el ingreso de un numero entero por teclado
        System.out.print("Ingrese un número entero: ");
        numero1 = leer.nextInt();
        //Mostramos por pantalla el doble
        System.out.println("El doble del número es: "+(2*numero1));
        //Mostramos por pantalla el triple
        System.out.println("El triple del número es: "+(3*numero1));
        //Mostramos por pantalla su ráiz cuadrada de ser posible
        if(numero1<0){
            System.out.println("No existen raíces cuadradas de números negativos");
        }else{
            //Usamos String.format para informar solo 4 decimales
            System.out.println("La raíz cuadrada número es: "+String.format("%.4f",(Math.sqrt(numero1))));
        }
        //Cerramos el Scanner
        leer.close();
    }

}
