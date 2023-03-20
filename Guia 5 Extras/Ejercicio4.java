package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
public class Ejercicio4 {

    static final int CANT_ALUMNOS = 10;

    public static void main(String[] args) {
        // Se define un arreglo de tamaño CANT_ALUMNOS para guardar las notas finales de los alumnos.
        double[] alumnos = new double[CANT_ALUMNOS];

        // Se cargan las notas finales de los alumnos en el arreglo.
        cargarNotasFinales(alumnos);

        // Se informa la cantidad de aprobados y desaprobados del curso.
        informarAprobadosONo(alumnos);
    }

// Método para pedir y calcular la nota de los prácticos de un alumno.
    private static double notaPracticos() {
        Scanner leer = new Scanner(System.in);
        double notaPracticos = 0;

        // Se pide la nota del primer práctico y se multiplica por el 10% correspondiente.
        System.out.println("Ingrese la nota del primer práctico:");
        notaPracticos += leer.nextDouble() * (0.10);

        // Se pide la nota del segundo práctico y se multiplica por el 15% correspondiente.
        System.out.println("Ingrese la nota del segundo práctico:");
        notaPracticos += leer.nextDouble() * (0.15);

        return notaPracticos;
    }

// Método para pedir y calcular la nota de los parciales de un alumno.
    private static double notaParciales() {
        Scanner leer = new Scanner(System.in);
        double notaParciales = 0;

        // Se pide la nota del primer parcial y se multiplica por el 25% correspondiente.
        System.out.println("Ingrese la nota del primer parcial:");
        notaParciales += leer.nextDouble() * (0.25);

        // Se pide la nota del segundo parcial y se multiplica por el 50% correspondiente.
        System.out.println("Ingrese la nota del segundo parcial:");
        notaParciales += leer.nextDouble() * (0.50);

        return notaParciales;
    }

// Método para cargar las notas finales de los alumnos en un arreglo.
    public static void cargarNotasFinales(double[] planilla) {
        for (int i = 0; i < planilla.length; i++) {
            // Se suman las notas de los prácticos y los parciales para obtener la nota final del alumno.
            planilla[i] = notaPracticos() + notaParciales();
        }
    }

// Método para informar la cantidad de aprobados y desaprobados en el curso.
    public static void informarAprobadosONo(double[] planilla) {
        int total_aprobados = 0;
        int total_desaprobados = 0;

        for (int i = 0; i < planilla.length; i++) {
            // Si la nota final es mayor o igual a 7.00 se cuenta como aprobado, en caso contrario se cuenta como desaprobado.
            if (planilla[i] >= 7.00) {
                total_aprobados++;
            } else {
                total_desaprobados++;
            }
        }

        // Se imprime el detalle con la cantidad de aprobados y desaprobados en el curso.
        System.out.println("Detalle:\nAprobados: " + total_aprobados + "\nDesaprobados: " + total_desaprobados);
    }

}
