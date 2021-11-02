package br.cefetmg.question.second;

import java.util.Scanner;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class TesteDois {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CaixaDeBrinquedoDois caixaDeBrinquedoDois = new CaixaDeBrinquedoDois();

        int op;
        for (;true;) {
            System.out.println("\t\t\t\t\n#################### BEM VINDO AO SISTEMA DA CAIXA DE BRINQUEDOS!!! ####################\n");
            System.out.println("\n\tGostaria de sair do programa? Se sim, digite: 0");
            System.out.println("\tGostaria de adicionar um triangulo a caixa de brinquedos? Se sim, digite: 1.");
            System.out.println("\tGostaria de adicionar um quadrado a caixa de brinquedos? Se sim, digite: 2.");
            System.out.println("\tGostaria de adicionar um circulo a caixa de brinquedos? Se sim, digite: 3.");
            System.out.println("\tGostaria de adicionar um tetraedo a caixa de brinquedos? Se sim, digite: 4.");
            System.out.println("\tGostaria de adicionar um cubo a caixa de brinquedos? Se sim, digite: 5.");
            System.out.println("\tGostaria de adicionar uma esfera a caixa de brinquedos? Se sim, digite: 6.");
            System.out.println("\tGostaria de exibir informacoes sobre os brinquedos inseridos na caixa? Se sim, digite: 7.");
            System.out.println("\tGostaria de esvaziar a caixa de brinquedos? Se sim, digite: 8.");
            op = scan.nextInt();
            switch (op) {
                case 0 -> System.exit(0);
                case 1 -> {
                    scan.nextLine();
                    System.out.print("\n\t Digite a cor do triangulo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\t Digite o valor da base: ");
                    double base = scan.nextDouble();
                    System.out.print("\n\t Digite o valor da altura: ");
                    double altura = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo( new TrianguloDois(cor, base, altura));
                    scan.nextLine();
                }
                case 2 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do quadrado: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do lado: ");
                    double lado = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo(new QuadradoDois(cor, lado));
                    scan.nextLine();
                }
                case 3 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do circulo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do raio: ");
                    double raio = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo(new CirculoDois(cor, raio));
                    scan.nextLine();
                }
                case 4 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do tetraedo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor da aresta: ");
                    double aresta = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo(new TetraedroDois(cor, aresta));
                    scan.nextLine();
                }
                case 5 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do cubo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor da aresta: ");
                    double aresta = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo(new CuboDois(cor, aresta));
                    scan.nextLine();
                }
                case 6 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor da esfera: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do raio: ");
                    double raio = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedoDois.adicionarBrinquedo(new EsferaDois(cor, raio));
                    scan.nextLine();
                }
                case 7 -> caixaDeBrinquedoDois.apresentarBrinquedos();
                case 8 -> caixaDeBrinquedoDois.esvaziarCaixa();
                default -> System.out.println("Opção invalida! Selecione outra opcao.");
            }
        }
    }
}
