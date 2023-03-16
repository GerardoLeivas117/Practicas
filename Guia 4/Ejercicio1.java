package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Crea una aplicaci�n que le pida dos n�meros al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicaci�n debe tener una
 * funci�n para cada operaci�n matem�tica y deben devolver sus resultados para
 * imprimirlos en el main.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        Double numero1, numero2;
        // Creamos un arreglo de opciones de operaci�n
        String[] seleccion = {"", "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR", "SALIR"};
        while (true) {
            // Leemos dos n�meros ingresados por el usuario
            numero1 = leerNumeros();
            numero2 = leerNumeros();
            // Mostramos el men� de operaciones y leemos la opci�n seleccionada por el usuario
            opcion = menu();
            System.out.println(seleccion[opcion]);
            switch (seleccion[opcion]) {
                // Realizamos la operaci�n correspondiente seg�n la opci�n seleccionada
                case "SUMAR":
                    System.out.println("El resultado es: " + sumarNumeros(numero1, numero2));
                    break;
                case "RESTAR":
                    System.out.println("El resultado es: " + restarNumeros(numero1, numero2));
                    break;
                case "MULTIPLICAR":
                    System.out.println("El resultado es: " + multiplicarNumeros(numero1, numero2));
                    break;
                case "DIVIDIR":
                    System.out.println("El resultado es: " + dividirNumeros(numero1, numero2));
                    break;
                case "SALIR":
                    // Pedimos confirmaci�n antes de salir del programa
                    System.out.println("Esta seguro de salir: S/N");
                    if (leer.next().toLowerCase().equals("s")) {
                        // Cerramos el objeto Scanner
                        leer.close();
                        return;
                    }
                    break;
            }

        }

    }

    /**
     * Lee un n�mero ingresado por el usuario desde la entrada est�ndar. Si el
     * usuario ingresa un valor inv�lido, se muestra un mensaje de error y se
     * pide un nuevo valor.
     *
     * @return el n�mero ingresado por el usuario
     */
    private static Double leerNumeros() {
        double n1;
        String valor;
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un valor:");
        while (true) {
            try {
                // Leemos un n�mero ingresado por el usuario
                valor = leer.next().replace(",", ".");
                n1 = Double.parseDouble(valor);
                // Si el n�mero es v�lido, salimos del bucle while
                if (n1 >= 0 || n1 < 0) {
                    break;
                }
            } catch (Exception e) {
                // Si el usuario ingresa un valor inv�lido, mostramos un mensaje de error y pedimos un nuevo valor
                System.out.println("Error: Ingreso Inv�lido");
                
            }
        }

        // Devolvemos el n�mero ingresado por el usuario
        return n1;
    }

    /**
     * Muestra un men� de opciones al usuario y devuelve la opci�n seleccionada.
     * Si el usuario ingresa un valor inv�lido, se muestra un mensaje de error y
     * se pide un nuevo valor.
     *
     * @return la opci�n seleccionada por el usuario
     */
    private static int menu() {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("""
                       |--------------------------|    
                       |           Menu     - [] X|
                       |--------------------------|
                       |1.Sumar                   |
                       |2.Restar                  |
                       |3.Multiplicar             |
                       |4.Dividir                 |
                       |5.Salir                   |                           
                       |--------------------------|
                       |Ingrese su elecci�n:      |
                       |--------------------------|
                       
                       """); //Esto es un string multil�nea se utiliza usando tres comillas ej: """HOLA"""
        while (true) {
            try {
                // Leemos la opci�n seleccionada por el usuario
                opc = leer.nextInt();
                // Si la opci�n es v�lida, salimos del bucle while
                if (opc >= 1 && opc <= 5) {
                    break;
                }
            } catch (Exception e) {
                // Si el usuario ingresa un valor inv�lido, mostramos un mensaje de error y pedimos un nuevo valor
                System.out.println("Ingreso Inv�lido");
                leer.next();
            }
        }

        // Devolvemos la opci�n seleccionada por el usuario
        return opc;
    }

    /**
     * Devuelve la suma de dos n�meros enteros.
     *
     * @param numero1 el primer n�mero entero a sumar.
     * @param numero2 el segundo n�mero entero a sumar.
     * @return la suma de los dos n�meros enteros.
     */
    private static double sumarNumeros(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    /**
     * Devuelve la resta de dos n�meros enteros.
     *
     * @param numero1 el primer n�mero entero.
     * @param numero2 el segundo n�mero entero a restar del primero.
     * @return la resta de los dos n�meros enteros.
     */
    private static double restarNumeros(Double numero1, Double numero2) {
        /**
         * Round y multiplicacion por 100 y division por 100 para redondear los
         * decimales, para resolver las expresiones per�odicas
         */
        return Math.round((numero1 - numero2) * 100.0) / 100.0;

    }

    /**
     * Devuelve la multiplicaci�n de dos n�meros enteros.
     *
     * @param numero1 el primer n�mero entero a multiplicar.
     * @param numero2 el segundo n�mero entero a multiplicar.
     * @return el resultado de la multiplicaci�n de los dos n�meros enteros.
     */
    private static double multiplicarNumeros(Double numero1, Double numero2) {
        return numero1 * numero2;
    }

    /**
     * Devuelve la divisi�n de dos n�meros enteros en formato de cadena de
     * texto.
     *
     * @param numero1 el dividendo entero.
     * @param numero2 el divisor entero.
     * @return la divisi�n de los dos n�meros enteros en formato de cadena de
     * texto. Si el divisor es cero, devuelve "Indeterminado".
     */
    private static String dividirNumeros(Double numero1, Double numero2) {
        double res;
        if (numero2.equals(Integer.valueOf(0))) { //Esto es preguntar si numero2 = 0
            return "Indeterminado";
        } else {
            res = (double) numero1 / numero2;

            /**
             * String.format(formato,argumento) formato controla la cantidad de
             * decimales que va a imprimir en consola.
             *
             * replace(<caracter_a_reemplazar>, <caracter_de_reemplazo>)
             */
            return String.format("%.4f", res).replace(",", ".");
        }
    }

}
