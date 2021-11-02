/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
    Matricula: 20203018919, 20203018697.
*/
package one.question;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        this.nome = "";
        this.telefone = "";
        this.email = "";
    }

    public Contato(String nome, String telefone, String email) {
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
