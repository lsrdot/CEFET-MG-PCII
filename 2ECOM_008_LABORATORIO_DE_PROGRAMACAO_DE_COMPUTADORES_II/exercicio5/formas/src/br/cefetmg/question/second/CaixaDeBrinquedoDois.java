package br.cefetmg.question.second;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CaixaDeBrinquedoDois {

    private final List<FormaDois> formaDois;

    public CaixaDeBrinquedoDois() {
        formaDois = new ArrayList<>();
    }

    public void adicionarBrinquedo(FormaDois formaDois) {
        this.formaDois.add(formaDois);
    }

    public void esvaziarCaixa() {
        this.formaDois.clear();
    }

    public void apresentarBrinquedos() {
        for (FormaDois formaDois : this.formaDois) {
            try {
                formaDois.apresentarArea();
                System.out.printf("meu volume eh: %.2f\n\n",formaDois.obterVolume());
            } catch (NaoExisteVolumeException err) {
                System.out.println(err.getMessage());
            }
        }
    }
}