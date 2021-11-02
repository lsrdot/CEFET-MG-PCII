package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Medica extends Emergencia {

    private int numeroParamedicos, nGravidade;

    public Medica() {

    }

    public Medica(int nGravidade) {

        super(nGravidade);
        this.nGravidade = nGravidade;
    }

    public int getNumeroParamedicos() {
        return numeroParamedicos;
    }

    public void setNumeroParamedicos(int numeroParamedicos) {
        this.numeroParamedicos = numeroParamedicos;
    }

    @Override
    public String getGravidade() {
        numeroParamedicos = nGravidade == 1 ? 4 : nGravidade == 2 ? 20 : 200;
        return "\nEmergencia Medica\nGravidade: " + super.getGravidade() + "\n" + numeroParamedicos + " paramedicos a caminho!";
    }


}
