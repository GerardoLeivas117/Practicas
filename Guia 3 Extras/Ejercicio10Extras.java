package ejercicio10extras;

/**
 *
 * @author Gerardo
 *
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicaci�n entre dos n�meros generados aleatoriamente entre 0 y 10. El
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
 * la funci�n Math.random() de Java.
 */

import java.util.Scanner;

public class Ejercicio10Extras {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Generar dos n�meros aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        
        // Calcular el resultado de la multiplicaci�n
        int resultado = num1 * num2;
        
        System.out.println("Adivine el resultado de la siguiente multiplicaci�n:");
        System.out.print(num1 + " x " + num2 + " = ");
        
        // Leer la respuesta del usuario
        int respuesta = leer.nextInt();
        
        // Mientras la respuesta sea incorrecta, pedir al usuario que ingrese de nuevo
        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta. Intente de nuevo.");
            System.out.print(num1 + " x " + num2 + " = ");
            respuesta = leer.nextInt();
        }
        
        // Si la respuesta es correcta, mostrar un mensaje de felicitaci�n
        System.out.println("�Correcto! Felicitaciones.");
        
        //Cerramos el Scanner
        leer.close();
    }
}
