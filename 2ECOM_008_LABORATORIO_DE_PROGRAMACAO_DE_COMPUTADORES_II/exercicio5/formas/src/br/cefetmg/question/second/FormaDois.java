package br.cefetmg.question.second;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public interface FormaDois {

    double obterArea();
    double obterVolume() throws NaoExisteVolumeException;
    void apresentarArea();
}
