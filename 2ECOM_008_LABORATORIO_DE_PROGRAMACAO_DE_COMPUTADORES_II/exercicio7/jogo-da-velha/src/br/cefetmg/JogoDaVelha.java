package br.cefetmg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Random;

/**
 * CENTRO FEDERAL DE EDUCACAO TECNOLOGICA DE MINAS GERAIS (CEFET-MG).
 * DISCIPLICA: 2ECOM.017 - LABORATORIO DE SISTEMAS DIGITAIS PARA COMPUTACAO - T01 (2021.1 - 5T34).
 *
 * @author Lucas Siqueira Ribeiro - https://github.com/lucasdot
 * @author Pedro Costa Calazans - https://github.com/pedrocostacalazans
 *
 *
 * @version 1.0
 */

public class JogoDaVelha implements ActionListener {

    private final byte N_BOTOES = 9;
    private final Random aleatorio = new Random();
    private final JLabel texto = new JLabel();
    private final JButton[] campos = new JButton[N_BOTOES];
    private boolean vezJogador, empate = true;

    JogoDaVelha() {
        JFrame tabuleiro = new JFrame();
        tabuleiro.setSize(699, 699);
        tabuleiro.getContentPane().setBackground(new Color(1, 13, 42));
        tabuleiro.setLayout(new BorderLayout());
        tabuleiro.setVisible(true);

        texto.setBackground(new Color(1, 13, 42));
        texto.setForeground(new Color(124, 124, 124));
        texto.setFont(new Font("Verdana", Font.BOLD, 30));
        texto.setHorizontalAlignment(JLabel.CENTER);
        texto.setText("Jogo da Velha".toUpperCase(Locale.ROOT));
        texto.setBorder(BorderFactory.createLineBorder(new Color(0x7C7C7C)));
        //texto.setIcon(new ImageIcon());
        texto.setOpaque(true);

        JPanel titulo = new JPanel();
        titulo.setLayout(new BorderLayout());
        titulo.setBounds(0, 0, 699, 100);

        JPanel painelBotao = new JPanel();
        painelBotao.setLayout(new GridLayout(3, 3));
        painelBotao.setBackground(new Color(124, 124, 124));

        titulo.add(texto);
        tabuleiro.add(titulo, BorderLayout.NORTH);
        tabuleiro.add(painelBotao);

        for (int i = 0; i < N_BOTOES; i++) {
            campos[i] = new JButton();
            painelBotao.add(campos[i]);
            campos[i].setFont(new Font("Peace Sans", Font.BOLD, 80));
            campos[i].addActionListener(this);
            campos[i].setBackground(new Color(0x010D2A));

        }
        primeiroRound();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < N_BOTOES; i++) {
            if (e.getSource() == campos[i]) {
                if (vezJogador) {
                    if (campos[i].getText().equals("")) {
                        campos[i].setForeground(new Color(255, 255, 255));
                        campos[i].setText("o".toUpperCase(Locale.ROOT));
                        vezJogador = false;
                        texto.setText("(x)".toUpperCase(Locale.ROOT) + " eh a sua vez de jogar!");
                        verificarVencedor();
                    }
                } else {
                    if (campos[i].getText().equals("")) {
                        campos[i].setForeground(new Color(253, 0, 0));
                        campos[i].setText("x".toUpperCase(Locale.ROOT));
                        vezJogador = true;
                        texto.setText("(o)".toUpperCase(Locale.ROOT) + " eh a sua vez de jogar!");
                        verificarVencedor();
                    }
                }
            }
        }

    }

    private void primeiroRound() {
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (aleatorio.nextInt(2) == 0) {
            vezJogador = false;
            texto.setText("(x)".toUpperCase(Locale.ROOT) + " eh a sua vez de jogar!");
        } else {
            vezJogador = true;
            texto.setText("(o)".toUpperCase(Locale.ROOT) + " eh a sua vez de jogar!");
        }

    }

    private void verificarVencedor() {
        //################################ (X) Vence #########################################
        if (    (campos[0]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                campos[1].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                campos[2].getText().equals("x".toUpperCase(Locale.ROOT))) {
                xVence(0, 1, 2);
                empate = false;
        } else if ((campos[3]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[5].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(3, 4, 5);
                    empate = false;
        } else if ((campos[6]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[7].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(6, 7, 8);
                    empate = false;
        } else if ((campos[0]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[3].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[6].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(0, 3, 6);
                    empate = false;
        } else if ((campos[1]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[7].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(1, 4, 7);
                    empate = false;
        } else if ((campos[2]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[5].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(2, 5, 8);
                    empate = false;
        } else if ((campos[0]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(0, 4, 8);
                    empate = false;
        } else if ((campos[2]).getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("x".toUpperCase(Locale.ROOT)) &&
                    campos[6].getText().equals("x".toUpperCase(Locale.ROOT))) {
                    xVence(2, 4, 6);
                    empate = false;
        }
        //################################ (O) Vence #########################################
        if (    (campos[0]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                campos[1].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                campos[2].getText().equals("o".toUpperCase(Locale.ROOT))) {
                oVence(0, 1, 2);
                empate = false;

        } else if ((campos[3]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[5].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(3, 4, 5);
                    empate = false;
        } else if ((campos[6]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[7].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(6, 7, 8);
                    empate = false;
        } else if ((campos[0]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[3].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[6].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(0, 3, 6);
                    empate = false;
        } else if ((campos[1]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[7].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(1, 4, 7);
                    empate = false;
        } else if ((campos[2]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[5].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(2, 5, 8);
                    empate = false;
        } else if ((campos[0]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[8].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(0, 4, 8);
                    empate = false;
        } else if ((campos[2]).getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[4].getText().equals("o".toUpperCase(Locale.ROOT)) &&
                    campos[6].getText().equals("o".toUpperCase(Locale.ROOT))) {
                    oVence(2, 4, 6);
                    empate = false;
        }
        empate();

    }

    private void empate() {
        int cont = 0;
        for (int i = 0; i < N_BOTOES; i++) {
            if (campos[i].getText() != "" && campos[i].getText() != null) {
                cont++;
            }
        }
        if(cont == 9 && empate) {
            texto.setText("deu velha! empate.".toUpperCase(Locale.ROOT));
            for (int i = 0; i < N_BOTOES; i++) {
                campos[i].setBackground(Color.ORANGE);
                campos[i].setEnabled(false);
            }

        }
    }

    private void oVence(int x, int y, int z) {
        campos[x].setBackground(Color.green);
        campos[y].setBackground(Color.green);
        campos[z].setBackground(Color.green);
        for (int i = 0; i < N_BOTOES; i++) {
            campos[i].setEnabled(false);
        }
        texto.setText("(o) voce eh o vencedor".toUpperCase(Locale.ROOT));

    }

    private void xVence(int x, int y, int z) {
        campos[x].setBackground(Color.green);
        campos[y].setBackground(Color.green);
        campos[z].setBackground(Color.green);
        for (int i = 0; i < N_BOTOES; i++) {
            campos[i].setEnabled(false);
        }
        texto.setText("(x) voce eh o vencedor".toUpperCase(Locale.ROOT));
    }

}
