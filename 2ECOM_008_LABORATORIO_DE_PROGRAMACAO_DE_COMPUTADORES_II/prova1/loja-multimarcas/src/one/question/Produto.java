/*
    Alunos: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
*/

package one.question;

import java.util.*;

public class Produto {

    private String nome;
    private String marca;
    private String modelo;
    private int nSerie;
    private String dataFabricacao;
    private int nLote;
    private String nomeTransportadora;
    private ArrayList<Fornecedor> fornecedores;
    Random aleatorio = new Random();

    private int valorPositivoAleatorio() {
        int numAleatorio = aleatorio.nextInt() % 100000;

        if (numAleatorio < 0) {
            numAleatorio = valorPositivoAleatorio();
        }

        return numAleatorio;
    }

    public Produto() {
        this.marca = "";
        this.modelo = "";
        this.nome = "";
        this.nSerie = valorPositivoAleatorio();
        this.nLote = valorPositivoAleatorio();
        this.nLote = 1 + (aleatorio.nextInt() % 1001);
        this.dataFabricacao = "10/01/2021";
        this.nomeTransportadora = "Loggi";
        this.fornecedores = new ArrayList<>();
    }


    public void adicionarFornecedores(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getnLote() {
        return nLote;
    }

    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
