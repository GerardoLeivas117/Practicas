package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector:");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];  // Crear un arreglo de enteros del tamaño especificado por el usuario
        int totalVector = 0;  // Inicializar una variable para almacenar la suma de los elementos del vector

        for (int i = 0; i < vector.length; i++) {  // Recorrer el arreglo y pedir al usuario que ingrese cada elemento
            System.out.println("Ingrese un valor a cargar:(" + (i + 1) + "/" + vector.length + ")");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {  // Recorrer el arreglo y sumar los elementos
            totalVector += vector[i];
        }

        System.out.println("La suma total del vector es de: " + totalVector);  // Imprimir la suma total del vector
    }

}
