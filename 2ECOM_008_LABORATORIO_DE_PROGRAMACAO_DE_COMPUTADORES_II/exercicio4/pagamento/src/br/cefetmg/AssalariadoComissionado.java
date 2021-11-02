package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class AssalariadoComissionado extends Comissionado {

	private double valorVendas;

	public AssalariadoComissionado() {
		super();
		this.valorVendas = 0;
	}

	public AssalariadoComissionado(String nome, String sobreNome, int numIdent, double valorVendas) {
		setNome(nome);
		setSobreNome(sobreNome);
		setNumIdent(numIdent);
		this.valorVendas = valorVendas;
	}

	// Métodos setter
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	// Métodos getter
	@Override
	public double getValorAPagar() {
		return (ControlePagamento.SALARIO * (1 + .1)) + (getValorVendasAss() * (.06));
	}

	public double getValorVendasAss() {
		return valorVendas;
	}
}