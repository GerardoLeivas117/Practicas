package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluir� un m�todo para
 * crear el rect�ngulo con los datos del Rect�ngulo dados por el usuario.
 * Tambi�n incluir� un m�todo para calcular la superficie del rect�ngulo y un
 * m�todo para calcular el per�metro del rect�ngulo. Por �ltimo, tendremos un
 * m�todo que dibujar� el rect�ngulo mediante asteriscos usando la base y la
 * altura. Se deber�n adem�s definir los m�todos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Per�metro =
 * (base + altura) * 2.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Crea un nuevo objeto Rectangulo
        Rectangulo rectang1 = new Rectangulo();

        /**
         * Llama al m�todo crearRectangulo de la clase Servicio para solicitar
         * al usuario la base y altura del rect�ngulo y establecerlas en el
         * objeto Rectangulo
         */
        Servicio.crearRectangulo(rectang1);

        // Imprime una representaci�n de cadena del objeto Rectangulo
        System.out.println(rectang1.toString());

        // Dibuja el rect�ngulo en la consola
        rectang1.dibujar();

        // Calcula y muestra la superficie del rect�ngulo
        System.out.println("Superficie:" + rectang1.superficie());

        // Calcula y muestra el per�metro del rect�ngulo
        System.out.println("Per�metro:" + rectang1.perimetro());
    }

}
