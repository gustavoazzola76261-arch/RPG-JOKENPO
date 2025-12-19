package br.com.fecaf.controller;

import br.com.fecaf.model.*;
import br.com.fecaf.service.BatalhaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BatalhaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/batalhar")
    public String batalhar(
            @RequestParam String nome1,
            @RequestParam String classe1,
            @RequestParam String extra1,
            @RequestParam String nome2,
            @RequestParam String classe2,
            @RequestParam String extra2,
            Model model) {

        Jogador j1 = criarJogador(classe1, nome1, extra1);
        Jogador j2 = criarJogador(classe2, nome2, extra2);

        BatalhaService batalha = new BatalhaService();
        batalha.batalha(j1, j2);

        model.addAttribute("j1", j1);
        model.addAttribute("j2", j2);

        return "resultado";
    }

    private Jogador criarJogador(
            String classe,
            String nome,
            String extra // flecha, arma, magia, etc.
    ) {
        switch (classe) {
            case "Guerreiro":
                return new Guerreiro(nome, extra); // extra = arma
            case "Arqueiro":
                return new Arqueiro(nome, extra);  // extra = flecha
            case "Mago":
                return new Mago(nome, extra);      // extra = grimório/magia
            default:
                throw new IllegalArgumentException("Classe inválida");
        }
    }

}
