package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Crea un nuevo objeto Rectangulo
        Rectangulo rectang1 = new Rectangulo();

        /**
         * Llama al método crearRectangulo de la clase Servicio para solicitar
         * al usuario la base y altura del rectángulo y establecerlas en el
         * objeto Rectangulo
         */
        Servicio.crearRectangulo(rectang1);

        // Imprime una representación de cadena del objeto Rectangulo
        System.out.println(rectang1.toString());

        // Dibuja el rectángulo en la consola
        rectang1.dibujar();

        // Calcula y muestra la superficie del rectángulo
        System.out.println("Superficie:" + rectang1.superficie());

        // Calcula y muestra el perímetro del rectángulo
        System.out.println("Perímetro:" + rectang1.perimetro());
    }

}
