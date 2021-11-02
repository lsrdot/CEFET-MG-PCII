package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public abstract class Tridimensional implements Forma {

    private String cor;

    public Tridimensional() {
        this.cor = "";
    }

    public Tridimensional(String cor) {
        setCor(cor);
    }

    @Override
    public double obterArea() {
        return 0;
    }

    public double obterVolume() {
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
