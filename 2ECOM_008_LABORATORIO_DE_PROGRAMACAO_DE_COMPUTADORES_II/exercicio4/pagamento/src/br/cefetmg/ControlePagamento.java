package br.cefetmg;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class ControlePagamento {

	private final ArrayList<Pagavel> pagaveis = new ArrayList<>();
	public static final double SALARIO = 954.0;
	public static final double HORA = 8.0;

	// Método para adicionar a coleção
	public void adicionarPagamento(Pagavel pagavel) {
		pagaveis.add(pagavel);
	}

	public double getPagamentoAssalariados() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if (pagavel instanceof Assalariado) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	public double getPagamentoTerceirizados() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if (pagavel instanceof Terceirizado) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	public double getPagamentoComissionados() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if ((pagavel instanceof Comissionado) &&  !(pagavel instanceof AssalariadoComissionado)) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	public double getPagamentoAssalariadosComissionados() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if (pagavel instanceof AssalariadoComissionado) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	public double getPagamentoTitulos() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if (pagavel instanceof Titulo) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	public double getPagamentoConcessionaria() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			if (pagavel instanceof Concessionaria) {
				sum += pagavel.getValorAPagar();
			}
		}
		return sum;
	}

	// Método getter
	public double getValorAPagar() {
		double sum = 0;
		for (Pagavel pagavel : pagaveis) {
			sum += pagavel.getValorAPagar();
		}
		return sum;
	}
}