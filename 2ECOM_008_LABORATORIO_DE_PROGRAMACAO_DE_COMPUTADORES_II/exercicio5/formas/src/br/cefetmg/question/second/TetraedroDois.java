package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class TetraedroDois extends TridimensionalDois {

    private double aresta;

    public TetraedroDois() {
        super();
        this.aresta = .0;
    }

    public TetraedroDois(String cor, double aresta) {
        super(cor, "Tetraedro");
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

    @Override
    public void apresentarArea() {
        System.out.printf("Ola, eu sou um tetraedro de area: %.2f\n", this.obterArea());
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
