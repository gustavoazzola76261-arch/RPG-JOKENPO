package br.com.fecaf.model;

public class Guerreiro extends Jogador {
    private String arma;

    public Guerreiro(String nome, String arma ) {
        super(
                nome,
                7,
                6,
                4,
                0,
                10,
                "Guerreiro"
        );
        this.arma = arma;
    }

    public void exibirInfoJogador()
    {
        super.exibirInfoJogador();
        System.out.println("Arma: " + arma);
    }

    public String getArma()
    {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
