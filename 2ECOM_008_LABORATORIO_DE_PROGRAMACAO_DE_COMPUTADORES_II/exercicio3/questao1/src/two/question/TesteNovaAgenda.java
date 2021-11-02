/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
    Matricula: 20203018919, 20203018697.
*/
package two.question;

import one.question.Agenda;
import one.question.Contato;

import java.util.*;

public class TesteNovaAgenda {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        NovaAgenda agenda = new NovaAgenda();
        Contato contato;

        while(flag) {
            System.out.println("==================================\n" +
                    "Selecione a opção desejada:\n" +
                    "(1) - Inserir novo contato na agenda\n" +
                    "(2) - Exibir o número total de contatos da agenda\n" +
                    "(3) - Exibir um contato (pesquisar pelo nome)\n" +
                    "(4) - Excluir um contato (pesquisar pelo nome)\n" +
                    "(5) - Exibir todos os contatos da agenda\n" +
                    "(0) - Sair\n" +
                    "==================================");

            int opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    String auxNome, auxTel, auxEmail;
                    System.out.print("Digite o nome: ");
                    auxNome = input.nextLine();
                    System.out.print("\nDigite o telefone: ");
                    auxTel = input.nextLine();
                    System.out.print("\nDigite o email: ");
                    auxEmail = input.nextLine();
                    agenda.adicionarContato( contato = new Contato(auxNome, auxTel, auxEmail));
                    break;
                case 2:
                    System.out.print("O numero total de contatos da agenda eh: ");
                    System.out.println(agenda.getTotalContatos());
                    break;
                case 3:
                    String nomeTmp = input.nextLine();
                    if (agenda.pesquisarContato(nomeTmp) != null) {
                        System.out.println("\nO nome do contato eh: " + agenda.pesquisarContato(nomeTmp).getNome());
                        System.out.println("O telefone do contato eh: " + agenda.pesquisarContato(nomeTmp).getTelefone());
                        System.out.println("O email do contato eh: " + agenda.pesquisarContato(nomeTmp).getEmail() + "\n");
                    }
                    else {
                        System.out.println("Esse contato nao existe!");
                    }
                    break;
                case 4:
                    agenda.removerContato(input.nextLine());
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalida, tente outra vez.");


            }
        }
        input.close();
    }
}
