/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
 */

public class Produto {

    private String descricao;
    private Lance maiorLance;

    public Produto() {
        this.descricao = "";
        this.maiorLance = new Lance();
    }

    public Produto(String descricao, Lance maiorLance) {
        setDescricao(descricao);
        setMaiorLance(maiorLance);
    }

    public void verificarMaiorLance(Lance lance) {
        if (lance.getValor() > getMaiorLance().getValor()) {
            setMaiorLance(lance);
        }
    }

    // Métodos setter
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }

    // Métodos getter
    public String getDescricao() {
        return this.descricao;
    }

    public Lance getMaiorLance() {
        return this.maiorLance;
    }

}
