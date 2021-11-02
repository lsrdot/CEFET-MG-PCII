package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Quadrado extends Bidimensional{

    private double lado;

    public Quadrado() {
        super();
        this.lado = .0;
    }

    public Quadrado(String cor, double lado) {
        super(cor);
        setLado(lado);
    }

    @Override
    public double obterArea() {
        return Math.pow(getLado(), 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
