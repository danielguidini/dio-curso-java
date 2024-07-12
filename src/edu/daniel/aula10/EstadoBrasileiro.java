package edu.daniel.aula10;

public enum EstadoBrasileiro {
    SAO_PAULO("SP","São Paulo"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    MINAS_GERAIS("MG","Minas Gerais"),
    ESPIRITO_SANTO("ES","Espirito Santo");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
