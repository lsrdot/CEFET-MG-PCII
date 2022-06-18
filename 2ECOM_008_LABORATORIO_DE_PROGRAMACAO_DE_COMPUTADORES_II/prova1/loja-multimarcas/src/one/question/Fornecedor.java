/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
*/

package one.question;

import java.util.*;

public class Fornecedor {
    private String nome;
    private String telefone;


    public Fornecedor() {
        this.nome = "";
        this.telefone = "";
    }

    public Fornecedor(String nome, String telefone) {
        setNome(nome);
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
}
