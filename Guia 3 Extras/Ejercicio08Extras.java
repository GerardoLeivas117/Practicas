package ejercicio8extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 *
 */
public class Ejercicio8Extras {

    public static void main(String[] args) {

        //Instanciamos un objeto tipo Scanner llamado leer para obtener datos por teclado
        Scanner leer = new Scanner(System.in);

        //Declaramos una variable tipo entero para guardar los valores ingresados por teclado
        int numero1, cantidadLeidos = 0, cantidadPares = 0, cantidadImpares = 0;
        String ingreso;
        //creamos un bucle while para leer números hasta que venga un múltiplo de 5
        while (true) {
            while (true) {
                try {
                    System.out.println("Ingrese un número:");
                    ingreso = leer.next();
                    numero1 = (int) Integer.parseInt(ingreso);
                    if (numero1>=0 || numero1<0) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("El valor ingresado es inválido.");

                }
            }
            if (numero1 % 5 == 0) {
                break;
            } else {
                if (numero1 > 0) {
                    cantidadLeidos++;
                    if (numero1 % 2 == 0) {
                        System.out.println("El número es par.");
                        cantidadPares++;
                    } else {
                        System.out.println("El número es impar.");
                        cantidadImpares++;
                    }
                }
            }

        }
        System.out.println("La cantidad de números leídos es de: " + cantidadLeidos);
        System.out.println("La cantidad de números pares es de: " + cantidadPares);
        System.out.println("La cantidad de números impares es de: " + cantidadImpares);

    }

}
