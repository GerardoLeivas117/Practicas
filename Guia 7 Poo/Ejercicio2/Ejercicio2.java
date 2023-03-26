package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos: a)
 * Método constructor que inicialice el radio pasado como parámetro. b) Métodos
 * get y set para el atributo radio de la clase Circunferencia. c) Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. d) Método area(): para calcular el área de la circunferencia (Area=
 * ?*radio^2). e) Método perimetro(): para calcular el perímetro
 * (Perimetro=2*?*radio).
 */
public class Ejercicio2 {

    /**
     * El siguiente método main es el punto de entrada del programa donde se
     * instancia un objeto Circunferencia y se utiliza el método
     * crearCircunferencia del Servicio para cargar los datos del radio  y
     * luego se imprime la información de la circunferencia usando el método
     * toString.
     */
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia();
        Servicio.crearCircunferencia(circ1);
        System.out.println(circ1.toString());
    }

}
