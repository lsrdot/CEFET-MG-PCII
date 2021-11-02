/*
        Nomes: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
        Matrículas: 20203018919, 20203018697.
 */

public class Lance {

    private Pessoa pessoa;
    private float valor;

    public Lance() {
        this.pessoa = new Pessoa();
        this.valor = 0.0f;
    }

    public Lance(Pessoa pessoa, float valor) {
        setPessoa(pessoa);
        setValor(valor);
    }

    // Métodos setter
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    // Métodos getter
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public float getValor() {
        return this.valor;
    }

}