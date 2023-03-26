package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * T�tulo, Autor, N�mero de p�ginas, y un constructor con todos los atributos
 * pasados por par�metro y un constructor vac�o. Crear un m�todo para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro m�todo el
 * n�mero de ISBN, el t�tulo, el autor del libro y el n�mero de p�ginas.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Se crea una instancia de la clase Libro llamada lib1
        Libro lib1 = new Libro();

        // Se llama al m�todo cargarLibro de la clase Servicio y se le pasa la 
        //instancia de la clase Libro como par�metro para que se carguen los datos
        Servicio.cargarLibro(lib1);

        // Se imprime la informaci�n del libro utilizando el m�todo toString
        System.out.println(lib1.toString());
    }
}
