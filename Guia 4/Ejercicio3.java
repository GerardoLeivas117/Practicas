package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: *
 * Dolar a euro = 0,94 Dolar a yen = 133,10 Dolar a libra = 0,83
 */
public class Ejercicio3 {

public static void main(String[] args) {
    // Definimos las opciones de monedas y los tipos de cambio correspondientes
    String[] tipoDeMonedas = {"Euro", "Libra", "Yen"};
    Double[] tipoDeCambio = {0.94, 0.83, 133.10};
    
    // Variables para guardar la selección del usuario y la cantidad de dólares a convertir
    String moneda = "";
    double cantidad;
    
    // Mostramos el menú y guardamos la selección del usuario
    int seleccion = Menu(tipoDeMonedas);

    // Según la selección del usuario, asignamos la moneda correspondiente
    switch (seleccion) {
        case 0: // Euro
            moneda = "Euros";
            break;
        case 1: // Libra
            moneda = "Libras";
            break;
        case 2: // Yen
            moneda = "Yenes";
            break;
        default:
            // Si la selección no es válida, salimos del programa
            return;
    }
    
    // Pedimos al usuario que ingrese la cantidad en dólares a convertir
    cantidad = ingresoDeDinero();

    // Realizamos la conversión y mostramos el resultado
    conversorDeCambios(cantidad, tipoDeCambio[seleccion], moneda);
}


    /**
     * Función que solicita al usuario la cantidad de dinero a convertir desde
     * dólares a la moneda seleccionada.
     *
     * @return cantidad de dinero en dólares ingresada por el usuario.
     */
    private static double ingresoDeDinero() {
        double dinero; // variable para almacenar la cantidad de dinero ingresada por el usuario.
        String valor; // variable para almacenar el valor de la entrada de usuario.
        while (true) { // ciclo que se repite hasta que se ingresa un valor válido.
            try {
                valor = JOptionPane.showInputDialog(null, "Introduzca la cantidad en Dolares:"); // se muestra un diálogo para que el usuario ingrese un valor.
                if (valor == null) { // si el usuario cancela el diálogo, se retorna 0.0
                    return 0.0;
                }
                dinero = Double.parseDouble(valor); // se intenta convertir la entrada de usuario en un número decimal.
                break; // si se logra convertir el valor, se rompe el ciclo.
            } catch (Exception e) { // si ocurre un error al convertir el valor de entrada, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "Error:Entrada Inválida");
            }
        }
        return dinero; // se retorna la cantidad de dinero ingresada por el usuario.
    }

    /**
     * Convierte una cantidad de dólares a la moneda especificada y muestra un
     * mensaje con el resultado.
     *
     * @param cantidad la cantidad de dólares a convertir
     * @param cotizacion el tipo de cambio de dólares a la moneda deseada
     * @param moneda la abreviatura de la moneda a la que se va a convertir (por
     * ejemplo, "EUR" para Euros)
     */
    private static void conversorDeCambios(double cantidad, double cotizacion, String moneda) {
        if (cantidad != 0) { // Verifica si la cantidad ingresada es distinta de cero
            JOptionPane.showMessageDialog(null, cantidad + " Dolares son " + (cantidad * cotizacion) + " " + moneda);
            // Muestra un mensaje con el resultado de la conversión
        } else {
            return; // Si la cantidad es cero, no se realiza ninguna conversión y la función retorna
        }
    }

    /**
     * Método que muestra un diálogo de opciones para que el usuario seleccione
     * una moneda a la que desea convertir.
     *
     * @param tipoDeMonedas arreglo de cadenas que contiene las opciones del
     * menú.
     * @return un entero que representa la opción seleccionada por el usuario.
     */
    private static int Menu(String[] tipoDeMonedas) {
        return JOptionPane.showOptionDialog(
                null, // el componente padre, en este caso, es nulo
                "Seleccione la moneda a la que desea convertir:", // mensaje del diálogo
                "Menu de Divisas", // título del diálogo
                JOptionPane.DEFAULT_OPTION, // tipo de opción por defecto
                JOptionPane.PLAIN_MESSAGE, // tipo de mensaje
                null, // icono personalizado
                tipoDeMonedas, // arreglo de opciones
                tipoDeMonedas[0]);  // opción por defecto
    }

}
