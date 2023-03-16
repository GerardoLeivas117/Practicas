package ejercicio13extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de
 * n�meros comience en uno y termine en el n�mero de la l�nea. Solicitar la
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * n�mero 3: 1 12 123
 */
public class Ejercicio13Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int altura = 0; // variable para guardar la altura de la escalera
        StringBuilder secuencia = new StringBuilder(); // variable para construir la secuencia
        System.out.println("Ingrese la altura de su escalera:");

        // Validar entrada del usuario
        while (altura <= 0) { // mientras la altura no sea un n�mero entero positivo mayor que cero
            try {
                altura = leer.nextInt(); // intentar leer un entero desde la entrada del usuario
                if (altura <= 0) { // si la altura es menor o igual a cero
                    System.out.println("La altura debe sermayor que cero. Int�ntalo de nuevo:"); // imprimir mensaje de error
                }
            } catch (Exception e) { // si la entrada no es un entero
                System.out.println("Ingreso inv�lido, debe ingresar un n�mero positivo mayor a 0.\n"
                        + "Int�ntalo de nuevo:"); // imprimir mensaje de error
                leer.next(); // descartar la entrada no v�lida
            }
        }

        // Construir la secuencia
        for (int i = 1; i <= altura; i++) { // para cada n�mero desde 1 hasta la altura ingresada por el usuario
            secuencia.append(i); // agregar el n�mero a la secuencia
            System.out.println(secuencia.toString()); // imprimir la secuencia actual
        }

        leer.close(); // cerrar el objeto Scanner
    }
}
