package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 *
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vectorDeDigitos = new int[5]; // Declara un nuevo arreglo llamado "vectorDeDigitos" con capacidad para almacenar 5 enteros.

        int tamanio = 0; // Inicializa la variable "tamanio" en 0.
        boolean numeroEsCorrecto = false; // Inicializa la variable "numeroEsCorrecto" en false.
        String valorDeEntrada; // Declara una nueva variable de tipo String llamada "valorDeEntrada".
        while (numeroEsCorrecto == false) { // Inicia un bucle while que se ejecutará mientras "numeroEsCorrecto" sea false.
            try { // Inicia un bloque try-catch para manejar excepciones.
                valorDeEntrada = JOptionPane.showInputDialog("Ingrese un tamaño para el vector:"); // Muestra un diálogo de entrada que le pide al usuario que ingrese el tamaño deseado para el vector.
                if (valorDeEntrada == null) { // Si el usuario presiona "Cancelar", el diálogo de entrada devolverá "null".
                    return; // Si "valorDeEntrada" es null, la aplicación finaliza.
                } else {
                    tamanio = (int) Integer.parseInt(valorDeEntrada); // Convierte el valor ingresado por el usuario a un entero y lo asigna a la variable "tamanio".
                    if (0 > tamanio) { // Si "tamanio" es menor que 0, se muestra un mensaje de error al usuario.
                        JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0.");
                    } else {
                        numeroEsCorrecto = true; // Si "tamanio" es mayor o igual a 0, se establece "numeroEsCorrecto" en true y se sale del bucle while.
                    }
                }
            } catch (Exception e) { // Si se produce una excepción en el bloque try, se captura y se maneja en este bloque catch.
                JOptionPane.showMessageDialog(null, "Error: ingreso inválido."); // Si se produce una excepción, se muestra un mensaje de error al usuario.
            }
        }

        long[] vector1 = new long[tamanio]; // Crea un nuevo arreglo llamado "vector1" con una capacidad igual al valor de "tamanio" que ingresó el usuario.

        llenarVectorAleatorio(vector1); // Llama a un método llamado "llenarVectorAleatorio" y le pasa el arreglo "vector1".

        for (int i = 0; i < vector1.length; i++) { // Inicia un bucle for que se ejecuta para cada elemento en "vector1".

            /**
             * Llama a un método llamado "contadorDeDigitos" y le pasa el valor
             * actual de "vector1[i]". Luego, decrementa 1 del valor retornado
             * por "contadorDeDigitos" y lo utiliza como índice en
             * "vectorDeDigitos", incrementando el valor en 1.
             */
            vectorDeDigitos[contadorDeDigitos(vector1[i]) - 1]++;
        }

        JOptionPane.showMessageDialog(null, "La cantidad de números con:"
                + "\n1 Dígito  :" + vectorDeDigitos[0] // Muestra la cantidad de números con un solo dígito.
                + "\n2 Dígitos :" + vectorDeDigitos[1] // Muestra la cantidad de números con dos dígitos.
                + "\n3 Dígitos :" + vectorDeDigitos[2] // Muestra la cantidad de números con tres dígitos.
                + "\n4 Dígitos :" + vectorDeDigitos[3] // Muestra la cantidad de números con cuatro dígitos.
                + "\n5 Dígitos :" + vectorDeDigitos[4]); // Muestra la cantidad de números con cinco dígitos.
    }

    public static int contadorDeDigitos(long numero) {
        int digitos = 0;
        // Si el número es igual a cero, tiene un solo dígito, así que devolvemos 1
        if (numero == 0) {
            return 1;
        } else {
            // mientras el número sea mayor que cero, vamos contando sus dígitos y dividiéndolo por 10 para avanzar al siguiente dígito
            while (numero > 0) {
                digitos++;
                numero /= 10;
            }
        }
        return digitos;
    }

    public static void llenarVectorAleatorio(long[] vector) {
        // Llenamos el vector con números aleatorios de hasta 5 dígitos
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (long) (Math.random() * 99999);
        }
    }

}
