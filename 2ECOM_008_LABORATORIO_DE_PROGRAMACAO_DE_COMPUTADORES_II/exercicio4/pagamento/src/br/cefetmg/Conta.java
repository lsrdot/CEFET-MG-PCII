package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */
public abstract class Conta	implements Pagavel {
	protected int dia, mes, diaPagamento, mesPagamento;
	protected double valor;

	public Conta() {
		dia = 0;
		mes = 0;
		diaPagamento = 0;
		valor = 0.0;
	}

	public Conta(int dia, int mes, int diaPagamento, int mesPagamento, double valor) {
		setDia(dia);
		setMes(mes);
		setValor(valor);
		setDiaPagamento(diaPagamento);
		setMesPagamento(mesPagamento);
	}

	@Override
	public double getValorAPagar() {
		return valor;
	}

	// Métodos setter
	public void setDiaPagamento(int diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setMesPagamento(int mesPagamento) {
		this.mesPagamento = mesPagamento;
	}

	// Métodos getter
	public int getDiaPagamento() {
		return diaPagamento;
	}
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public double getValor() {
		return valor;
	}

	public int getMesPagamento() {
		return mesPagamento;
	}
}