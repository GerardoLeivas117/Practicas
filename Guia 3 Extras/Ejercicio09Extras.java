package ejercicio9extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente. Por ejemplo: 50 / 13: 50 – 13 = 37 una
 * resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13 = 11 tres restas
 * realizadas dado que 11 es menor que 13, entonces: el residuo es 11 y el
 * cociente es 3.
 * 
 * 
 */
public class Ejercicio9Extras {

    public static void main(String[] args) {
        //Usamos leer de tipo Scanner y lo instanciamos
        Scanner leer = new Scanner(System.in);
        
        //Declaramos variables tipo entero para guardar los valores de la division
        int dividendo,dividendoAux,divisor,cociente=0,resto;
        
        System.out.println("Ingrese un valor para el dividendo");
        dividendo = leer.nextInt();
        dividendoAux = dividendo;
        System.out.println("Ingrese un valor para el divisor");
        divisor = leer.nextInt();
        
        while(true){
            resto=dividendo-divisor;
            cociente++;
            dividendo=dividendo-divisor;
            if(resto<divisor){
                break;
            }
        
        
        }
        resto=dividendo;
        System.out.println("Dividendo:"+dividendoAux+"\nDivisor:"+divisor+"\nCociente:"+cociente+"\nResto:"+resto);
        
        //Cerramos el Scanner
        leer.close();
        
    }

}
