package br.cefetmg.question.first;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Teste {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CaixaDeBrinquedo caixaDeBrinquedo = new CaixaDeBrinquedo();

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
                    caixaDeBrinquedo.adicionarBrinquedo( new Triangulo(cor, base, altura));
                    scan.nextLine();
                }
                case 2 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do quadrado: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do lado: ");
                    double lado = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedo.adicionarBrinquedo(new Quadrado(cor, lado));
                    scan.nextLine();
                }
                case 3 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do circulo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do raio: ");
                    double raio = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedo.adicionarBrinquedo(new Circulo(cor, raio));
                    scan.nextLine();
                }
                case 4 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do tetraedo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor da aresta: ");
                    double aresta = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedo.adicionarBrinquedo(new Tetraedro(cor, aresta));
                    scan.nextLine();
                }
                case 5 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor do cubo: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor da aresta: ");
                    double aresta = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedo.adicionarBrinquedo(new Cubo(cor, aresta));
                    scan.nextLine();
                }
                case 6 -> {
                    scan.nextLine();
                    System.out.print("\n\tDigite a cor da esfera: ");
                    String cor = scan.nextLine();
                    System.out.print("\n\tDigite o valor do raio: ");
                    double raio = scan.nextDouble();
                    System.out.println();
                    caixaDeBrinquedo.adicionarBrinquedo(new Esfera(cor, raio));
                    scan.nextLine();
                }
                case 7 -> caixaDeBrinquedo.apresentarBrinquedos();
                case 8 -> caixaDeBrinquedo.esvaziarCaixa();
                default -> System.out.println("Opção invalida! Selecione outra opcao.");
            }
        }
    }
}
