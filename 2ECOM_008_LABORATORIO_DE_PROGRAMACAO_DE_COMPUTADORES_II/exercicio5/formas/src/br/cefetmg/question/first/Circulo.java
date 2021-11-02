package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Circulo extends Bidimensional {

    private double raio;

    public Circulo() {
        super();
        this.raio = .0;
    }

    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }

    @Override
    public double obterArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
