/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
*/
package two.question;

import one.question.Contato;
import java.util.*;

public class NovaAgenda {
    private final HashMap<String, Contato> agenda;

    public NovaAgenda() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(Contato contato) {
        agenda.put(contato.getNome(), contato);

    }

    public int getTotalContatos() {
        return agenda.size();
    }

    public Contato pesquisarContato(String nome) {
        /*for (Map.Entry<String, Contato> contato : agenda.entrySet()) {
            if(agenda.get(nome).equals(agenda.get().getNome())) {
                return agenda.get(contato);
            }
        }*/
        for (String chave : agenda.keySet()) {
            if(chave.equalsIgnoreCase(nome)) {
                Contato valor = agenda.get(chave);
                return valor;
            }
        }
        return null;
    }

    public void removerContato(String nome) {
        boolean existe = false;
        for (String chave : agenda.keySet()) {
            if(chave.equalsIgnoreCase(nome)) {
                existe = true;
                agenda.remove(chave);
                System.out.println("Contato removido com sucesso!");
                break;
            }

        }
        if(existe == false) {
            System.out.println("Esse contato não existe, portanto nenhum contato foi excluído!");
        }

    }

    public void listarContatos() {
        for (String chave : agenda.keySet()) {
            Contato valor = agenda.get(chave);
            System.out.println();
            System.out.println("Nome: " + valor.getNome());
            System.out.println("telefone: " + valor.getTelefone());
            System.out.println("Email: " + valor.getEmail());
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
