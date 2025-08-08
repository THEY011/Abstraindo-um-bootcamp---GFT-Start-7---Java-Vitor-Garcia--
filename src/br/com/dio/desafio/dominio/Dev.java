package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> inscritos = new LinkedHashSet<>();
    private Set<Conteudo> concluidos = new LinkedHashSet<>();

    public Dev() {}

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.inscritos.addAll(bootcamp.getConteudos());
        bootcamp.getParticipantes().add(this);
    }

    public void avançar() {
        Optional<Conteudo> conteudoAtual = this.inscritos.stream().findFirst();
        if (conteudoAtual.isPresent()) {
            this.concluidos.add(conteudoAtual.get());
            this.inscritos.remove(conteudoAtual.get());
        } else {
            System.out.println("Nenhum conteúdo disponível para avançar!");
        }
    }

    public double calcularXpTotal() {
        return this.concluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getInscritos() {
        return inscritos;
    }
    public Set<Conteudo> getConcluidos() {
        return concluidos;
    }
}
