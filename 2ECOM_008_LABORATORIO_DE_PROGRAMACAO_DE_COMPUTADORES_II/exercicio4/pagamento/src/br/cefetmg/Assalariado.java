package br.cefetmg;

public class Assalariado extends Empregado implements Pagavel {
	private int horasTrabalhadas;

	public Assalariado() {
		super();
	}

	public Assalariado(String nome, String sobreNome, int numIdent, int horasTrabalhadas) {
		setNome(nome);
		setSobreNome(sobreNome);
		setNumIdent(numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double getValorAPagar() {
		double valorFinal = 0.0;
		if (getHorasTrabalhadas() > 40) {
			valorFinal = (getHorasTrabalhadas() - 40) * ControlePagamento.HORA;
			valorFinal += ControlePagamento.SALARIO;
			return valorFinal;
		}
		return ControlePagamento.SALARIO;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}
