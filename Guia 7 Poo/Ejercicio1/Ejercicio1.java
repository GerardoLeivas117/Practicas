package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Se crea una instancia de la clase Libro llamada lib1
        Libro lib1 = new Libro();

        // Se llama al método cargarLibro de la clase Servicio y se le pasa la 
        //instancia de la clase Libro como parámetro para que se carguen los datos
        Servicio.cargarLibro(lib1);

        // Se imprime la información del libro utilizando el método toString
        System.out.println(lib1.toString());
    }
}
