package br.cefetmg.question.first;

import java.util.*;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class CaixaDeBrinquedo {

    private final List<Forma> formas;

    public CaixaDeBrinquedo() {
        formas = new ArrayList<>();
    }

    public void adicionarBrinquedo(Forma forma) {
        this.formas.add(forma);
    }

    public void esvaziarCaixa() {
        this.formas.clear();
    }

    public void apresentarBrinquedos() {
        formas.forEach(f -> {
            if (f instanceof Bidimensional) {
                if (f instanceof Triangulo)
                    System.out.printf("\n\tTriangulo de cor: %s. Valor da area: %.2f\n", ((Triangulo) f).getCor(), f.obterArea());
                else if (f instanceof Quadrado)
                    System.out.printf("\tQuadradoDois de cor: %s. Valor da area: %.2f\n", ((Quadrado) f).getCor(), f.obterArea());
                else
                    System.out.printf("\tCirculoDois de cor: %s. Valor da area: %.2f\n", ((Circulo) f).getCor(), f.obterArea());
            } else {
                if (f instanceof Tetraedro)
                    System.out.printf("\tTetraedo de cor: %s. Valor da area: %.2f. Valor do volume: %.2f\n", ((Tetraedro) f).getCor(), f.obterArea(), ((Tetraedro) f).obterVolume());
                else if (f instanceof Cubo)
                    System.out.printf("\tCuboDois de cor: %s. Valor da area: %.2f. Valor do volume: %.2f\n", ((Cubo) f).getCor(), f.obterArea(), ((Cubo) f).obterVolume());
                else
                    System.out.printf("\tEsferaDois de cor: %s. Valor da area: %.2f. Valor do volume: %.2f\n", ((Esfera) f).getCor(), f.obterArea(), ((Esfera) f).obterVolume());
            }
        });
    }
}