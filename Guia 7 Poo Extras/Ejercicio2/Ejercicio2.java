package ejercicio2;

import ejercicio2.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. d = rc((x2 - x1)^2 + (y2 - y1)^2)
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        cargarPuntos(puntos); // Llama al método para cargar los puntos
        System.out.println(puntos.toString()); // Imprime los puntos ingresados
        System.out.println("La distancia entre los puntos:\nd=rc( " + puntos.getX1() + " - " + puntos.getX2() + " )^2 + "
                + "( " + puntos.getY1() + " - " + puntos.getY2() + " )^2 ) =" + puntos.distanciaEntrePuntos()); // Calcula e imprime la distancia entre los puntos
    }

    public static void cargarPuntos(Puntos coords) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese el valor para x1:");
        coords.setX1(ingresoValido(leer)); // Llama al método ingresoValido para validar y cargar el valor ingresado por el usuario
        System.out.println("Ingrese el valor para y1:");
        coords.setY1(ingresoValido(leer));
        System.out.println("Ingrese el valor para x2:");
        coords.setX2(ingresoValido(leer));
        System.out.println("Ingrese el valor para y2:");
        coords.setY2(ingresoValido(leer));
        leer.close(); // Cierra el objeto Scanner
    }

    private static double ingresoValido(Scanner scanner) {
        String entrada;
        double retorno = 0;
        while (true) {
            try {
                entrada = scanner.next().replace(",", "."); // Reemplaza las comas por puntos para que la entrada sea válida para Double.parseDouble
                retorno = Double.parseDouble(entrada); // Intenta parsear la entrada como un número Double
                break;
            } catch (Exception e) {
                System.out.print("Error:Ingreso inválido. Intente nuevamente:"); // Imprime un mensaje de error si la entrada no es válida
                scanner.nextLine(); // Limpia el buffer del objeto Scanner
            }
        }
        return retorno;
    }

}
