/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
 */

public class Pessoa {

    private String nome;
    private String contato;

    public Pessoa() {
        this.nome = "";
        this.contato = "";
    }

    public Pessoa(String nome, String contato) {
        setNome(nome);
        setContato(contato);
    }

    // Métodos setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    // Métodos getter
    public String getNome() {
        return this.nome;
    }

    public String getContato() {
        return this.contato;
    }

}
