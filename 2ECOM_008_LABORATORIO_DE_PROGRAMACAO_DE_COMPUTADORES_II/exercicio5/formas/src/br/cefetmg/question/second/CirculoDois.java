package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CirculoDois extends BidimensionalDois {

    private double raio;

    public CirculoDois() {
        super();
        this.raio = .0;
    }

    public CirculoDois(String cor, double raio) {
        super(cor, "Circulo");
        setRaio(raio);
    }

    @Override
    public double obterArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou um circulo de area: %.2f\n", this.obterArea());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
