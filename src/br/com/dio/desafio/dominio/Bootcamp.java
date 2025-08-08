package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate fim = inicio.plusDays(45);
    private Set<Dev> participantes = new LinkedHashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Getters e setters
    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public Set<Dev> getParticipantes() {
        return participantes;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
