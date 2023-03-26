package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class Servicio {

    public static void crearOperacion(Operacion oper1) {
        Scanner leer = new Scanner(System.in);  // Crea un objeto Scanner para leer entradas del usuario  
        String entrada;
        while (true) {  // Crea un bucle infinito para leer y validar el valor del n�mero 1
            try {
                System.out.println("Ingrese un valor para n�mero 1");  // Pide al usuario que ingrese un valor para el n�mero 1
                entrada = leer.next().replace(",", ".");  // Lee la entrada del usuario y reemplaza las comas por puntos
                oper1.setNumero1(Double.parseDouble(entrada));  // Convierte la entrada en un n�mero de punto flotante y lo asigna al n�mero 1 de la operaci�n
                if (oper1.getNumero1() >= 0 || oper1.getNumero1() < 0) {  // Si el n�mero 1 es mayor o igual a cero o menor que cero, significa que es v�lido
                    break;  // Sale del bucle si el n�mero 1 es v�lido
                }
            } catch (Exception e) {  // Si se produce una excepci�n al convertir la entrada en un n�mero, significa que la entrada es inv�lida
                System.out.println("Error: Entrada inv�lida.Intente nuevamente.");  // Muestra un mensaje de error y contin�a con el bucle para pedir otra entrada
            }
        }
        while (true) {  // Crea otro bucle infinito para leer y validar el valor del n�mero 2
            try {
                System.out.println("Ingrese un valor para n�mero 2");  // Pide al usuario que ingrese un valor para el n�mero 2
                entrada = leer.next().replace(",", ".");  // Lee la entrada del usuario y reemplaza las comas por puntos
                oper1.setNumero2(Double.parseDouble(entrada));  // Convierte la entrada en un n�mero de punto flotante y lo asigna al n�mero 2 de la operaci�n
                if (oper1.getNumero2() >= 0 || oper1.getNumero2() < 0) {  // Si el n�mero 2 es mayor o igual a cero o menor que cero, significa que es v�lido
                    break;  // Sale del bucle si el n�mero 2 es v�lido
                }
            } catch (Exception e) {  // Si se produce una excepci�n al convertir la entrada en un n�mero, significa que la entrada es inv�lida
                System.out.println("Error: Entrada inv�lida.Intente nuevamente.");  // Muestra un mensaje de error y contin�a con el bucle para pedir otra entrada
            }
        }
    }

    public static void menuDeOperaciones(Operacion oper1) {
        Scanner leer = new Scanner(System.in);  // Crea un objeto Scanner para leer entradas del usuario
        while (true) {  // Crea un bucle infinito para mostrar el men� y esperar la selecci�n del usuario
            System.out.println("""
                           ---------------------------
                           |Menu De Operaciones:     |
                           |1.Sumar                  |
                           |2.Restar                 |
                           |3.Multiplicar            |
                           |4.Dividir                |
                           |5.Salir                  |
                           ---------------------------
                           """);  // Muestra el men� de operaciones
            switch (leer.next()) {  // Lee la selecci�n del usuario
                case "1":  // Si el usuario selecciona la opci�n 1 (suma)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los n�meros y los asigna a la operaci�n
                    System.out.println("La Suma es: " + oper1.sumar());  // Muestra el resultado de la suma
                    break;
                case "2":  // Si el usuario selecciona la opci�n 2 (resta)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los n�meros y los asigna a la operaci�n
                    System.out.println("La Resta es: " + oper1.restar());  // Muestra el resultado de la resta
                    break;
                case "3":  // Si el usuario selecciona la opci�n 3 (multiplicaci�n)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los n�meros y los asigna a la operaci�n
                    System.out.println("La Multiplicaci�n es: " + oper1.multiplicar());  // Muestra el resultado de la multiplicaci�n
                    break;
                case "4":  // Si el usuario selecciona la opci�n 4 (divisi�n)
                    crearOperacion(oper1);  // Pide al usuario que ingrese los n�meros y los asigna a la operaci�n
                    System.out.println("La Divisi�n es: " + oper1.dividir());  // Muestra el resultado de la divisi�n
                    break;
                case "5":  // Si el usuario selecciona la opci�n 5 (salir)
                    System.out.println("Fin de Programa");  // Muestra un mensaje de despedida
                    return;  // Sale de la funci�n y termina el programa
                default:  // Si el usuario ingresa una opci�n inv�lida
                    System.out.println("Ingreso Inv�lido.Intente nuevamente.");  // Muestra un mensaje de error y contin�a con el bucle del men�
                    break;
            }
        }
    }

}
