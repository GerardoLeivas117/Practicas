package ejercicio4;

import java.util.Scanner;

/**
 * @author Gerardo 
 * Dada una cantidad de grados centígrados se debe mostrar su
 * equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9* C / 5).
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Usamos la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        //Declaramos variables de números reales para los grados
        float centigrados,farenheit;
        //Solicitamos que nos ingrese la temperatura en grados centígrados
        System.out.print("Ingrese la temperatura en grados centígrados:");
        centigrados = leer.nextFloat();
        //Usamos la función convertirAFarenheit para obtener el valor
        farenheit = convertirAFarenheit(centigrados);
        //Mostramos por pantalla el resultado
        //Usamos String.format para informar solo con 2 decimales
        System.out.println(String.format("%.2f", centigrados)+"° son "+
                String.format("%.2f", farenheit)+"°");
        //Cerramos el Scanner
        leer.close();
    }

    private static float convertirAFarenheit(float centig) {
        return 32+(9*(centig/5));
    }

}
