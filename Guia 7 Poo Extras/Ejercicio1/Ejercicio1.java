package ejercicio1;

import ejercicio1.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Desarrollar una clase Cancion con los siguientes atributos: t�tulo y autor.
 * Se deber� definir adem�s dos constructores: uno vac�o que inicializa el
 * t�tulo y el autor a cadenas vac�as y otro que reciba como par�metros el
 * t�tulo y el autor de la canci�n. Se deber�n adem�s definir los m�todos
 * getters y setters correspondientes.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear una nueva instancia de la clase Cancion
        Cancion cancion1 = new Cancion();
        // Cargar datos de la canci�n usando el m�todo cargarDatos
        cargarDatos(cancion1);
        // Mostrar informaci�n de la canci�n usando el m�todo infoCancion
        infoCancion(cancion1);
    }

    public static void cargarDatos(Cancion pista) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Pedir al usuario el nombre del artista y almacenarlo en el objeto Cancion
        System.out.println("Ingrese el nombre del artista:");
        pista.setAutor(leer.next());
        // Pedir al usuario el nombre de la canci�n y almacenarlo en el objeto Cancion
        System.out.println("Ingrese el nombre de la canci�n:");
        pista.setTitulo(leer.next());
    }

    public static void infoCancion(Cancion pista) {
        // Crear una cadena de caracteres que contiene un n�mero de barras igual al doble de la longitud de la cadena m�s larga, m�s un 30% adicional
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
        // Imprimir la informaci�n de la canci�n, incluyendo el nombre del artista, el nombre de la canci�n y las barras
        System.out.println(barras + "\nDetalles de la canci�n:\n" + barras
                + "\nArtista: " + pista.getAutor()
                + "\nCanci�n: " + pista.getTitulo()
                + "\n" + barras);
    }

}

