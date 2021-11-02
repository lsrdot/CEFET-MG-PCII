package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public abstract class TridimensionalDois implements FormaDois {

    private String cor, nomeFigura;


    public TridimensionalDois() {
        this.cor = "";
        this.nomeFigura = "";
    }

    public TridimensionalDois(String cor, String nomeFigura) {
        setCor(cor);
        setNomeFigura(nomeFigura);
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

    @Override
    public void apresentarArea() {

    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
}
