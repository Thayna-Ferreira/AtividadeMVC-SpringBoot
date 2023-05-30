package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Musica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/musicas")
public class MusicasAPI {

    public List<Musica> musicas = new ArrayList<Musica>();

    public MusicasAPI() {
        musicas.add(new Musica("4521", "CD", 80, 55));
        musicas.add(new Musica("0012", "Vinil", 450, 300));
        musicas.add(new Musica("5698", "DVD", 100, 80));
        musicas.add(new Musica("1102", "Cassete", 150, 130));
    }

    @GetMapping
    public List<Musica> getMusicas() {
        return musicas;
    }

}
