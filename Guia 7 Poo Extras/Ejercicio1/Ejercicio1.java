package ejercicio1;

import ejercicio1.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor.
 * Se deberá definir además dos constructores: uno vacío que inicializa el
 * título y el autor a cadenas vacías y otro que reciba como parámetros el
 * título y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear una nueva instancia de la clase Cancion
        Cancion cancion1 = new Cancion();
        // Cargar datos de la canción usando el método cargarDatos
        cargarDatos(cancion1);
        // Mostrar información de la canción usando el método infoCancion
        infoCancion(cancion1);
    }

    public static void cargarDatos(Cancion pista) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Pedir al usuario el nombre del artista y almacenarlo en el objeto Cancion
        System.out.println("Ingrese el nombre del artista:");
        pista.setAutor(leer.next());
        // Pedir al usuario el nombre de la canción y almacenarlo en el objeto Cancion
        System.out.println("Ingrese el nombre de la canción:");
        pista.setTitulo(leer.next());
    }

    public static void infoCancion(Cancion pista) {
        // Crear una cadena de caracteres que contiene un número de barras igual al doble de la longitud de la cadena más larga, más un 30% adicional
        String barras = "";
        if (pista.getTitulo().length() > pista.getAutor().length()) {
            for (int i = 0; i < (pista.getTitulo().length()*1.3); i++) {
                barras += "_";
            }
        } else {
            for (int i = 0; i < (pista.getAutor().length()*1.3); i++) {
                barras += "_";
            }
        }
        // Imprimir la información de la canción, incluyendo el nombre del artista, el nombre de la canción y las barras
        System.out.println(barras + "\nDetalles de la canción:\n" + barras
                + "\nArtista: " + pista.getAutor()
                + "\nCanción: " + pista.getTitulo()
                + "\n" + barras);
    }

}

