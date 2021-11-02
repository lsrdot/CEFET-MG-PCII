package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Esfera extends Tridimensional{

    private double raio;

    public Esfera() {
        super();
        this.raio = .0;
    }

    public Esfera(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * (Math.pow(getRaio(), 2));
    }

    @Override
    public double obterVolume() {
        return ((4 * Math.PI * (Math.pow(getRaio(), 3)))/3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
