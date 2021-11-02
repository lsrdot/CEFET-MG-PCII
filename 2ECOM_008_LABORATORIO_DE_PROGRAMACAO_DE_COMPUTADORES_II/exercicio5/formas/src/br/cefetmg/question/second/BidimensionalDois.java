package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public abstract class BidimensionalDois implements FormaDois {

    private String cor, nomeFigura;

    public BidimensionalDois() {
        this.cor = "";
        this.nomeFigura = "";
    }

    public BidimensionalDois(String cor, String nomeFigura) {
        setCor(cor);
        setNomeFigura(nomeFigura);
    }

    @Override
    public double obterArea() {
        return 0;
    }

    @Override
    public double obterVolume() throws NaoExisteVolumeException {
        throw new NaoExisteVolumeException();
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
