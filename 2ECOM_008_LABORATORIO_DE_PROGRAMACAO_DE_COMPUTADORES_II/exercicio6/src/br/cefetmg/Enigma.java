package br.cefetmg;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 - 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lucasdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 * @version 1.0
 */

public class Enigma {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String GREEN = "\033[0;32m";   // GREEN
    private static final Scanner scan = new Scanner(System.in);


    /**
     * @param opcao 0: Executa o bloco para gravacao da mensagem criptografada
     *              1: Executa o bloco para gravacao da mensagem descriptografada
     */
    public static String gravarMensagem(int opcao, String texto) {

        String mensagem = "";

        switch (opcao) {
            case 0 -> {
                mensagem = ArquivoTexto.gravarRegistro("Mensagem Cifrada: " + texto + " | Deslocamento de " + CifraDeCesar.chave.deslocamento + " letras");
            }
            case 1 -> {
                mensagem = ArquivoTexto.gravarRegistro("Mensagem Decifrada: " + texto + " | Deslocamento de " + CifraDeCesar.chave.deslocamento + " letras");
            }
        }

        return mensagem;
    }

    public static void main(String[] args) throws InterruptedException {

        String nome = """
                	▓█████  ███▄    █  ██▓  ▄████  ███▄ ▄███▓ ▄▄▄
                	▓█   ▀  ██ ▀█   █ ▓██▒ ██▒ ▀█▒▓██▒▀█▀ ██▒▒████▄
                	▒███   ▓██  ▀█ ██▒▒██▒▒██░▄▄▄░▓██    ▓██░▒██  ▀█▄
                	▒▓█  ▄ ▓██▒  ███▒░██░░▓█  ██▓▒██    ▒██ ░██▄▄▄▄██
                	░▒████▒▒██░   ▓██░░██░░▒▓███▀▒▒██▒   ░██▒ ▓█   ▓██▒
                	░░ ▒░ ░░ ▒░   ▒ ▒ ░▓   ░▒   ▒ ░ ▒░   ░  ░ ▒▒   ▓▒█
                """;

        int menu = -1;
        String mensagem = "", textoBase = "", textoCriptografado = "", textoDescriptografado = "";

        for (; true; ) {
            System.out.println();
            for (int i = 0; i < nome.length(); i++) {

                System.out.print(GREEN + nome.charAt(i));
                Thread.sleep(2);
            }

            System.out.print(ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_YELLOW + "***************************************************************" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "       BEM VINDO AO SISTEMA DE CRIPTOGRAFIA DE MENSAGENS       " + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "***************************************************************" + ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_CYAN + "Escolha um numero equivalente a sua opcao: " + ANSI_RESET);
            System.out.println(ANSI_CYAN + "0) Para sair do programa." + ANSI_RESET);
            System.out.println(ANSI_CYAN + "1) Abrir arquivo e inserir uma mensagem" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "2) Criptografar mensagem" + ANSI_RESET);
            if (!textoCriptografado.isEmpty()) {
                System.out.println(ANSI_CYAN + "3) Descriptografar mensagem" + ANSI_RESET);
            }
            System.out.println(ANSI_CYAN + "4) Gravar mensagens" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "5) Historico de cifras" + ANSI_RESET);
            try {
                menu = scan.nextInt();
            } catch (InputMismatchException imEx) {
                scan.nextLine();
                menu = -1;
                mensagem = ANSI_RED + "Digito invalido!" + ANSI_RESET;
            }

            switch (menu) {
                case 0 -> {
                    System.out.println(ANSI_GREEN + "A " + ANSI_YELLOW + "P4 Team" + ANSI_GREEN
                            + " agradece a preferencia!\nA sua conta eh de " + ANSI_YELLOW + "10" + ANSI_GREEN
                            + " pontos, pague pelo " + ANSI_YELLOW + "SIGAA" + ANSI_GREEN + " mais proximo!\nObrigado =D"
                            + ANSI_RESET);
                    System.exit(0);
                }
                case 1 -> {
                    scan.nextLine();
                    textoBase = "";
                    textoCriptografado = "";
                    textoDescriptografado = "";
                    System.out.println(ANSI_CYAN + "Digite o  numero de deslocamento da chave: " + ANSI_RESET);
                    try {
                        CifraDeCesar.chave.deslocamento = scan.nextInt();
                        scan.nextLine();
                        System.out.println(ANSI_CYAN + "Digite o texto a ser criptografado: " + ANSI_RESET);
                        textoBase = scan.nextLine();
                    } catch (InputMismatchException imEx) {
                        CifraDeCesar.chave.deslocamento = 0;
                        scan.nextLine();
                        mensagem = ANSI_RED + "Digito invalido!" + ANSI_RESET;
                    }
                }
                case 2 -> {
                    if (!textoBase.isEmpty()) {
                        textoCriptografado = CifraDeCesar.cifrar(textoBase);
                        mensagem = ANSI_GREEN + "Texto criptografado com sucesso!\nResultado:" + textoCriptografado + ANSI_RESET;
                    } else {
                        mensagem = ANSI_RED + "Nenhum texto cadastrado para ser descriptografado\n" + ANSI_RESET;
                    }
                }
                case 3 -> {
                    if (textoCriptografado.isEmpty()) {
                        mensagem = ANSI_RED + "Nenhum texto cadastrado para ser descriptografado\n" + ANSI_RESET;
                    } else {
                        textoDescriptografado = CifraDeCesar.decifrar(textoCriptografado);
                        mensagem = ANSI_GREEN + "Texto desriptografado com sucesso!\nResultado:" + textoDescriptografado + ANSI_RESET;
                    }
                }
                case 4 -> {
                    System.out.println("Tem certeza que quer gravar no arquivo?\n1 - Sim");
                    int op = scan.nextInt();

                    if (op == 1) {
                        if (!textoCriptografado.isEmpty()) {
                            mensagem = gravarMensagem(0, textoCriptografado);
                        } else {
                            mensagem = ANSI_RED + "Nenhum texto foi criptografado para gravacao" + ANSI_RESET;
                        }
                        if (!textoDescriptografado.isEmpty()) {
                            mensagem = gravarMensagem(1, textoDescriptografado);
                        } else {
                            mensagem = ANSI_RED + "Nenhum texto foi descriptografado para gravacao" + ANSI_RESET;

                        }
                    } else {
                        mensagem = ANSI_RED + "Texto nao gravado!" + ANSI_RESET;
                    }

                }
                case 5 -> {
                    if (ArquivoTexto.lerRegisro().isEmpty()) {
                        mensagem = ANSI_RED + "Arquivo Vazio!" + ANSI_RESET;
                    }
                }
            }

            System.out.println(mensagem);
            mensagem = "";
        }
    }
}
