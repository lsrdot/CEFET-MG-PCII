package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class QuadradoDois extends BidimensionalDois {

    private double lado;

    public QuadradoDois() {
        super();
        this.lado = .0;
    }

    public QuadradoDois(String cor, double lado) {
        super(cor, "Quadrado");
        setLado(lado);
    }

    @Override
    public double obterArea() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou um quadrado de area: %.2f\n", this.obterArea());
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
