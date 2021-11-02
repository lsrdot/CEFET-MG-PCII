package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public abstract class Empregado implements Pagavel{
	protected String nome, sobreNome;
	protected int numIdent;

	public Empregado() {
		nome = "";
		sobreNome = "";
		numIdent = 0;
	}

	public Empregado(String nome, String sobrenome, int numIdent) {
		setNome(nome);
		setSobreNome(sobrenome);
		setNumIdent(numIdent);
	}

	@Override
	public double getValorAPagar() {
		return 0;
	}

	// Métodos setter
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public void setNumIdent(int numIdent) {
		this.numIdent = numIdent;
	}

	// Métodos getter
	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public int getNumIdent() {
		return numIdent;
	}
}