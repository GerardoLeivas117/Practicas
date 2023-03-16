package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 */
public class Ejercicio2 {
    // Esta variable almacena la frase clave que se va a comparar con la frase ingresada por el usuario
    final static String FRASE_CLAVE="eureka";

    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        // Se declara la variable "frase" que almacenará la frase ingresada por el usuario
        String frase;
        
        // Se muestra un mensaje en consola pidiendo al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        
        // Se lee la frase ingresada por el usuario y se almacena en la variable "frase"
        frase = leer.next();
        
        // Se compara la frase ingresada por el usuario con la frase clave utilizando el método equalsIgnoreCase(),
        // que compara las dos cadenas de texto ignorando mayúsculas y minúsculas
        if(FRASE_CLAVE.equalsIgnoreCase(frase)){
            
            // Si la frase ingresada es igual a la frase clave, se muestra un mensaje indicando que es correcta
            System.out.println("Correcto");
            
        }else{
            
            // Si la frase ingresada es diferente a la frase clave, se muestra un mensaje indicando que es incorrecta
            System.out.println("Incorrecto");
            
        }
        
        // Se cierra el objeto Scanner para liberar los recursos utilizados
        leer.close();
    }
}

