package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class Servicio {

    public static void crearOperacion(Operacion oper1) {
        Scanner leer = new Scanner(System.in);  // Crea un objeto Scanner para leer entradas del usuario  
        String entrada;
        while (true) {  // Crea un bucle infinito para leer y validar el valor del número 1
            try {
                System.out.println("Ingrese un valor para número 1");  // Pide al usuario que ingrese un valor para el número 1
                entrada = leer.next().replace(",", ".");  // Lee la entrada del usuario y reemplaza las comas por puntos
                oper1.setNumero1(Double.parseDouble(entrada));  // Convierte la entrada en un número de punto flotante y lo asigna al número 1 de la operación
                if (oper1.getNumero1() >= 0 || oper1.getNumero1() < 0) {  // Si el número 1 es mayor o igual a cero o menor que cero, significa que es válido
                    break;  // Sale del bucle si el número 1 es válido
                }
            } catch (Exception e) {  // Si se produce una excepción al convertir la entrada en un número, significa que la entrada es inválida
                System.out.println("Error: Entrada inválida.Intente nuevamente.");  // Muestra un mensaje de error y continúa con el bucle para pedir otra entrada
            }
        }
        while (true) {  // Crea otro bucle infinito para leer y validar el valor del número 2
            try {
                System.out.println("Ingrese un valor para número 2");  // Pide al usuario que ingrese un valor para el número 2
                entrada = leer.next().replace(",", ".");  // Lee la entrada del usuario y reemplaza las comas por puntos
                oper1.setNumero2(Double.parseDouble(entrada));  // Convierte la entrada en un número de punto flotante y lo asigna al número 2 de la operación
                if (oper1.getNumero2() >= 0 || oper1.getNumero2() < 0) {  // Si el número 2 es mayor o igual a cero o menor que cero, significa que es válido
                    break;  // Sale del bucle si el número 2 es válido
                }
            } catch (Exception e) {  // Si se produce una excepción al convertir la entrada en un número, significa que la entrada es inválida
                System.out.println("Error: Entrada inválida.Intente nuevamente.");  // Muestra un mensaje de error y continúa con el bucle para pedir otra entrada
            }
        }
    }

    public static void menuDeOperaciones(Operacion oper1) {
        Scanner leer = new Scanner(System.in);  // Crea un objeto Scanner para leer entradas del usuario
        while (true) {  // Crea un bucle infinito para mostrar el menú y esperar la selección del usuario
            System.out.println("""
                           ---------------------------
                           |Menu De Operaciones:     |
                           |1.Sumar                  |
                           |2.Restar                 |
                           |3.Multiplicar            |
                           |4.Dividir                |
                           |5.Salir                  |
                           ---------------------------
                           """);  // Muestra el menú de operaciones
            switch (leer.next()) {  // Lee la selección del usuario
                case "1":  // Si el usuario selecciona la opción 1 (suma)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los números y los asigna a la operación
                    System.out.println("La Suma es: " + oper1.sumar());  // Muestra el resultado de la suma
                    break;
                case "2":  // Si el usuario selecciona la opción 2 (resta)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los números y los asigna a la operación
                    System.out.println("La Resta es: " + oper1.restar());  // Muestra el resultado de la resta
                    break;
                case "3":  // Si el usuario selecciona la opción 3 (multiplicación)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los números y los asigna a la operación
                    System.out.println("La Multiplicación es: " + oper1.multiplicar());  // Muestra el resultado de la multiplicación
                    break;
                case "4":  // Si el usuario selecciona la opción 4 (división)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los números y los asigna a la operación
                    System.out.println("La División es: " + oper1.dividir());  // Muestra el resultado de la división
                    break;
                case "5":  // Si el usuario selecciona la opción 5 (salir)
                    System.out.println("Fin de Programa");  // Muestra un mensaje de despedida
                    return;  // Sale de la función y termina el programa
                default:  // Si el usuario ingresa una opción inválida
                    System.out.println("Ingreso Inválido.Intente nuevamente.");  // Muestra un mensaje de error y continúa con el bucle del menú
                    break;
            }
        }
    }

}
