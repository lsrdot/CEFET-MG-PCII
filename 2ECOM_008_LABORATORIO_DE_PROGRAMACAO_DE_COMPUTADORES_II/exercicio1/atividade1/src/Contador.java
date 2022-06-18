// Aluno: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
// 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II

public class Contador {

    private int limite;
    private int valor;

    Contador() {

    }
    Contador(int valor, int limite) {
        this.valor = valor;
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.valor++;
        if(this.valor >= this.limite) {
            this.valor = 0;
        }
    }
}
