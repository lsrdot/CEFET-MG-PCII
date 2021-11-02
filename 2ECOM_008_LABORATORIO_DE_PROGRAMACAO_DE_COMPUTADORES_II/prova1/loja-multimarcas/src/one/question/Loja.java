/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
    Matricula: 20203018919, 20203018697.
*/

package one.question;

import java.util.*;

public class Loja {

    private String nome;
    private String endereco;
    private ArrayList<Produto> produtos;


    public Loja() {
        this.nome = "";
        this.endereco = "";
        this.produtos = new ArrayList<>();
    }

    public Loja(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
        this.produtos = new ArrayList<>();
    }

    private String listarFornecedores(Produto p) {

        String msg = "";

        for (Fornecedor f : p.getFornecedores()) {
            int numFornec = (p.getFornecedores().indexOf(f) + 1);
            msg += "\nfornecedor: " + numFornec + " -> nome: "
                    + f.getNome() + " -> telefone: " + f.getTelefone();
        }

        return msg;

    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("data de fabricacao: " + produto.getDataFabricacao());
            System.out.println("marca: " + produto.getMarca());
            System.out.println("modelo: " + produto.getModelo());
            System.out.println("lote: " + (produto.getnLote() < 0 ?  produto.getnLote() * -1 : produto.getnLote()));
            System.out.println("transportadora: " + produto.getNomeTransportadora());
            System.out.println("n° de serie: " + produto.getnSerie());
            System.out.println(listarFornecedores(produto) + "\n");
        }
    }

    public void listarProdutosPorNome(String nomeProduto) {

        String msg = "";

        for (Produto p : produtos) {

            if (p.getNome().equalsIgnoreCase(nomeProduto)) {

                msg = "nome: " + p.getNome() + "\n" +
                        "marca: " + p.getMarca() + "\n" +
                        "modelo: " + p.getModelo() + "\n" +
                        "lote: " +  (p.getnLote() < 0 ?  p.getnLote() * -1 : p.getnLote()) +
                        listarFornecedores(p) + "\n" +
                        "data de fabricacao: " + p.getDataFabricacao() + "\n" +
                        "numero de serie: " + p.getnSerie() + "\n" +
                        "transportadora: " + p.getNomeTransportadora() + "\n";
                System.out.println(msg);
                break;
            }

        }
    }

    public void listarProdutosPorFornecedor(String nomeFornecedor) {

        String msg = "";

        for (Produto p : produtos) {

            for (Fornecedor f : p.getFornecedores()) {

                if (f.getNome().equalsIgnoreCase(nomeFornecedor)) {

                    msg = "nome: " + p.getNome() + "\n" +
                            "marca: " + p.getMarca() + "\n" +
                            "modelo: " + p.getModelo() + "\n" +
                            "lote: " + (p.getnLote() < 0 ?  p.getnLote() * -1 : p.getnLote()) +
                            listarFornecedores(p) + "\n" +
                            "data de fabricacao: " + p.getDataFabricacao() + "\n" +
                            "numero de serie: " + p.getnSerie() + "\n" +
                            "transportadora: " + p.getNomeTransportadora() + "\n";
                    System.out.println(msg);
                }
            }

        }
    }

    public void adicionarProduto(Produto produto) {
        if (!produto.getFornecedores().isEmpty()) {
            produtos.add(produto);
        } else {
            System.out.println("Nenhum fornecedor cadastrado anteriormente");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
