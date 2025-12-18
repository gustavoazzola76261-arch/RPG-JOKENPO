package br.com.fecaf.service;

import br.com.fecaf.model.Jogador;

public class BatalhaService {

    public void batalha (Jogador j1, Jogador j2)
    {
        int danoJ1 = calculoDano(j1, j2);
        int danoJ2 = calculoDano(j2, j1);

        j2.setVida(j2.getVida() - danoJ1);
        j1.setVida(j1.getVida() - danoJ2);

        System.out.println(j1.getNome() + " causou " + danoJ1 + " de dano");
        System.out.println(j2.getNome() + " causou " + danoJ2 + " de dano");
        System.out.println("Vida do "+ j1.getNome() + " = " + j1.getVida());
        System.out.println("Vida do "+ j2.getNome() + " = " + j2.getVida());

    }
    private int calculoDano (Jogador atacante, Jogador defender)
    {
        int danoBase =  atacante.getAtaque() - defender.getDefesa();
        double multiplicador = obterMultiplicador(atacante, defender);
        return (int) (danoBase *multiplicador);
    }
    private double obterMultiplicador (Jogador atacante, Jogador defender)
    {
        atacante.getClasse();
        defender.getClasse();
        if (atacante.getClasse() == "Guerreiro" && defender.getClasse() == "Arqueiro")
        {
            return 2.0;
        }
        if (atacante.getClasse() == "Arqueiro"&& defender.getClasse() == "Mago")
        {
            return 2.0;
        }
        if (atacante.getClasse() == "Mago"&& defender.getClasse() == "Guerreiro")
        {
            return 2.0;
        }
        return 1.0;
    }


}
