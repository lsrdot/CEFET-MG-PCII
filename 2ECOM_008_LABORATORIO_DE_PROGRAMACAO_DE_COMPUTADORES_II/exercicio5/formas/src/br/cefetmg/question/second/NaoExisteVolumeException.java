package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class NaoExisteVolumeException extends Exception {

    public NaoExisteVolumeException() {
        super("nao eh possivel calcular volume\n");
    }
}
