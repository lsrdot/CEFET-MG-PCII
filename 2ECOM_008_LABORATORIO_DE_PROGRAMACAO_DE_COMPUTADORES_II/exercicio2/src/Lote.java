/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
        Matrículas: 20203018919, 20203018697.
 */

public class Lote {

    private Produto[] produtos;

    public Lote() {
        this.produtos = new Produto[2];
    }

    public void inserirProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                this.produtos[i] = produto;
                break;
            }
        }
    }

    // Método setter
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    // Método getter
    public Produto[] getProdutos() {
        return this.produtos;
    }

}