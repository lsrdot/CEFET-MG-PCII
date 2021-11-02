package br.cefetmg.question.first;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public abstract class Bidimensional implements Forma {

    private String cor;

    public Bidimensional() {
        this.cor = "";
    }

    public Bidimensional(String cor) {
        setCor(cor);
    }

    @Override
    public double obterArea() {
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
