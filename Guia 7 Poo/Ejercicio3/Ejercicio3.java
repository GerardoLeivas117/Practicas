package ejercicio3;

import ejercicio3.entidades.Operacion;
import ejercicio3.servicios.Servicio;

/**
 *
 * @author Gerardo
 *
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuaci�n, se deben crear los siguientes m�todos: a) M�todo
 * constructor con todos los atributos pasados por par�metro. b) M�todo
 * constructor sin los atributos pasados por par�metro. c) M�todos get y set. d)
 * M�todo para crearOperacion(): que le pide al usuario los dos n�meros y los
 * guarda en los atributos del objeto. e) M�todo sumar(): calcular la suma de
 * los n�meros y devolver el resultado al main. f) M�todo restar(): calcular la
 * resta de los n�meros y devolver el resultado al main g) M�todo multiplicar():
 * primero valida que no se haga una multiplicaci�n por cero, si fuera a
 * multiplicar por cero, el m�todo devuelve 0 y se le informa al usuario el
 * error. Si no, se hace la multiplicaci�n y se devuelve el resultado al main h)
 * M�todo dividir(): primero valida que no se haga una divisi�n por cero, si
 * fuera a pasar una divisi�n por cero, el m�todo devuelve 0 y se le informa al
 * usuario el error se le informa al usuario.no, se hace la divisi�n y se
 * devuelve el resultado al main.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // Crea un nuevo objeto Operacion para realizar c�lculos
        Operacion oper1 = new Operacion();

        // Llama al m�todo menuDeOperaciones de la clase Servicio para mostrar el men� y realizar operaciones
        Servicio.menuDeOperaciones(oper1);
    }

}
