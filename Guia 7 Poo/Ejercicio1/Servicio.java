package ejercicio1.servicios;

import ejercicio1.entidades.Libro;
import java.util.Scanner;


public class Servicio {

    /**
     * Método que solicita al usuario los datos de un libro y los carga en el
     * objeto pasado por parámetro
     *
     * @param lib objeto de tipo Libro al cual se le van a cargar los datos
     * ingresados por el usuario
     */
    public static void cargarLibro(Libro lib) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Solicita al usuario el ISBN y lo setea en el objeto Libro pasado por parámetro
        System.out.println("Ingrese el ISBN:");
        lib.setIsbn(leer.next());

        // Solicita al usuario el título del libro y lo setea en el objeto Libro pasado por parámetro
        System.out.println("Ingrese el título del libro:");
        lib.setTitulo(leer.next());

        // Solicita al usuario el autor del libro y lo setea en el objeto Libro pasado por parámetro
        System.out.println("Ingrese el autor:");
        lib.setAutor(leer.next());

        // Solicita al usuario la cantidad de páginas del libro y lo setea en el objeto Libro pasado por parámetro
        System.out.println("Ingrese la cantidad de páginas:");
        lib.setCantPaginas(leer.nextInt());
    }

}
