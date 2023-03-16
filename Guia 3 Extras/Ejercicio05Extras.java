package ejercicio5extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 *
 */
public class Ejercicio5Extras {

    public static void main(String[] args) {
        // crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // pedir al usuario que ingrese la clase del socio (A, B o C)
        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char clase = leer.next().toUpperCase().charAt(0);  // leer la clase ingresada por el usuario
        double costo=0;
        if(clase=='A'||clase=='B'||clase=='C'){
            // pedir al usuario que ingrese el costo del tratamiento
            System.out.print("Ingrese el costo del tratamiento: ");
            costo = leer.nextDouble();  // leer el costo ingresado por el usuario
        }

        double descuento = 0.0;  // variable para almacenar el descuento correspondiente al socio

        // calcular el descuento correspondiente al socio según su clase
        switch (clase) {
            case 'A':
                descuento = costo * 0.5;
                System.out.println("Su categoría posee 50% de descuento.");
                break;
            case 'B':
                descuento = costo * 0.35;
                System.out.println("Su categoría posee 35% de descuento.");
                break;
            case 'C':
                System.out.println("Su categoría no posee descuento.");
                break;
            default:
                System.out.println("La clase ingresada no es válida.");
                return;  // terminar la ejecución del programa si la clase ingresada no es válida
        }

        // calcular el importe en efectivo a pagar por el socio
        double importe = costo - descuento;

        // mostrar el importe en efectivo a pagar por el socio
        System.out.println("El importe en efectivo a pagar por el socio es: $" + importe);
        
        //Cerramos el scanner
        leer.close();
    }

}
