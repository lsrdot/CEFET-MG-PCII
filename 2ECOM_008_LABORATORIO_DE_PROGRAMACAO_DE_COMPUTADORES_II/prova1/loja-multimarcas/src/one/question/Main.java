/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
*/

package one.question;

import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        // Criando loja
        Loja loja = new Loja("Magazine Luciana", "Nova Gameleira, Rua Deusdalma n°20 - Belo Horizonte. Cep: 30510-390");

        // Instancia de produto
        Produto produtos = new Produto();

        // Instancia de fabricante
        Fornecedor fornecedores = new Fornecedor();

        while(flag) {
                    System.out.println("==================================\n" +
                    "Bem vindo ao sistema das lojas Magazine Luciana!\n" +
                    "Selecione a opção desejada:\n" +
                    "(1) - Cadastrar fornecedor\n" +
                    "(2) - Cadastrar produto (celular ou notebook)\n" +
                    "(3) - Listar todos os produtos (celular ou notebook)\n" +
                    "(4) - Buscar produto por nome (celular ou notebook)\n" +
                    "(5) - Buscar produto por fornecedor (celular ou notebook)\n" +
                    "(0) - Sair\n" +
                    "==================================");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do fornecedor: ");
                    fornecedores.setNome(input.nextLine());
                    System.out.print("Digite o telefone do fornecedor: ");
                    fornecedores.setTelefone(input.nextLine());
                    produtos.adicionarFornecedores(fornecedores);
                    fornecedores = new Fornecedor();
                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    produtos.setNome(input.nextLine());
                    System.out.print("Digite a marca: ");
                    produtos.setMarca(input.nextLine());
                    System.out.print("Digite o modelo: ");
                    produtos.setModelo(input.nextLine());

                    loja.adicionarProduto(produtos);
                    produtos = new Produto();

                    break;
                case 3:
                    loja.listarProdutos();
                    break;
                case 4:
                    String nomeTmp;
                    System.out.print("Digite o nome do produto: ");
                    nomeTmp = input.nextLine();
                    loja.listarProdutosPorNome(nomeTmp);
                    break;
                case 5:
                    System.out.print("Digite o nome do fornecedor: ");
                    nomeTmp = input.nextLine();
                    loja.listarProdutosPorFornecedor(nomeTmp);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalida, tente outra vez.");


            }
        }
        input.close();

    }
}
