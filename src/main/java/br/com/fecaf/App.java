package br.com.fecaf;

import br.com.fecaf.model.Arqueiro;
import br.com.fecaf.model.Guerreiro;
import br.com.fecaf.model.Jogador;
import br.com.fecaf.model.Mago;
import br.com.fecaf.service.BatalhaService;

public class App {
    public static void main(String[] args) {
        Jogador guerreiro = new Guerreiro("Arthur", "Machado");
        guerreiro.exibirInfoJogador();
        System.out.println("/***********************/");
        Jogador mago = new Mago("Merlim", "Raios");
        mago.exibirInfoJogador();
        System.out.println("/***********************/");
        Arqueiro arqueiro = new Arqueiro("Legolas", "Elfica");
        arqueiro.exibirInfoJogador();
        BatalhaService batalha = new BatalhaService();
        batalha.batalha(guerreiro, arqueiro);



    }
}
