package ejercicio3.entidades;


public class Operacion {
    
    private double numero1,numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double sumar(){
        return numero1+numero2;
    }
    
    public double restar(){
        return numero1-numero2;
    }
    
    public double multiplicar(){
        if(numero1==0 || numero2==0){
            System.out.println("Error:Multiplicación por cero");
            return 0;
        }else{
            return numero1*numero2;
        }
    }
    
    public double dividir(){
        if(numero2==0){
            System.out.println("Error:División por cero");
            return 0;
        }else{
            return numero1/numero2;
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
