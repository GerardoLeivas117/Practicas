package ejercicio12extras;

/**
 *
 * @author Gerardo
 *
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E. Ejemplo: 
 *   
 *      0-0-0 
 *      0-0-1 
 *      0-0-2 
 *      0-0-E 
 *      0-0-4 
 *      0-1-2
 *      0-1-E
 */
public class Ejercicio12Extras {

    public static void main(String[] args) {        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if(i==3){
                        System.out.print("E-");
                    }else{
                        System.out.print(i+"-");
                    }
                    if(j==3){
                        System.out.print("E-");
                    }else{
                        System.out.print(j+"-");
                    }
                    if(k==3){
                        System.out.println("E");
                    }else{
                        System.out.println(k);
                    }            
                    
                }
                
            }
        }
    }

}
