package br.cefetmg;

import java.util.Random;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CiaTelefonica {

    String regiao;

    public CiaTelefonica() {
        regiao = "";
    }

    private static int regiaoAleatoria() {

        int numAleatorio;

        Random random = new Random();
        numAleatorio = random.nextInt() % 8;

        if (numAleatorio < 0) {
            numAleatorio = numAleatorio * -1;
        }

        return numAleatorio;

    }

    public static int buscaRegiao(String telefone) {

        if (telefone != null && !telefone.isEmpty()) {
            int numRegiao = regiaoAleatoria();
            String possiveisRegiao[] = {"Norte", "Nordeste", "Leste", "Sudeste", "Sul", "Sudoeste", "Oeste", "Noroeste"};

            System.out.println("Realizando trinagulacao para o numero " + telefone + "...\n" + "Triangulacao concluida, regiao encontrada!!!");

            return numRegiao;
        } else {
            return -1; //Regiao nao encontrada
        }
    }

    public String getRegiao() {
        return regiao;
    }
}
