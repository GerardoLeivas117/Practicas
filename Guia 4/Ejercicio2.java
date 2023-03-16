package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        StringBuffer informacion = new StringBuffer("");
        System.out.println("Ingrese los datos de las personas: ");

        // se usa un bucle while para pedir los datos de varias personas
        while (true) {
            informacion.append(NombreYedad()); // se llama al método NombreYedad() para obtener los datos de una persona
            System.out.println("¿desea continuar? Si/No");

            // se verifica si el usuario desea ingresar los datos de otra persona o no
            if (leer.next().equalsIgnoreCase("no") || leer.next().equalsIgnoreCase("n")) {
                break; // si el usuario no desea continuar, se sale del bucle
            }

        }
        System.out.println(informacion); // se muestran en pantalla los datos de todas las personas ingresadas
        leer.close(); // se cierra el objeto Scanner

    }

    public static String NombreYedad() {
        String legalidad;
        System.out.println("Igresar el nombre: ");
        String nombre = leer.next(); // se pide el nombre de la persona
        System.out.println("Igresar la edad: ");
        int edad = leer.nextInt(); // se pide la edad de la persona
        if (edad >= 18) { // se verifica si la persona es mayor o menor de edad
            legalidad = "mayor";
        } else {
            legalidad = "menor";
        }
        return ("nombre: " + nombre + " edad: " + edad + " la persona es " + legalidad + "\n"); // se retorna la información de la persona
    }

}
