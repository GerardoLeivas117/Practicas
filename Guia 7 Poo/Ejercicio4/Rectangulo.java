package ejercicio4.entidades;


public class Rectangulo {
    private double base,altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double superficie() {
        return base * altura;
    }
    
    public double perimetro() {
        return (base + altura) * 2;
    }
    
    public void dibujar(){
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= altura; j++) {
                if(i==1 || i==base || j==1 || j==altura){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
      
}
