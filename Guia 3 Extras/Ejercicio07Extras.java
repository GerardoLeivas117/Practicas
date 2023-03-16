package ejercicio7extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Realice un programa que calcule y visualice el valor m�ximo, el valor m�nimo
 * y el promedio de n n�meros (n>0). El valor de n se solicitar� al principio
 * del programa y los n�meros ser�n introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle �while� y otra con el bucle �do -
 * while�.
 */
import java.util.Scanner;

public class Ejercicio7Extras {

    public static void main(String[] args) {
        //Declaramos el objeto leer de la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        String entrada;
        int cantidadNumeros,i;
        double numero;
        // Inicializar variables para almacenar los valores m�ximo, m�nimo y promedio
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        double suma = 0.0;

        // Pedir al usuario que ingrese la cantidad de n�meros
        cantidadNumeros = 0;
        System.out.print("Ingrese la cantidad de n�meros: ");
        try {
            cantidadNumeros = leer.nextInt();
        } catch (Exception e) {
            System.out.println("El valor ingresado es inv�lido");
            return;
        }

        // Pedir al usuario que ingrese los n n�meros y realizar los c�lculos necesarios
        System.out.println("Ingrese los " + cantidadNumeros + " n�meros:");
        i = 0;
        while (i < cantidadNumeros) {
            while (true) {
                try {
                    System.out.println("Ingrese un n�mero:");
                    entrada = leer.next().replace(',', '.');
                    numero = Double.parseDouble(entrada);
                    break;
                } catch (Exception e) {
                    System.out.print("El valor ingresado es inv�lido. Intente nuevamente: ");
                }
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
            i++;
        }

        // Calcular el promedio
        double promedio = suma / cantidadNumeros;

        // Mostrar los resultados
        System.out.println("Valor m�ximo: " + maximo);
        System.out.println("Valor m�nimo: " + minimo);
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        // Repetir el proceso utilizando el bucle "do-while"
        System.out.println("Ejercicio con bucle do-while:");

        
        // Pedir al usuario que ingrese la cantidad de n�meros
        cantidadNumeros = 0;
        System.out.print("Ingrese la cantidad de n�meros: ");
        try {
            cantidadNumeros = leer.nextInt();
        } catch (Exception e) {
            System.out.println("El valor ingresado es inv�lido");
            return;
        }

        // Reiniciar las variables para almacenar los nuevos valores
        maximo = Double.MIN_VALUE;
        minimo = Double.MAX_VALUE;
        suma = 0.0;
        i = 0;
        

        // Pedir al usuario que ingrese los m n�meros y realizar los c�lculos necesarios
        System.out.println("Ingrese los " + cantidadNumeros + " n�meros:");
        do {
            while (true) {
                try {
                    System.out.println("Ingrese un n�mero:");
                    entrada = leer.next().replace(',', '.');
                    numero = Double.parseDouble(entrada);
                    break;
                } catch (Exception e) {
                    System.out.print("El valor ingresado es inv�lido. Intente nuevamente: ");
                }
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
            i++;
        } while (i < cantidadNumeros);

        // Calcular el promedio
        promedio = suma / cantidadNumeros;

        // Mostrar los resultados
        System.out.println("Valor m�ximo: " + maximo);
        System.out.println("Valor m�nimo: " + minimo);
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        // Cerrar el scanner
        leer.close();
    }
}
