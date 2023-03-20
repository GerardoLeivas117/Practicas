package ejercicio5;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 *
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {

    //Damos dimension a la matriz
    final static int TAMANIO = 5;

    public static void main(String[] args) {
        long[][] matriz = new long[TAMANIO][TAMANIO];
        long[][] matrizTranspuesta = new long[TAMANIO][TAMANIO];
        long[][] matrizAntisimetrica = new long[TAMANIO][TAMANIO];
        boolean antiSimetrica = true;
        //Llenamos la matriz original
        llenarMatrizAleatorio(matriz);
        if (tipoDeSolucion()) {
            //Generamos su transpuesta para validar el programa
            matrizTranspuesta = generarTranspuesta(matriz);
            matrizAntisimetrica = cambiarSignoMatriz(matrizTranspuesta);
        } else {
            //Generamos de manera aleatoria para informar falso en el programa la matriz transpuesta
            llenarMatrizAleatorio(matrizAntisimetrica);
        }
        //Comparamos los valores absolutos de cada elemento respetando la definición de matriz antisimetrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (Math.abs(matriz[i][j]) != (Math.abs(matrizAntisimetrica[j][i]))) {
                    antiSimetrica = false;
                }
            }
        }
        //Informamos los positivos y falsos
        if (antiSimetrica) {
            System.out.println("Las matrices son antisimétricas.");
        } else {
            System.out.println("Las matrices no son antisimétricas.");
        }

        //Mostramos por pantalla las matrices luego de informar
        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);
        System.out.println("Matriz 2");
        imprimirMatriz(matrizAntisimetrica);

    }
    
    
    
    /**
     * Carga con valores aleatorios una matriz, excepto en la diagonal principal
     * para respetar la definición de matriz transpuesta.
     * @param matriz 
     */
    public static void llenarMatrizAleatorio(long[][] matriz) {
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != j) {
                    matriz[i][j] = aleatorio.nextInt(21) - 10; // Genera un número aleatorio entre -100 y 100.
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

    }

    /**
     * Imprimime una matriz con formato celda y sus indices de coordenadas
     *
     * @param matriz
     */
    public static void imprimirMatriz(long[][] matriz) {

        System.out.print("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(String.format("%5d", i));

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[");
                System.out.print(String.format("%3d", matriz[i][j]));
                System.out.print("]");
            }
            System.out.println("");

        }
        System.out.println("\n\n");

    }

    /**
     * Genera la matriz transpuesta que recibe por parametro.
     *
     * @param matriz es recibida como parametro
     * @return devuelve la matriz transpuesta recibida por parametro
     */
    public static long[][] generarTranspuesta(long[][] matriz) {
        long[][] transpuesta = new long[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }

    /**
     * Cambia el signo de los elementos de la matriz recibida por parametro
     *
     * @param matrizTranspuesta
     * @return devuelve una matriz antisimetrica
     */
    private static long[][] cambiarSignoMatriz(long[][] matrizTranspuesta) {
        long[][] matriz = new long[matrizTranspuesta.length][matrizTranspuesta[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matrizTranspuesta[i][j] * -1;
            }
        }
        return matriz;
    }
    
    
    /**
     * Despliega una ventana que condiciona el flujo el programa para evaluar su 
     * funcionamiento.
     * @return devuelve verdadero si el usuario eligio el boton del Si o falso 
     * si eligio boton del No. 
     */
    public static boolean tipoDeSolucion() {
        String[] opciones = {"Sí", "No"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Quiere ver el resultado con la condición verdadera?", "Consulta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        boolean opcion;
        if (respuesta == JOptionPane.YES_OPTION) {
            opcion = true;
        } else {
            opcion = false;
        }

        return opcion;
    }

}
