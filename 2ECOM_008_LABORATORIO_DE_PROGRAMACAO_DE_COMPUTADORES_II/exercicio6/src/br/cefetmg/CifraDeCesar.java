package br.cefetmg;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 -
 * 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lsrdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 */

public class CifraDeCesar {

    public static Chave chave = new Chave();

    public static String cifrar(String line) { // Estamos desconsiderando numeros, uma vez que a cifra de cesar
        // criptografa somente letras, conforme indicado.

        System.out.println("Criptografando o texto: '" + line + "'...");

        String encrypted = "";

        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < Chave.alfabeto.length(); j++) {
                if (line.charAt(i) == Chave.alfabeto.charAt(j)) {

                    int deslocamento = chave.deslocamento % 25;
                    char numAscCaracterDeslocado = (char) (line.charAt(i) + (deslocamento));


                    char letra = line.charAt(i);
                    letra = (char) (line.charAt(i) + chave.deslocamento);


                    int diferenca = 0; // Verifica quantas letras depois do z ele ultrapassou

                    if (Character.isUpperCase(line.charAt(i))) {
                        if (numAscCaracterDeslocado > 90) {
                            diferenca = numAscCaracterDeslocado - 90;
                            numAscCaracterDeslocado = (char) (64 + diferenca);
                        }
                    } else {
                        if (numAscCaracterDeslocado > 122) {
                            diferenca = numAscCaracterDeslocado - 122;
                            numAscCaracterDeslocado = (char) (96 + diferenca);
                        }
                    }
                    encrypted += (char) numAscCaracterDeslocado;
                    break;
                } else if (line.charAt(i) == 32) {
                    encrypted += (char) (line.charAt(i));
                    break;
                }
            }
        }

        return encrypted;
    }

    public static String decifrar(String line) {
        String decrypted = "";

        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < Chave.alfabeto.length(); j++) {
                if (line.charAt(i) == Chave.alfabeto.charAt(j)) {

                    int deslocamento = chave.deslocamento % 25;
                    int numAscCaracterDeslocado = line.charAt(i) - deslocamento;
                    int diferenca = 0; // Verifica quantas letras depois do z ele ultrapassou

                    if (Character.isUpperCase(line.charAt(i))) {
                        if (numAscCaracterDeslocado < 65) {
                            diferenca = 65 - numAscCaracterDeslocado;
                            numAscCaracterDeslocado = 91 - diferenca;
                        }
                    } else {
                        if (numAscCaracterDeslocado < 97) {
                            diferenca = 97 - numAscCaracterDeslocado;
                            numAscCaracterDeslocado = 123 - diferenca;
                        }
                    }

                    decrypted += (char) numAscCaracterDeslocado;
                    break;
                } else if (line.charAt(i) == 32) {
                    decrypted += (char) (line.charAt(i));
                    break;
                }
            }
        }

        return decrypted;
    }

}
