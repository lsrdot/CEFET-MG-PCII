package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class TrianguloDois extends BidimensionalDois {

    private double base;
    private double altura;

    public TrianguloDois() {
        super();
        this.base = .0;
        this.altura = .0;
    }

    public TrianguloDois(String cor, double base, double altura) {
        super(cor, "Triangulo");
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double obterArea() {
        return ((getBase() * getAltura()) / 2);
    }

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou um triangulo de area: %.2f\n", this.obterArea());
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
