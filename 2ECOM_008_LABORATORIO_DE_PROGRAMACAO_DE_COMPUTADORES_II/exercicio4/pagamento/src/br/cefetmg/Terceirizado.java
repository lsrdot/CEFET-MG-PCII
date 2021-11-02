package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Terceirizado extends Empregado {
	private int horasTrabalhadas;

	public Terceirizado() {
		super();
		this.horasTrabalhadas = 0;
	}

	public Terceirizado(String nome, String sobreNome, int numIdent, int horasTrabalhadas) {
		setNome(nome);
		setSobreNome(sobreNome);
		setNumIdent(numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double getValorAPagar() {
		return getHorasTrabalhadas() * ControlePagamento.HORA;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}