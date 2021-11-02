/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

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

public class Jogo {
    
    public static int pontos;
    private String operacao;
    private BigDecimal operador1;
    private BigDecimal operador2;
    private BigDecimal resultado;
    public static String resultado2;
    private final Random random;
    
    public Jogo() {
        random = new Random();
        initOps();
        initOpt();
    
    }
    
    
    public void initOps() {
        int aux1 = random.nextInt() %100;
        int aux2 = random.nextInt() %100;
        if (aux1 < 0) {
            aux1 = aux1 * (-1);
        }
        if (aux2 < 0) {
            aux2 = aux2 * (-1);
        }
        this.operador1 = new BigDecimal(aux1);
        this.operador2 = new BigDecimal(aux2);
    }
    
    public void initOpt() {
        int op = random.nextInt(4)+1;
        if (op == 1) {
            this.operacao = "+";
        } else if (op == 2) {
            this.operacao = "-";
        } else if (op == 3) {
            this.operacao = "*";
        } else if (op == 4) {
            this.operacao = "/";
        } else {
            initOpt();
        }
        
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public BigDecimal getOperador1() {
        return operador1;
    }

    public void setOperador1(BigDecimal operador1) {
        this.operador1 = operador1;
    }

    public BigDecimal getOperador2() {
        return operador2;
    }

    public void setOperador2(BigDecimal operador2) {
        this.operador2 = operador2;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }
    
    
}
