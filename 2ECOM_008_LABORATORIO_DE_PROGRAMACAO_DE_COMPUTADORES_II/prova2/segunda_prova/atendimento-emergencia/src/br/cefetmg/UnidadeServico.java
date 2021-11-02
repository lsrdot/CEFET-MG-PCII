package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class UnidadeServico {

    private String nome;
    private String telefone;
    private String endereco;

    public UnidadeServico() {
        this.nome = "";
        this.telefone = "";
        this.endereco = "";
    }

    public UnidadeServico(String nome, String telefone, String endereco) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
