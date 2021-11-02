package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Cubo extends Tridimensional{

    private double aresta;

    public Cubo() {
        super();
        this.aresta = .0;
    }

    public Cubo(String cor, Double aresta) {
        super(cor);
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

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
