package br.cefetmg;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Teste {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static final Scanner scan = new Scanner(System.in);
    private final static String[] nome = {"SAMU", "PM", "CBM"}; //CBM = Corpo de bombeiro
    private final static String[] telefone = {"192", "190", "193"};
    private final static String[] endereco = {"Norte", "Nordeste", "Leste", "Sudeste", "Sul", "Sudoeste", "Oeste", "Noroeste"};


    private static boolean verificaOpcao(int digito) {
        if (digito > 3 || digito < 1) {
            return false;
        }
        return true;
    }


    private static UnidadeServico escolherUnidadeServico(Emergencia emergencia) {
        int op = 0, cont = 0;
        UnidadeServico unidadeResponsavel = new UnidadeServico();
        String telefoneUsuario = "";
        int regiao = 0;

        System.out.println("Digite o seu numero de telefone: ");
        telefoneUsuario = scan.next();
        regiao = CiaTelefonica.buscaRegiao(telefoneUsuario);

        if (emergencia instanceof Medica) {
            unidadeResponsavel = new UnidadeServico(nome[0], telefone[0], endereco[regiao]);
        } else if (emergencia instanceof Policial) {
            unidadeResponsavel = new UnidadeServico(nome[1], telefone[1], endereco[regiao]);
        } else if (emergencia instanceof DefesaCivil) {
            unidadeResponsavel = new UnidadeServico(nome[2], telefone[2], endereco[regiao]);
        }
        return unidadeResponsavel;
    }

    public static void main(String[] args) {

        CentralAtendimento central = new CentralAtendimento();

        int menu;
        for (; true; ) {
            String mensagem = "";
            System.out.println(ANSI_RED + "\n\t\t\t################### ATENDIMENTO DE EMERGENCIA ###################\n" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Deseja de cancelar o atendimento? Digite: 0");
            System.out.println("Deseja realizar uma solicitacao? Digite: 1");
            System.out.println("Deseja ver as solicitacoes realizadas? Digite: 2" + ANSI_RESET);
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 0 -> {
                    System.out.println("Saindo do atendimento de emergencia...");
                    System.exit(0);
                }
                case 1 -> {

                    int opcao = 0;

                    System.out.println("Qual eh o tipo de emergencia?\n1 - Medica\n2 - Policial\n3 - Defesa Civil");
                    opcao = scan.nextInt(); //Controla as opcoes de emergencia e nivel de gravidade

                    Emergencia emergencia = new Emergencia();

                    switch (opcao) {
                        case 1 -> {
                            try {
                                System.out.println("Qual eh o nivel de gravidade?\n1 - Baixa\n2 - Moderada\n3 - Alta");
                                opcao = scan.nextInt();
                                if (!verificaOpcao(opcao)) {
                                    mensagem = "Digito invalido!\nOperacao Abortada!\n";
                                } else {
                                    emergencia = new Medica(opcao);
                                }

                            } catch (InputMismatchException err) {
                                mensagem = "Digito invalido!\nOperacao Abortada!\n";
                            }
                        }
                        case 2 -> {
                            try {
                                System.out.println("Qual eh o nivel de gravidade?\n1 - Baixa\n2 - Moderada\n3 - Alta");
                                opcao = scan.nextInt();

                                if (!verificaOpcao(opcao)) {
                                    mensagem = "Digito invalido!\nOperacao Abortada!\n";
                                } else {
                                    emergencia = new Policial(opcao);
                                }
                            } catch (InputMismatchException err) {
                                mensagem = "Digito invalido!\nOperacao Abortada!\n";
                            }
                        }
                        case 3 -> {
                            try {
                                System.out.println("Qual eh o nivel de gravidade?\n1 - Baixa\n2 - Moderada\n3 - Alta");
                                opcao = scan.nextInt();
                                if (!verificaOpcao(opcao)) {
                                    mensagem = "Digito invalido!\nOperacao Abortada!\n";
                                } else {
                                    emergencia = new DefesaCivil(opcao);
                                }
                            } catch (InputMismatchException err) {
                                mensagem = "Digito invalido!\nOperacao Abortada!\n";
                            }
                        }
                    }
                    scan.nextLine();
                    System.out.println("Digite o NOME e a DATA de solicitacao");
                    String nomeAtendente = scan.next();
                    String dataSolicitacao = scan.next();

                    Solicitacao solicitacao = new Solicitacao(emergencia, escolherUnidadeServico(emergencia), nomeAtendente, dataSolicitacao);

                    central.addSolicitacoes(solicitacao);

                    mensagem = "Solicitacao realizada com sucesso!\nEstamos a caminho!!";


                }
                case 2 -> {
                    mensagem = central.exibirSolicitacoes();
                }
            }

            System.out.println(mensagem);
        }


    }
}
