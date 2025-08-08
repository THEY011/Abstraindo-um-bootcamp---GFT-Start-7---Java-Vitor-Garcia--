package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int duracaoHoras;

    @Override
    public double calcularXp() {
        return XP_BASE * duracaoHoras;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                '}';
    }
}
