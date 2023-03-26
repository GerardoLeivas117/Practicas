package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuaci�n, se deben crear los siguientes m�todos: a)
 * M�todo constructor que inicialice el radio pasado como par�metro. b) M�todos
 * get y set para el atributo radio de la clase Circunferencia. c) M�todo para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. d) M�todo area(): para calcular el �rea de la circunferencia (Area=
 * ?*radio^2). e) M�todo perimetro(): para calcular el per�metro
 * (Perimetro=2*?*radio).
 */
public class Ejercicio2 {

    /**
     * El siguiente m�todo main es el punto de entrada del programa donde se
     * instancia un objeto Circunferencia y se utiliza el m�todo
     * crearCircunferencia del Servicio para cargar los datos del radio  y
     * luego se imprime la informaci�n de la circunferencia usando el m�todo
     * toString.
     */
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia();
        Servicio.crearCircunferencia(circ1);
        System.out.println(circ1.toString());
    }

}
