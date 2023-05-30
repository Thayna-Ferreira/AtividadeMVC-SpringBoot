package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Musica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/musicas")
public class MusicaController {

    public List<Musica> musicas = new ArrayList<Musica>();

    public MusicaController() {
        musicas.add(new Musica("4521", "CD", 80, 55));
        musicas.add(new Musica("0012", "Vinil", 450, 300));
        musicas.add(new Musica("5698", "DVD", 100, 80));
        musicas.add(new Musica("1102", "Cassete", 150, 130));
    }

    @GetMapping
    public String getMusicas(Model model) {
        model.addAttribute("musicas", musicas);
        return "musicas";
    }
}