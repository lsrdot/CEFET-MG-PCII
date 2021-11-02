package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Concessionaria extends Conta {
	private double valorTotal;

	public Concessionaria() {
		valorTotal = 0.0;
	}

	public void adicionarContas(double contaLuz, double contaAgua, double contaTelefone) {
		valorTotal += (contaLuz + contaAgua + contaTelefone);
	}

	@Override
	public double getValorAPagar() {
		return this.valorTotal;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}