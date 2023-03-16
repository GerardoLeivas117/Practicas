package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 * Crea una aplicaci�n que a trav�s de una funci�n nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a d�lares,
 * yenes o libras. La funci�n tendr� como par�metros, la cantidad de euros y la
 * moneda a convertir que ser� una cadena, este no devolver� ning�n valor y
 * mostrar� un mensaje indicando el cambio (void). El cambio de divisas es: *
 * Dolar a euro = 0,94 Dolar a yen = 133,10 Dolar a libra = 0,83
 */
public class Ejercicio3 {

public static void main(String[] args) {
    // Definimos las opciones de monedas y los tipos de cambio correspondientes
    String[] tipoDeMonedas = {"Euro", "Libra", "Yen"};
    Double[] tipoDeCambio = {0.94, 0.83, 133.10};
    
    // Variables para guardar la selecci�n del usuario y la cantidad de d�lares a convertir
    String moneda = "";
    double cantidad;
    
    // Mostramos el men� y guardamos la selecci�n del usuario
    int seleccion = Menu(tipoDeMonedas);

    // Seg�n la selecci�n del usuario, asignamos la moneda correspondiente
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
            // Si la selecci�n no es v�lida, salimos del programa
            return;
    }
    
    // Pedimos al usuario que ingrese la cantidad en d�lares a convertir
    cantidad = ingresoDeDinero();

    // Realizamos la conversi�n y mostramos el resultado
    conversorDeCambios(cantidad, tipoDeCambio[seleccion], moneda);
}


    /**
     * Funci�n que solicita al usuario la cantidad de dinero a convertir desde
     * d�lares a la moneda seleccionada.
     *
     * @return cantidad de dinero en d�lares ingresada por el usuario.
     */
    private static double ingresoDeDinero() {
        double dinero; // variable para almacenar la cantidad de dinero ingresada por el usuario.
        String valor; // variable para almacenar el valor de la entrada de usuario.
        while (true) { // ciclo que se repite hasta que se ingresa un valor v�lido.
            try {
                valor = JOptionPane.showInputDialog(null, "Introduzca la cantidad en Dolares:"); // se muestra un di�logo para que el usuario ingrese un valor.
                if (valor == null) { // si el usuario cancela el di�logo, se retorna 0.0
                    return 0.0;
                }
                dinero = Double.parseDouble(valor); // se intenta convertir la entrada de usuario en un n�mero decimal.
                break; // si se logra convertir el valor, se rompe el ciclo.
            } catch (Exception e) { // si ocurre un error al convertir el valor de entrada, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "Error:Entrada Inv�lida");
            }
        }
        return dinero; // se retorna la cantidad de dinero ingresada por el usuario.
    }

    /**
     * Convierte una cantidad de d�lares a la moneda especificada y muestra un
     * mensaje con el resultado.
     *
     * @param cantidad la cantidad de d�lares a convertir
     * @param cotizacion el tipo de cambio de d�lares a la moneda deseada
     * @param moneda la abreviatura de la moneda a la que se va a convertir (por
     * ejemplo, "EUR" para Euros)
     */
    private static void conversorDeCambios(double cantidad, double cotizacion, String moneda) {
        if (cantidad != 0) { // Verifica si la cantidad ingresada es distinta de cero
            JOptionPane.showMessageDialog(null, cantidad + " Dolares son " + (cantidad * cotizacion) + " " + moneda);
            // Muestra un mensaje con el resultado de la conversi�n
        } else {
            return; // Si la cantidad es cero, no se realiza ninguna conversi�n y la funci�n retorna
        }
    }

    /**
     * M�todo que muestra un di�logo de opciones para que el usuario seleccione
     * una moneda a la que desea convertir.
     *
     * @param tipoDeMonedas arreglo de cadenas que contiene las opciones del
     * men�.
     * @return un entero que representa la opci�n seleccionada por el usuario.
     */
    private static int Menu(String[] tipoDeMonedas) {
        return JOptionPane.showOptionDialog(
                null, // el componente padre, en este caso, es nulo
                "Seleccione la moneda a la que desea convertir:", // mensaje del di�logo
                "Menu de Divisas", // t�tulo del di�logo
                JOptionPane.DEFAULT_OPTION, // tipo de opci�n por defecto
                JOptionPane.PLAIN_MESSAGE, // tipo de mensaje
                null, // icono personalizado
                tipoDeMonedas, // arreglo de opciones
                tipoDeMonedas[0]);  // opci�n por defecto
    }

}
