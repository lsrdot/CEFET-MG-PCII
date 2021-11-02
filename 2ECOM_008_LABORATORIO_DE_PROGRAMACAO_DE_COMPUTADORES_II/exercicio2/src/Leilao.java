/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
        Matrículas: 20203018919, 20203018697.
 */

public class Leilao {

    private Lote[] lotes;

    public Leilao() {
        this.lotes = new Lote[2];
    }

    public void inserirLote(Lote lote) {
        for (int i = 0; i < lotes.length; i++) {
            if (lotes[i] == null) {
                lotes[i] = lote;
                break;
            }
        }
    }

    public void receberLance(int numLote, String descricaoProduto, Lance lance) {

    }

    public void encerrarLeilao() {
        System.out.println("Obrigado por participar! Agora vamos aos resultados");
        System.out.println();
        listarProdutos();
    }

    public void listarProdutos() {
        for (int i = 0; i < lotes.length; i++) {
            for (int j = 0; j < lotes[i].getProdutos().length; j++) {
                if (lotes[i].getProdutos()[j].getMaiorLance().getValor() != 0) {
                    System.out.println(lotes[i].getProdutos()[j].getDescricao() + " --> Lance ganhador: R$" + lotes[i].getProdutos()[j].getMaiorLance().getValor() + " feito por " + lotes[i].getProdutos()[j].getMaiorLance().getPessoa().getNome());
                }
            }

        }

    }

    public Lote[] getLotes() {
        return this.lotes;
    }

}