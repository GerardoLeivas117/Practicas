package ejercicio2.servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

public class Servicio {

    /**
     * Este método recibe como parámetro un objeto de tipo Circunferencia y
     * utiliza la clase Scanner para leer la entrada del usuario y asignarla al
     * radio del objeto Circunferencia. Si se ingresa un valor no numérico o
     * negativo, se mostrará un mensaje de error y se volverá a solicitar la
     * entrada. Si se ingresa un valor válido, se asigna al radio del objeto
     * Circunferencia y se sale del bucle.
     */
    public static void crearCircunferencia(Circunferencia circ) {
        Scanner leer = new Scanner(System.in);
        String entrada;
        System.out.println("Ingrese el radio de la circunferencia:");
        while (true) {
            try {
                entrada = leer.next().replace(",", ".");
                circ.setRadio(Double.parseDouble(entrada));
                if (circ.getRadio() > 0) {
                    break;
                } else {
                    System.out.println("El valor ingresado debe ser mayor a 0.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
            }
        }
    }
}

