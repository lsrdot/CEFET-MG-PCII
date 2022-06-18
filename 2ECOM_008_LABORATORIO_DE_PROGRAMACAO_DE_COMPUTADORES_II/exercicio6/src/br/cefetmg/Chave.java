package br.cefetmg;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 - 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lucasdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 * @version 1.0
 */

public class Chave {

    public static String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public int deslocamento;

    public Chave() {
        this.deslocamento = 0;
    }

    public Chave(int deslocamento) {
        this.deslocamento = deslocamento;
    }
}
