package br.com.fecaf.model;

public class Arqueiro extends Jogador{
    private String flecha;

    public Arqueiro(String nome, String flecha)
    {
        super(
                nome,
                7,
                6,
                4,
                0,
                10,
                "Arqueiro"
        );
        this.flecha = flecha;
    }

    @Override
    public void exibirInfoJogador() {
        super.exibirInfoJogador();
        System.out.println("Flecha: " + this.flecha);
    }

    public String getFlecha() {
        return flecha;
    }

    public void setFlecha(String flecha) {
        this.flecha = flecha;
    }
}
