package br.vianna.model;

public class CalculadoraIMC {
    private double peso;
    private int altura;

    public CalculadoraIMC() {
    }

    public CalculadoraIMC(int altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularIMC(){
        double alturaM = altura/100.0;
        return peso/(alturaM*alturaM);
    }
}
