package br.com.fecaf.model;

public class Jogador {
    private String nome, classe;
    private int ataque, defesa, esquiva, magia, vida ;

    public Jogador(String nome, int ataque, int defesa, int esquiva, int magia, int vida, String classe) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.esquiva = esquiva;
        this.magia = magia;
        this.vida = vida;
        this.classe = classe;
    }
    public void exibirInfoJogador() {
        System.out.println("Nome: " + nome);
        System.out.println("ataque: " + ataque);
        System.out.println("defesa: " + defesa);
        System.out.println("esquiva: " + esquiva);
        System.out.println("magia: " + magia);
        System.out.println("vida: " + vida);
        System.out.println("classe: " + classe);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
