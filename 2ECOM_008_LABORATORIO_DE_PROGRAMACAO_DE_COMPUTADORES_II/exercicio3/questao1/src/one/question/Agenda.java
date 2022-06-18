/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
*/
package one.question;

import java.util.*;

public class Agenda {

    private ArrayList<Contato> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        agenda.add(contato);

    }

    public int getTotalContatos() {
        return agenda.size();
    }

    public Contato pesquisarContato(String nome) {
        for (Contato contato: agenda) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void removerContato(String nome) {
        boolean existe = false;
        for (Contato contato: agenda) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                existe = true;
                agenda.remove(contato);
                System.out.println("Contato removido com sucesso!");
                break;
            }

        }
        if(existe == false) {
            System.out.println("Esse contato não existe, portanto nenhum contato foi excluído!");
        }

    }

    public void listarContatos() {
        for(Contato contato: agenda) {
            System.out.println();
            System.out.println("Nome: " + contato.getNome());
            System.out.println("telefone: " + contato.getTelefone());
            System.out.println("Email: " + contato.getEmail());
            System.out.println();
        }

    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        return false;
    }
}
