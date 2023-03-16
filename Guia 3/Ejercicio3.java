
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Realizar un programa que solo permita introducir solo frases o palabras de 8
 * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberaì
 * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 * se deberaì imprimir “INCORRECTO”. Nota: investigar la funcioìn Lenght() en
 * Java.
 */
public class Ejercicio3 {
    final static int LONGITUD_CORTE=8; // Definir la longitud de corte como constante
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); // Crear un objeto Scanner
        
        String palabra;//Definimos una variable tipo String para guardar las palabras ingresadas por teclado
        
        do{ 
            System.out.println("Ingrese una palabra:"); // Solicitar entrada de usuario
            
            palabra = leer.next(); // Leer la siguiente palabra
            
            if(palabra.length()==LONGITUD_CORTE){ // Si la longitud es correcta, imprimir "Correcto"
                System.out.println("Correcto");
                
            }else{ // Si la longitud es incorrecta, imprimir "Incorrecto"
                System.out.println("Incorrecto");
                
            }
        }while(palabra.length()==LONGITUD_CORTE); // Continuar el ciclo hasta que la longitud de la palabra sea incorrecta
        
        leer.close(); // Cerrar el objeto Scanner
    }
}

