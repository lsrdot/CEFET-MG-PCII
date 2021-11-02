package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CuboDois extends TridimensionalDois {

    private double aresta;

    public CuboDois() {
        super();
        this.aresta = .0;
    }

    public CuboDois(String cor, Double aresta) {
        super(cor, "Cubo");
        setAresta(aresta);
    }

    @Override
    public double obterArea() {
        return (Math.pow(getAresta(), 2) * 6);
    }

    @Override
    public double obterVolume() {
        return Math.pow(getAresta(), 3);
    }

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou um cubo de area: %.2f\n", this.obterArea());
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
