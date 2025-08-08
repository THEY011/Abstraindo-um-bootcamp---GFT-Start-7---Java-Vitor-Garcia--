
import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso javaFund = new Curso();
        javaFund.setTitulo("Java Básico");
        javaFund.setDescricao("Introdução à programação Java.");
        javaFund.setDuracaoHoras(10);

        Curso springBoot = new Curso();
        springBoot.setTitulo("Spring Boot");
        springBoot.setDescricao("Desenvolvimento web com Spring Boot.");
        springBoot.setDuracaoHoras(15);

        Curso bancoDados = new Curso();
        bancoDados.setTitulo("Banco de Dados");
        bancoDados.setDescricao("Modelagem e consultas SQL.");
        bancoDados.setDuracaoHoras(8);

        Mentoria awsMentoria = new Mentoria();
        awsMentoria.setTitulo("Mentoria AWS");
        awsMentoria.setDescricao("Orientações sobre serviços AWS.");
        awsMentoria.setDataMentoria(LocalDate.now().plusDays(5));

        Bootcamp gftStart7 = new Bootcamp();
        gftStart7.setNomeBootcamp("GFT Start 7 - Java");
        gftStart7.setDescricaoBootcamp("Bootcamp completo sobre Java, Spring Boot, BD e AWS.");
        gftStart7.getConteudos().add(javaFund);
        gftStart7.getConteudos().add(springBoot);
        gftStart7.getConteudos().add(bancoDados);
        gftStart7.getConteudos().add(awsMentoria);

        Dev vitor = new Dev("Vitor Eduardo Garcia");
        vitor.inscreverBootcamp(gftStart7);

        System.out.println("Conteúdos inscritos de " + vitor.getNome() + ": " + vitor.getInscritos());
        vitor.avançar();
        vitor.avançar();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de " + vitor.getNome() + ": " + vitor.getInscritos());
        System.out.println("Conteúdos concluídos de " + vitor.getNome() + ": " + vitor.getConcluidos());
        System.out.println("XP total: " + vitor.calcularXpTotal());
    }
}
