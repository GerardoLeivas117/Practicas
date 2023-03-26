package ejercicio1.servicios;

import ejercicio1.entidades.Libro;
import java.util.Scanner;


public class Servicio {

    /**
     * M�todo que solicita al usuario los datos de un libro y los carga en el
     * objeto pasado por par�metro
     *
     * @param lib objeto de tipo Libro al cual se le van a cargar los datos
     * ingresados por el usuario
     */
    public static void cargarLibro(Libro lib) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Solicita al usuario el ISBN y lo setea en el objeto Libro pasado por par�metro
        System.out.println("Ingrese el ISBN:");
        lib.setIsbn(leer.next());

        // Solicita al usuario el t�tulo del libro y lo setea en el objeto Libro pasado por par�metro
        System.out.println("Ingrese el t�tulo del libro:");
        lib.setTitulo(leer.next());

        // Solicita al usuario el autor del libro y lo setea en el objeto Libro pasado por par�metro
        System.out.println("Ingrese el autor:");
        lib.setAutor(leer.next());

        // Solicita al usuario la cantidad de p�ginas del libro y lo setea en el objeto Libro pasado por par�metro
        System.out.println("Ingrese la cantidad de p�ginas:");
        lib.setCantPaginas(leer.nextInt());
    }

}
