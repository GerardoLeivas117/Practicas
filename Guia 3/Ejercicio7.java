package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Gerardo 
 * Realizar un programa que simule el funcionamiento de un
 * dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el
 * usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un
 * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el
 * último tiene que ser una O. Las secuencias leídas que respeten el formato se
 * consideran correctas, la secuencia especial “&&&&&” marca el final de los
 * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el
 * formato se considera incorrecta. Al finalizar el proceso, se imprime un
 * informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals().
 */
import java.util.Scanner;

public class Ejercicio7 {
    // Se definen las constantes que se utilizarán en el programa
    final static String FDE = "&&&&&"; // Cadena especial que indica el fin de las lecturas
    final static String F_INICIO = "X"; // Primer carácter que debe tener una cadena válida
    final static String F_FINAL = "O"; // Último carácter que debe tener una cadena válida

    public static void main(String[] args) {
        //Usamos leer como Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        
        //Declaramos las variables para contar los tipos de lecturas
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        
        //Declaramos e inicializamos un string cadena para guardar el codigo ingresador por teclado
        String cadena = "";
        
        
        // Se utiliza un ciclo while para leer las cadenas ingresadas por el usuario
        // hasta que se ingrese la cadena especial FDE
        while (!cadena.equals(FDE)) {
            
            System.out.println("Ingrese una cadena: ");
            cadena = leer.nextLine();
            
            // Si la cadena cumple con el formato requerido, se incrementa el contador de lecturas correctas
            if (cadena.length() == 5 && cadena.substring(0,1).equalsIgnoreCase(F_INICIO) && 
                    cadena.substring(4,5).equalsIgnoreCase(F_FINAL)) {
                lecturasCorrectas++;
                
            // Si la cadena no cumple con el formato y no es la cadena especial FDE, se incrementa el contador de lecturas incorrectas
            } else if(!cadena.equals(FDE)) {
                lecturasIncorrectas++;
            }
        }
        
        // Se imprime el informe con la cantidad de lecturas correctas e incorrectas
        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
        
        //Cerramos el scanner
        leer.close();
    }
}

