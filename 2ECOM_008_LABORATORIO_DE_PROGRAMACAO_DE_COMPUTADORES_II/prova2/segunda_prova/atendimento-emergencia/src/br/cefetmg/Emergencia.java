package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Emergencia {

    private String gravidade;

    public Emergencia() {
        this.gravidade = "";
    }

    public Emergencia(int nGravidade) {
        if (nGravidade == 1) {
            gravidade = "Baixa";
        } else if (nGravidade == 2) {
            gravidade = "Moderada";
        } else {
            gravidade = "Alta";
        }
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
}
