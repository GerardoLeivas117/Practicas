package ejercicio1extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Dado un tiempo en minutos, calcular su equivalente en d�as y horas. Por
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 d�a, 2 horas.
 */
public class Ejercicio1Extras {

    public static void main(String[] args) {
        //Creamos un objeto Scanner leer para leer datos por teclado
        Scanner leer = new Scanner(System.in);
        
        //Declaramos las variables para el programa
        int minutos,dias,horas,minutosRestantes;
        
        // Pedimos al usuario que ingrese el tiempo en minutos
        System.out.println("Ingrese un tiempo en minutos:");
        minutos = leer.nextInt();

        // Calculamos los d�as, horas y minutos equivalentes
        dias = minutos / (24 * 60); // 1 d�a = 24 horas * 60 minutos
        
        horas = (minutos % (24 * 60)) / 60; // Las horas son el resto de la divisi�n entre minutos y el n�mero de minutos en un d�a (24 horas * 60 minutos)
        
        minutosRestantes = minutos % 60; // Los minutos restantes son el resto de la divisi�n entre minutos y 60 (n�mero de minutos en una hora)

        // Imprimimos el resultado
        System.out.println(minutos + " minutos equivalen a " + dias + " d�as, " + horas + " horas y " + minutosRestantes + " minutos.");
        
        //Cerramos el scanner
        leer.close();
    }

}
