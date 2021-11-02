package br.cefetmg;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CentralAtendimento {

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    private final List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();

    public void addSolicitacoes(Solicitacao solicitacao) {
        solicitacoes.add(solicitacao);
    }

    public String exibirSolicitacoes() {

        String mensagem = "";

        if (solicitacoes.isEmpty()) {
            mensagem = ANSI_RED + "Nenhuma solicitacao realizada!" + ANSI_RESET;

        } else {
            for (Solicitacao s : solicitacoes) {
                mensagem += ANSI_GREEN + s.getEmergencia().getGravidade() + "\n";
                mensagem += "Data da solicitacao: " + s.getDataSolicitacao() + "\n";
                mensagem += "Nome atendente: " + s.getNomeAtendente() + "\n" + ANSI_RESET;
            }
        }

        return mensagem;
    }

}
