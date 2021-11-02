package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Triangulo extends Bidimensional {

    private double base;
    private double altura;

    public Triangulo() {
        super();
        this.base = .0;
        this.altura = .0;
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double obterArea() {
        return ((getBase() * getAltura()) / 2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
