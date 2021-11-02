package br.cefetmg;

import org.w3c.dom.ls.LSOutput;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Comissionado extends Empregado {

	private double valorVendas = 0;

	public Comissionado() {
		super();
		this.valorVendas = 0;
	}

	public Comissionado(String nome, String sobreNome, int numIdent, double valorVendas) {
		setNome(nome);
		setSobreNome(sobreNome);
		setNumIdent(numIdent);
		setValorVendas(valorVendas);
	}

	// Métodos setter
	public void setValorVendas(double valorVendas) {
		this.valorVendas += valorVendas;
	}
	// Métodos getter
	@Override
	public double getValorAPagar() {
		return (getValorVendas() * (1 - .94));
	}

	public double getValorVendas() {
		return this.valorVendas;
	}


}