// Aluno: Lucas Siqueira Ribeiro, Pedro Costa Calazans.
// Matrícula: 20203018919, 20203018697.
// 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II

public class RelogioTeste {

    public static void main(String[] args) {

        var clock = new Relogio();
        // Condição relativa a formatação do relógio: false para formato a.m./p.m., true para formato 24 horas.
        clock.setFormato24h(false);

        // Loop de duas dimensões que percorre as horas e minutos
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                clock.ticTac(); // Método usado para acrescentar valor aos contadores minuto e hora.
                System.out.println(clock.getDisplayFormatado()); // Imprimindo a hora em formato String de acordo a condição estabelecida em "setFormato24h".
            }
        }
    }
}
