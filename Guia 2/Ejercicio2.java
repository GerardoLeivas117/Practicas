package ejercicio2;
import java.util.Scanner;
/**
 * @author Gerardo 
 * Escribir un programa que pida tu nombre, lo guarde en una
 * variable y lo muestre por pantalla.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Usamos una variable tipo Scanner con delimiter para leer el nombre completo
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Declaramos una variable tipo String para guardar nuestro nombre
        String nombre;
        //Solicitamos que nos ingrese el nombre por teclado y lo guardamos en nombre
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        //Mostramos nuestro nombre por pantalla
        System.out.println("Tu nombre es: "+nombre);
        //Cerramos el Scanner
        leer.close();
    }

}
