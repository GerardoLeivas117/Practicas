package ejercicio2.entidades;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "--------------------------------------"
                + "\nCircunferencia"
                + "\nRadio=" + String.format("%.3f", radio)
                + "\nÁrea=" + String.format("%.3f", area())
                + "\nPerímetro=" + String.format("%.3f", perimetro())
                + "\n--------------------------------------";
    }

}
