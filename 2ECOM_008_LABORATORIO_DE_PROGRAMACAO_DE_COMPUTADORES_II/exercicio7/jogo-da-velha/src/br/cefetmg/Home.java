package br.cefetmg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * CENTRO FEDERAL DE EDUCACAO TECNOLOGICA DE MINAS GERAIS (CEFET-MG).
 * DISCIPLICA: 2ECOM.017 - LABORATORIO DE SISTEMAS DIGITAIS PARA COMPUTACAO - T01 (2021.1 - 5T34).
 *
 * @author Lucas Siqueira Ribeiro - https://github.com/lucasdot
 * @author Pedro Costa Calazans - https://github.com/pedrocostacalazans
 *
 * Matriculas: 20203018919, 20203018697.
 *
 * @version 1.0
 */

public class Home extends JFrame implements ActionListener {

    private final JLabel[] message;
    private final JButton botaoJogar;
    private final JButton[] botoesVitoria;
    private final JButton[] botoesDecrescimo;
    private final JButton botaoZerarPlacar;
    private final BorderLayout borderLayout;
    public static int countX = 0;
    public static int countO = 0;
    private String nomeJogador1;
    private String nomeJogador2;

    Home() {
        super("Home - Jogo da Velha");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(729, 400);
        this.getContentPane().setBackground(new Color(1, 13, 42));
        this.setLayout(new GridLayout(4, 1));
        this.setVisible(true);

        borderLayout = new BorderLayout(0, 0);

        message = new JLabel[3];

        message[0] = new JLabel();
        message[0].setHorizontalAlignment(JLabel.CENTER);
        message[0].setBackground(new Color(1, 13, 42));
        message[0].setForeground(new Color(124, 124, 124));
        message[0].setFont(new Font("Verdana", Font.BOLD, 30));
        message[0].setHorizontalAlignment(JLabel.CENTER);
        message[0].setText("jogo da velha".toUpperCase(Locale.ROOT));
        message[0].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        message[0].setOpaque(true);

        message[1] = new JLabel();
        message[1].setHorizontalAlignment(JLabel.CENTER);
        message[1].setBackground(new Color(1, 13, 42));
        message[1].setForeground(new Color(124, 124, 124));
        message[1].setFont(new Font("Verdana", Font.BOLD, 30));
        message[1].setHorizontalAlignment(JLabel.CENTER);
        message[1].setText("Placar de (X): ".toUpperCase(Locale.ROOT) + Home.countX);
        message[1].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        message[1].setOpaque(true);

        message[2] = new JLabel();
        message[2].setHorizontalAlignment(JLabel.CENTER);
        message[2].setBackground(new Color(1, 16, 54));
        message[2].setForeground(new Color(124, 124, 124));
        message[2].setFont(new Font("Verdana", Font.BOLD, 30));
        message[2].setHorizontalAlignment(JLabel.CENTER);
        message[2].setText("Placar de (O): ".toUpperCase(Locale.ROOT) + Home.countO);
        message[2].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        message[2].setOpaque(true);

        botaoJogar = new JButton("Jogar");
        botaoJogar.setBounds(300, 100, 100, 50);
        botaoJogar.addActionListener(this);
        botaoJogar.setBackground(new Color(0x7C7C7C));

        botaoZerarPlacar = new JButton("Zerar placar");
        botaoZerarPlacar.setBounds(250, 300, 200, 50);
        botaoZerarPlacar.addActionListener(this);
        botaoZerarPlacar.setBackground(new Color(0x7C7C7C));

        botoesVitoria = new JButton[2];
        botoesVitoria[0] = new JButton("+1 ponto (X)");
        botoesVitoria[1] = new JButton("+1 ponto (O)");
        botoesVitoria[0].setBounds(200, 100, 100, 50);
        botoesVitoria[1].setBounds(200, 100, 100, 50);
        botoesVitoria[0].addActionListener(this);
        botoesVitoria[1].addActionListener(this);
        botoesVitoria[0].setBackground(new Color(0x7C7C7C));
        botoesVitoria[1].setBackground(new Color(0x7C7C7C));

        botoesDecrescimo = new JButton[2];
        botoesDecrescimo[0] = new JButton("-1 ponto (X)");
        botoesDecrescimo[1] = new JButton("-1 ponto (O)");
        botoesDecrescimo[0].setBounds(200, 100, 100, 50);
        botoesDecrescimo[1].setBounds(200, 100, 100, 50);
        botoesDecrescimo[0].addActionListener(this);
        botoesDecrescimo[1].addActionListener(this);
        botoesDecrescimo[0].setBackground(new Color(0x7C7C7C));
        botoesDecrescimo[1].setBackground(new Color(0x7C7C7C));

        JPanel body = new JPanel();
        body.setLayout(new GridLayout(3, 1));
        body.setBounds(0, 0, 720, 100);

        if (this.nomeJogador1 == null) {
            message[1].setText("placar (x)".toUpperCase(Locale.ROOT) + Home.countX);
        } else {
            message[1].setText(this.nomeJogador1 + "(x): ".toUpperCase(Locale.ROOT) + Home.countX);
        }
        if (this.nomeJogador2 == null) {
            message[2].setText("placar (O): ".toUpperCase(Locale.ROOT) + Home.countO);
        } else {
            message[2].setText(this.nomeJogador2 + "(o): ".toUpperCase(Locale.ROOT) + Home.countO);
        }

        body.add(message[1], BorderLayout.CENTER);
        body.add(message[2], BorderLayout.CENTER);
        body.add(botoesVitoria[0]);
        body.add(botoesVitoria[1]);
        body.add(botoesDecrescimo[0]);
        body.add(botoesDecrescimo[1]);

        JPanel footer = new JPanel();
        footer.setLayout(new GridLayout(1, 1));
        footer.setBounds(0, 0, 720, 100);
        footer.add(message[0], BorderLayout.CENTER);
        footer.add(botaoJogar);
        footer.add(botaoZerarPlacar);

        add(body, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);
        add(botaoJogar, BorderLayout.CENTER);
        add(botaoZerarPlacar, BorderLayout.CENTER);

        this.nomeJogador1 = JOptionPane.showInputDialog("Digite o nome do(a) jogador(a) X");
        this.nomeJogador2 = JOptionPane.showInputDialog("Digite o nome do(a) jogador(a) O");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoJogar) {
            JogoDaVelha jogoDaVelha = new JogoDaVelha();
        }
        if (e.getSource() == botoesVitoria[0]) {
            countX += 1;
            if (this.nomeJogador1 == null) {
                message[1].setText("placar (x)".toUpperCase(Locale.ROOT) + Home.countX);
            } else {
                message[1].setText(this.nomeJogador1 + "(x): ".toUpperCase(Locale.ROOT) + Home.countX);
            }

        }
        if (e.getSource() == botoesVitoria[1]) {
            countO += 1;
            if (this.nomeJogador2 == null) {
                message[2].setText("placar (O): ".toUpperCase(Locale.ROOT) + Home.countO);
            } else {
                message[2].setText(this.nomeJogador2 + "(o): ".toUpperCase(Locale.ROOT) + Home.countO);
            }

        }
        if (e.getSource().equals(botaoZerarPlacar)) {
            Home.countO = 0;
            Home.countX = 0;
            if (this.nomeJogador2 == null) {
                message[2].setText("placar (O): ".toUpperCase(Locale.ROOT) + Home.countO);
            } else {
                message[2].setText(this.nomeJogador2 + "(o): ".toUpperCase(Locale.ROOT) + Home.countO);
            }
            if (this.nomeJogador1 == null) {
                message[1].setText("placar (x)".toUpperCase(Locale.ROOT) + Home.countX);
            } else {
                message[1].setText(this.nomeJogador1 + "(x): ".toUpperCase(Locale.ROOT) + Home.countX);
            }
        }
        if (e.getSource() == botoesDecrescimo[0]) {
            if (countX > 0) {
                countX -= 1;
            }
            if (this.nomeJogador1 == null) {
                message[1].setText("placar (x)".toUpperCase(Locale.ROOT) + Home.countX);
            } else {
                message[1].setText(this.nomeJogador1 + "(x): ".toUpperCase(Locale.ROOT) + Home.countX);
            }
        }
        if (e.getSource() == botoesDecrescimo[1]) {
            if (countO > 0) {
                countO -= 1;
            }
            if (this.nomeJogador2 == null) {
                message[2].setText("placar (O): ".toUpperCase(Locale.ROOT) + Home.countO);
            } else {
                message[2].setText(this.nomeJogador2 + "(o): ".toUpperCase(Locale.ROOT) + Home.countO);
            }
        }
    }
}
