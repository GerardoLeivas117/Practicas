package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class Servicio {

    public static void crearRectangulo(Rectangulo rectang1) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Solicita al usuario que ingrese la base del rect�ngulo y la establece en el objeto Rectangulo suministrado
        System.out.println("Ingrese la base de su rect�ngulo:");
        rectang1.setBase(leer.nextDouble());

        // Solicita al usuario que ingrese la altura del rect�ngulo y la establece en el objeto Rectangulo suministrado
        System.out.println("Ingrese la altura de su rect�ngulo");
        rectang1.setAltura(leer.nextDouble());
    }

}
