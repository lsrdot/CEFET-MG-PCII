package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Titulo extends Conta {

	public Titulo() {
		super();
	}

	public Titulo(int dia, int diaPagamento, int mes, int mesPagamento, int valor) {
		setDia(dia);
		setDiaPagamento(diaPagamento);
		setMes(mes);
		setMesPagamento(mesPagamento);
		setValor(valor);
	}

	@Override
	public double getValorAPagar() {
		if (this.dia < this.diaPagamento && (this.mesPagamento >= this.mes)) {
			return (this.valor * (1 + .1));
		}
		return this.valor;
	}
}