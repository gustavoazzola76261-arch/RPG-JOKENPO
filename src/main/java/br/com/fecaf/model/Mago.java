package br.com.fecaf.model;

public class Mago extends Jogador
{
    private String feitico;
    public Mago(String nome, String feitico)

    {
        super(
                nome,
                7,
                6,
                4,
                0,
                10,
                "Mago"
        );
        this.feitico = feitico;
    }

    @Override
    public void exibirInfoJogador() {
        super.exibirInfoJogador();
        System.out.println("Magia: " + this.feitico);
    }

    public String getFeitico() {
        return feitico;
    }

    public void setFeitico(String feitico) {
        this.feitico = feitico;
    }
}
