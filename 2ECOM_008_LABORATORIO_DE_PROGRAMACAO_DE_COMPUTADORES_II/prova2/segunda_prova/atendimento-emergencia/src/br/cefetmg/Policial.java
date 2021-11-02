package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Policial extends Emergencia {

    private int nViaturas, nGravidade;


    public Policial(int nGravidade) {

        super(nGravidade);
        this.nGravidade = nGravidade;
    }

    public int getNViaturas() {
        return nViaturas;
    }

    @Override
    public String getGravidade() {
        nViaturas = nGravidade == 1 ? 2 : nGravidade == 2 ? 10 : 100;
        return "\nEmergencia Policial \nGravidade: " +  super.getGravidade() + "\nPrecisamos de " + nViaturas + " viaturas no local!";
    }


}
