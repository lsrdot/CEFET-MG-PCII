package br.cefetmg;

/**
 * @author Lucas Siqueira Ribeiro
 * @author Pablo Vasconcelos da Cruz
 * @author Pedro Costa Calazans
 * @version 1.0
 */

public class Solicitacao {

    private Emergencia emergencia;
    private UnidadeServico unidadeResponsavel;
    private String nomeAtendente;
    private String dataSolicitacao;


    public Solicitacao() {
        emergencia = new Emergencia();
        unidadeResponsavel = new UnidadeServico();
        nomeAtendente = "";
        dataSolicitacao = "";
    }

    public Solicitacao(Emergencia emergencia, UnidadeServico unidadeResponsavel, String nomeAtendente, String dataSolicitacao) {
        this.emergencia = emergencia;
        this.unidadeResponsavel = unidadeResponsavel;
        this.nomeAtendente = nomeAtendente;
        this.dataSolicitacao = dataSolicitacao;
    }

    public Emergencia getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Emergencia emergencia) {
        this.emergencia = emergencia;
    }

    public UnidadeServico getUnidadeResponsavel() {
        return unidadeResponsavel;
    }

    public void setUnidadeResponsavel(UnidadeServico unidadeResponsavel) {
        this.unidadeResponsavel = unidadeResponsavel;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
