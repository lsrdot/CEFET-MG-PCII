package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class DefesaCivil extends Emergencia {

    private int caminhoes, nGravidade;

    public DefesaCivil(int nGravidade) {

        super(nGravidade);
        this.nGravidade = nGravidade;
    }


    public int getCaminhoes() {
        return caminhoes;
    }

    public void setCaminhoes(int caminhoes) {
        this.caminhoes = caminhoes;
    }

    public int getnGravidade() {
        return nGravidade;
    }

    public void setnGravidade(int nGravidade) {
        this.nGravidade = nGravidade;
    }

    @Override
    public String getGravidade() {
        caminhoes = nGravidade == 1 ? 4 : nGravidade == 2 ? 20 : 200;
        return "\nEmergencia da Defesa Civil\nGravidade: " + super.getGravidade() + "\n" + caminhoes + " caminhoes a caminho!";
    }
}
