package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 *
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 *
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 *
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        //Creamos el objeto leer de tipo Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        
        //Declaramos una variable para leer el lado del cuadrado
        int lado;
        
        // Solicitamos al usuario que ingrese el tamaño del lado del cuadrado
        System.out.println("Ingrese el tamaño del lado del cuadrado:");
        lado = leer.nextInt();
        
        // Recorremos las filas del cuadrado
        for (int i = 1; i <= lado; i++) {
            // Recorremos las columnas del cuadrado
            for (int j = 1; j <= lado; j++) {
                
                // Si estamos en el borde superior, borde inferior o en alguno de los bordes laterales, imprimimos un asterisco
                if ((i == 1) || (i == lado) || (j == 1) || (j == lado)) {
                    System.out.print("* ");
                    
                } else { 
                    // De lo contrario, imprimimos un espacio en blanco
                    System.out.print("  ");
                }
            }
            System.out.println(); // Saltamos de línea para comenzar la siguiente fila
        }
        //Cerramos el Scanner
        leer.close();
    }

}

