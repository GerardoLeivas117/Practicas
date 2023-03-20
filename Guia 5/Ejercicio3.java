package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 *
 * Recorrer un vector de N enteros contabilizando cu�ntos n�meros son de 1
 * d�gito, cu�ntos de 2 d�gitos, etc�tera (hasta 5 d�gitos).
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vectorDeDigitos = new int[5]; // Declara un nuevo arreglo llamado "vectorDeDigitos" con capacidad para almacenar 5 enteros.

        int tamanio = 0; // Inicializa la variable "tamanio" en 0.
        boolean numeroEsCorrecto = false; // Inicializa la variable "numeroEsCorrecto" en false.
        String valorDeEntrada; // Declara una nueva variable de tipo String llamada "valorDeEntrada".
        while (numeroEsCorrecto == false) { // Inicia un bucle while que se ejecutar� mientras "numeroEsCorrecto" sea false.
            try { // Inicia un bloque try-catch para manejar excepciones.
                valorDeEntrada = JOptionPane.showInputDialog("Ingrese un tama�o para el vector:"); // Muestra un di�logo de entrada que le pide al usuario que ingrese el tama�o deseado para el vector.
                if (valorDeEntrada == null) { // Si el usuario presiona "Cancelar", el di�logo de entrada devolver� "null".
                    return; // Si "valorDeEntrada" es null, la aplicaci�n finaliza.
                } else {
                    tamanio = (int) Integer.parseInt(valorDeEntrada); // Convierte el valor ingresado por el usuario a un entero y lo asigna a la variable "tamanio".
                    if (0 > tamanio) { // Si "tamanio" es menor que 0, se muestra un mensaje de error al usuario.
                        JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0.");
                    } else {
                        numeroEsCorrecto = true; // Si "tamanio" es mayor o igual a 0, se establece "numeroEsCorrecto" en true y se sale del bucle while.
                    }
                }
            } catch (Exception e) { // Si se produce una excepci�n en el bloque try, se captura y se maneja en este bloque catch.
                JOptionPane.showMessageDialog(null, "Error: ingreso inv�lido."); // Si se produce una excepci�n, se muestra un mensaje de error al usuario.
            }
        }

        long[] vector1 = new long[tamanio]; // Crea un nuevo arreglo llamado "vector1" con una capacidad igual al valor de "tamanio" que ingres� el usuario.

        llenarVectorAleatorio(vector1); // Llama a un m�todo llamado "llenarVectorAleatorio" y le pasa el arreglo "vector1".

        for (int i = 0; i < vector1.length; i++) { // Inicia un bucle for que se ejecuta para cada elemento en "vector1".

            /**
             * Llama a un m�todo llamado "contadorDeDigitos" y le pasa el valor
             * actual de "vector1[i]". Luego, decrementa 1 del valor retornado
             * por "contadorDeDigitos" y lo utiliza como �ndice en
             * "vectorDeDigitos", incrementando el valor en 1.
             */
            vectorDeDigitos[contadorDeDigitos(vector1[i]) - 1]++;
        }

        JOptionPane.showMessageDialog(null, "La cantidad de n�meros con:"
                + "\n1 D�gito  :" + vectorDeDigitos[0] // Muestra la cantidad de n�meros con un solo d�gito.
                + "\n2 D�gitos :" + vectorDeDigitos[1] // Muestra la cantidad de n�meros con dos d�gitos.
                + "\n3 D�gitos :" + vectorDeDigitos[2] // Muestra la cantidad de n�meros con tres d�gitos.
                + "\n4 D�gitos :" + vectorDeDigitos[3] // Muestra la cantidad de n�meros con cuatro d�gitos.
                + "\n5 D�gitos :" + vectorDeDigitos[4]); // Muestra la cantidad de n�meros con cinco d�gitos.
    }

    public static int contadorDeDigitos(long numero) {
        int digitos = 0;
        // Si el n�mero es igual a cero, tiene un solo d�gito, as� que devolvemos 1
        if (numero == 0) {
            return 1;
        } else {
            // mientras el n�mero sea mayor que cero, vamos contando sus d�gitos y dividi�ndolo por 10 para avanzar al siguiente d�gito
            while (numero > 0) {
                digitos++;
                numero /= 10;
            }
        }
        return digitos;
    }

    public static void llenarVectorAleatorio(long[] vector) {
        // Llenamos el vector con n�meros aleatorios de hasta 5 d�gitos
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (long) (Math.random() * 99999);
        }
    }

}
