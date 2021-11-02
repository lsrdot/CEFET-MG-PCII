/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
        Matrículas: 20203018919, 20203018697.
 */

import java.util.Scanner;

public class TesteLeilao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        var leilao = new Leilao();

        // Participantes do leilao
        var pessoa1 = new Pessoa("Pedro", "pedro@email.com");
        var pessoa2 = new Pessoa("Joao", "joao@email.com");
        var pessoa3 = new Pessoa("Lucas", "lucas@email.com");
        var pessoa4 = new Pessoa("Luiza", "luiza@email.com");

        // Insercao dos produtos
        var produto1 = new Produto();
        var produto2 = new Produto();
        var produto3 = new Produto();
        var produto4 = new Produto();

        var lote1 = new Lote();
        var lote2 = new Lote();

        System.out.println("-----------------    Bem vindo ao leilao     *****************");
        System.out.println("***************** Inserir produtos no leilao *****************");
        System.out.println();
        System.out.println("\t\t\t<<< Lote 1 >>>");
        System.out.println();

        System.out.print("Digite a descricao do 1° produto: ");
        produto1.setDescricao(input.nextLine());
        lote1.inserirProduto(produto1);

        System.out.print("Digite a descricao do 2° produto: ");
        produto2.setDescricao(input.nextLine());
        lote1.inserirProduto(produto2);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("***************** Inserir produtos no leilao *****************");
        System.out.println();
        System.out.println("\t\t\t<<< Lote 2 >>>");
        System.out.println();

        System.out.print("Digite a descricao do 1° produto: ");
        produto3.setDescricao(input.nextLine());
        lote2.inserirProduto(produto3);

        System.out.print("Digite a descricao do 2° produto: ");
        produto4.setDescricao(input.nextLine());
        lote2.inserirProduto(produto4);

        leilao.inserirLote(lote1);
        leilao.inserirLote(lote2);

        //System.out.println(leilao.getLotes()[1].getProdutos()[0].getDescricao());

        System.out.println();

        // Realizar lances
        Lance[] lances = new Lance[4];
        float valorLanceTemp = 1;
        int numProd = 0;
        int numLote = 0;
        int op = 1;

        while(op != 0) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Produtos do lote " + (numLote + 1));
            System.out.println("Facam seus lances para " + leilao.getLotes()[numLote].getProdutos()[numProd].getDescricao());

            System.out.println();

            System.out.print("\t" + pessoa1.getNome() + ", digite o valor do seu lance: ");
            valorLanceTemp = input.nextFloat();
            lances[0] = new Lance(pessoa1, valorLanceTemp);
            System.out.print("\t" + pessoa2.getNome() + ", digite o valor do seu lance: ");
            valorLanceTemp = input.nextFloat();
            lances[1] = new Lance(pessoa2, valorLanceTemp);
            System.out.print("\t" + pessoa3.getNome() + ", digite o valor do seu lance: ");
            valorLanceTemp = input.nextFloat();
            lances[2] = new Lance(pessoa3, valorLanceTemp);
            System.out.print("\t" + pessoa4.getNome() + ", digite o valor do seu lance: ");
            valorLanceTemp = input.nextFloat();
            lances[3] = new Lance(pessoa4, valorLanceTemp);

            for (int j = 0; j < lances.length; j++) {
                leilao.getLotes()[numLote].getProdutos()[numProd].verificarMaiorLance(lances[j]);
            }

            if (numProd == 1 && numLote == 1) {
                System.out.println();
                System.out.println("\tTodos os produtos do lote 1 e 2 já possuem lances. \nDigite 0 para encerrar e exibir resultados");
                System.out.println();
            } else {
                System.out.println("Digite 1 para lances em outros produtos ou 0 para encerrar e imprimir resultados!");
            }

            op = input.nextInt();
            if (op == 1){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                if (numProd == 1) {
                    numProd = 0;
                    numLote++;
                } else {
                    numProd++;
                }
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                leilao.encerrarLeilao();
            }
        }


    }
}