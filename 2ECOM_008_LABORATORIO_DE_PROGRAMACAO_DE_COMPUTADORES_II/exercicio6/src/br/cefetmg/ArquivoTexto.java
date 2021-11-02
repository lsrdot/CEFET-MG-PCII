package br.cefetmg;

import java.io.*;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 - 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lucasdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 * @version 1.0
 * Matriculas: 20203018919, 20203018697, 20203018801.
 */

public class ArquivoTexto {

    private static final String NOME_ARQUIVO = "encrypted.txt";
    public static BufferedWriter bw;
    public static BufferedReader br;

    public static void abrirArquivoEscrita() {
        try {
            bw = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
        } catch (Exception ex) {
            System.out.println(Enigma.ANSI_RED + ex.getMessage() + Enigma.ANSI_RESET);
        }
    }

    public static String lerRegisro() {
        String linhaArquivo = "", texto = "";
        try {
            br = new BufferedReader(new FileReader(NOME_ARQUIVO));

            if (br == null) {
                abrirArquivoEscrita();
            }

            while ((linhaArquivo = br.readLine()) != null) {
                texto += linhaArquivo + "\n";
                System.out.println(Enigma.ANSI_CYAN + linhaArquivo + Enigma.ANSI_RESET);
            }

            fecharArquivo();
        } catch (FileNotFoundException fnfex) { //Como estamos criando o arquivo, caso ele nao exista, podemos concluir  que
            // o arquivo sempre ira existir apartir da primeira instancia.
            // Portanto, para nao exibir a exception capturada pelo BufferedReader, adicionamos este try catch

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return texto;
    }

    public static String gravarRegistro(String line) {
        try {
            String texto = lerRegisro();
            abrirArquivoEscrita();
            bw.write(texto + line);
            fecharArquivo();
            return Enigma.ANSI_GREEN + "Texto Gravado com sucesso!" + Enigma.ANSI_RESET;
        } catch (Exception ex) {
            System.out.println(Enigma.ANSI_RED + ex.getMessage() + Enigma.ANSI_RESET);
            return Enigma.ANSI_RED + "Falha ao Gravar no arquivo" + Enigma.ANSI_RESET;
        }
    }

    public static void fecharArquivo() throws IOException {

        if (bw != null) {
            bw.close();
        }

        if (br != null) {
            br.close();
        }

    }


}
