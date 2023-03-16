package ejercicio8extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Escriba un programa que lea n�meros enteros. Si el n�mero es m�ltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de n�meros le�dos, la
 * cantidad de n�meros pares y la cantidad de n�meros impares. Al igual que en
 * el ejercicio anterior los n�meros negativos no deben sumarse. Nota: recordar
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
        //creamos un bucle while para leer n�meros hasta que venga un m�ltiplo de 5
        while (true) {
            while (true) {
                try {
                    System.out.println("Ingrese un n�mero:");
                    ingreso = leer.next();
                    numero1 = (int) Integer.parseInt(ingreso);
                    if (numero1>=0 || numero1<0) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("El valor ingresado es inv�lido.");

                }
            }
            if (numero1 % 5 == 0) {
                break;
            } else {
                if (numero1 > 0) {
                    cantidadLeidos++;
                    if (numero1 % 2 == 0) {
                        System.out.println("El n�mero es par.");
                        cantidadPares++;
                    } else {
                        System.out.println("El n�mero es impar.");
                        cantidadImpares++;
                    }
                }
            }

        }
        System.out.println("La cantidad de n�meros le�dos es de: " + cantidadLeidos);
        System.out.println("La cantidad de n�meros pares es de: " + cantidadPares);
        System.out.println("La cantidad de n�meros impares es de: " + cantidadImpares);

    }

}
