package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Tetraedro extends Tridimensional{

    private double aresta;

    public Tetraedro() {
        super();
        this.aresta = .0;
    }

    public Tetraedro(String cor, double aresta) {
        super(cor);
        setAresta(aresta);
    }

    @Override
    public double obterArea() {
        return (Math.pow(aresta, 2)) * Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        return ((Math.pow(aresta, 3) * Math.sqrt(2)) / 12);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
