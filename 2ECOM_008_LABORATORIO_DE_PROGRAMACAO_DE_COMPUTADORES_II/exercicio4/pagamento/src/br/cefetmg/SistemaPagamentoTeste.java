package br.cefetmg;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

class SistemaPagamentoTeste {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ControlePagamento controle = new ControlePagamento();

		Assalariado funcAssalariado1 = new Assalariado("Pedro", "Costa Calazans", 123, 45);
		controle.adicionarPagamento(funcAssalariado1);
		Assalariado funcAssalariado2 = new Assalariado("Lucas", "Siqueira Ribeiro", 132, 45);
		controle.adicionarPagamento(funcAssalariado2);
		Assalariado funcAssalariado3 = new Assalariado("Ednaldo", "Pereira", 433, 45);
		controle.adicionarPagamento(funcAssalariado3);

		Terceirizado funcTerceirizado1 = new Terceirizado("Luciana", "Campos", 634, 48);
		controle.adicionarPagamento(funcTerceirizado1);
		Terceirizado funcTerceirizado2 = new Terceirizado("Joao", "Costa Calazans", 124, 50);
		controle.adicionarPagamento(funcTerceirizado2);
		Terceirizado funcTerceirizado3 = new Terceirizado("Neymar", "Junior", 100, 50);
		controle.adicionarPagamento(funcTerceirizado3);

		Comissionado funcComissionado1 = new Comissionado("Lucas", "Costa Calazans", 132, 4000);
		controle.adicionarPagamento(funcComissionado1);
		Comissionado funcComissionado2 = new Comissionado("Joao", "Jimin", 145, 4000);
		controle.adicionarPagamento(funcComissionado2);
		Comissionado funcComissionado3 = new Comissionado("Nikola", "Tesla", 111, 4000);
		controle.adicionarPagamento(funcComissionado3);

		AssalariadoComissionado funcAssComissionado1 = new AssalariadoComissionado("Joao", "Jungkook", 234, 4000);
		controle.adicionarPagamento(funcAssComissionado1);
		AssalariadoComissionado funcAssComissionado2 = new AssalariadoComissionado("Lu", "Do Magalu", 230, 4000);
		controle.adicionarPagamento(funcAssComissionado2);
		AssalariadoComissionado funcAssComissionado3 = new AssalariadoComissionado("Elon", "Musk", 200, 4000);
		controle.adicionarPagamento(funcAssComissionado3);

		Titulo contaTitulo = new Titulo(21, 22,6, 7, 7000);
		controle.adicionarPagamento(contaTitulo);
		Titulo contaTitulo2 = new Titulo(21, 21, 6, 6, 1000);
		controle.adicionarPagamento(contaTitulo2);

		Concessionaria contaConcessionaria = new Concessionaria();
		contaConcessionaria.adicionarContas(400,200,600);
		controle.adicionarPagamento(contaConcessionaria);

		double valorContaTitulo = contaTitulo.getValorAPagar() + contaTitulo2.getValorAPagar();
		double valorContaConcessionaria = contaConcessionaria.getValorTotal();


		boolean menu = true;
		System.out.println("\n************************************ Sistema de Pagamento ************************************\n");
		while(menu) {

			System.out.println("\t0) - Para sair do programa" + "\n"
					         + "\t1) - Listar pagamento total a ser realizado aos funconarios assalariados" + "\n"
					         + "\t2) - Listar o pagamento total a ser realizado aos funcionarios terceirizados" + "\n"
			                 + "\t3) - Listar o pagamento total a ser realizado aos funcionarios comissionados" + "\n"
			                 + "\t4) - Listar o pagamento total a ser realizado aos funcionarios assalariados/comissionados" + "\n"
			                 + "\t5) - Listar o pagamento a fatura total de contas a ser realizado" + "\n"
			                 + "\t6) - Listar o pagamento total a ser realizado a todos os funcionarios" + "\n"
					         + "\t7) - listar o pagamento total a ser realizado (funcionarios e contas)");
			int op;
			op = input.nextInt();
			switch (op) {
				case 0:
					menu = false;
					break;
				case 1:
					System.out.println("Valor total: " + controle.getPagamentoAssalariados() + "\n\n");
					break;
				case 2:
					System.out.println("Valor total: " + controle.getPagamentoTerceirizados() + "\n\n");
					break;
				case 3:
					System.out.printf("Valor total: %.2f \n\n", controle.getPagamentoComissionados());
					break;
				case 4:
					System.out.printf("Valor total: %.2f \n\n", controle.getPagamentoAssalariadosComissionados());
					break;
				case 5:
					System.out.printf("Valor total de títulos: %.2f\n", controle.getPagamentoTitulos());
					System.out.printf("Valor total referente a concessionaria: %.2f\n", controle.getPagamentoConcessionaria());
					System.out.printf("Valor final a ser pago: %.2f\n\n", (controle.getPagamentoConcessionaria() + controle.getPagamentoTitulos()));
					break;
				case 6:
					System.out.println("valor total a ser pago aos funcionarios: " + (controle.getPagamentoAssalariados() + controle.getPagamentoTerceirizados() + controle.getPagamentoComissionados() + controle.getPagamentoAssalariadosComissionados()));
					break;
				case 7:
					System.out.println("Valor final a ser pago (despesas de funcionarios e titulos/concessionaria): " + (controle.getValorAPagar() + "\n"));
			}
		}
	}
}