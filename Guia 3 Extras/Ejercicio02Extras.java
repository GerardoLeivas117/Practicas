package ejercicio2extras;

/**
 *
 * @author Gerardo
 *
 *
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones necesarias
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
 * D tome el valor de B. Mostrar los valores iniciales y los valores finales de
 * cada variable. Utilizar sólo una variable auxiliar.
 */

public class Ejercicio2Extras {

    public static void main(String[] args) {
        // Declarar las cuatro variables enteras y asignarles un valor diferente a cada una
        int A = 15;
        int B = 32;
        int C = 83;
        int D = 64;

        // Imprimir los valores iniciales de cada variable
        System.out.println("Valores iniciales:");
        System.out.println("A= " + A + " B= " + B + " C= " + C + " D= " + D);


        // Declarar una variable auxiliar para guardar el valor de una de las variables
        /**
         * como la variable B es la primera en perder su valor, es la que se debe recuperar en auxiliar
         */
        int auxiliar = B;
        
        System.out.println("Proceso de intercambio de valores en variables:\nB<-C // C<-A // A<-D // D<-B");
        
        // Asignar los nuevos valores a cada variable
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        // Imprimir los valores finales de cada variable
        System.out.println("Valores finales:");
        System.out.println("A= " + A + " B= " + B + " C= " + C + " D= " + D);;
    }

}
