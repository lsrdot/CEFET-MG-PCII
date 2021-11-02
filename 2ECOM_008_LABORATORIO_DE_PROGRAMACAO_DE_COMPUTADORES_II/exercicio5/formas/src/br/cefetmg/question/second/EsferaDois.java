package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class EsferaDois extends TridimensionalDois {

    private double raio;

    public EsferaDois() {
        super();
        this.raio = .0;
    }

    public EsferaDois(String cor, double raio) {
        super(cor, "Esfera");
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

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou uma esfera de area: %.2f\n", this.obterArea());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
