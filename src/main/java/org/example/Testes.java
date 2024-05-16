package org.example;

import java.util.Date;

public class Testes {
    public static void main(String[] args) {
        Disciplina programacao2 = new Disciplina("Progamação II", "0001");
        Disciplina segurancaDaInformacao = new Disciplina("Segurança da Informação", "0002");
        Disciplina bancoDeDados1 = new Disciplina("Bando de Dados I", "0003");

        Avaliacao av1Prog2 = new Avaliacao("Av1 do Clayton", "16/05/2024");
        Avaliacao av2Prog2 = new Avaliacao("Av2 do Clayton", "06/07/2024");
        Avaliacao av1SegInf = new Avaliacao("Av1 do Anderson", "16/05/2024");
        Avaliacao av2SegInf = new Avaliacao("Av2 do Anderson", "06/07/2024");
        Avaliacao av1BD1 = new Avaliacao("Av1 do Roberto", "16/05/2024");
        Avaliacao av2BD1 = new Avaliacao("Av2 do Roberto", "06/07/2024");

        programacao2.setAvaliacoes(av1Prog2);
        programacao2.setAvaliacoes(av2Prog2);
        segurancaDaInformacao.setAvaliacoes(av1SegInf);
        segurancaDaInformacao.setAvaliacoes(av2SegInf);
        bancoDeDados1.setAvaliacoes(av1BD1);
        bancoDeDados1.setAvaliacoes(av2BD1);

        Professor claytonChagas = new Professor(
                "Clayton Chagas",
                "123456789-00",
                "0001",
                "(21)99999-9999",
                "clayton.chagas@gmail.com",
                "rua da casa do clayton, nº X"
        );

        Professor andersonSilva = new Professor(
                "Anderson Silva",
                "123456788-00",
                "0002",
                "(21)99999-8888",
                "anderson.s@gmail.com",
                "rua da casa do anderson, nº Y"
        );

        Professor robertoHarkovsky = new Professor(
                "Roberto Harkovsky",
                "321456789-00",
                "0003",
                "(21)97777-9999",
                "roberto.h@gmail.com",
                "rua da casa do clayton, nº X"
        );

        AlunoGraduacao guilhermeMenezes = new AlunoGraduacao(
                "Guilherme Menezes",
                "321654987-00",
                "0001",
                "(21)98765-4321",
                "guilhermemenezes@gmail.com",
                "Rua dos bobos nº 0"
        );

        AlunoPosGraduacao talesCosta = new AlunoPosGraduacao(
                "Tales Costa",
                "220885657-44",
                "0002",
                "(21)98249-4321",
                "talescostam@gmail.com",
                "Rua dos bobos nº 1"
        );

        claytonChagas.ministrarDisciplina(programacao2);
        andersonSilva.ministrarDisciplina(segurancaDaInformacao);
        robertoHarkovsky.ministrarDisciplina(bancoDeDados1);

        guilhermeMenezes.desenvolverProjetoOuTrabalho();
        guilhermeMenezes.inscreverEmDisciplina(segurancaDaInformacao);
        guilhermeMenezes.inscreverEmDisciplina(bancoDeDados1);
        talesCosta.inscreverEmDisciplina(programacao2);

        claytonChagas.lancarFrequencias(programacao2, "16/05/2024", guilhermeMenezes);
        claytonChagas.lancarFrequencias(programacao2, "16/05/2024", talesCosta);
        claytonChagas.lancarFrequencias(programacao2, "09/05/2024", guilhermeMenezes);
        claytonChagas.lancarFrequencias(programacao2, "09/05/2024", talesCosta);
        claytonChagas.lancarFrequencias(programacao2, "09/05/2024", guilhermeMenezes);
        claytonChagas.lancarFrequencias(programacao2, "02/05/2024", talesCosta);

        robertoHarkovsky.lancarFrequencias(bancoDeDados1, "15/05/2024", guilhermeMenezes);
        robertoHarkovsky.lancarFrequencias(bancoDeDados1, "08/05/2024", guilhermeMenezes);

        guilhermeMenezes.solicitarBoleto();
        guilhermeMenezes.contarPresencas(programacao2);
        guilhermeMenezes.contarPresencas(bancoDeDados1);

        talesCosta.desenvolverProjetoOuTrabalho();
        talesCosta.setUltimoModuloFinalizado(6);
        talesCosta.desenvolverProjetoOuTrabalho();
        talesCosta.getUltimoModuloFinalizado();
        talesCosta.contarPresencas(programacao2);

        claytonChagas.lancarNotas(av1Prog2, guilhermeMenezes, 9.5);
        claytonChagas.lancarNotas(av1Prog2, talesCosta, 10.0);
        claytonChagas.lancarNotas(av2Prog2, guilhermeMenezes, 10.0);
        claytonChagas.lancarNotas(av2Prog2, talesCosta, 10.0);
        robertoHarkovsky.lancarNotas(av1BD1, guilhermeMenezes, 8.0);
        robertoHarkovsky.lancarNotas(av2BD1, guilhermeMenezes, 9.0);

        guilhermeMenezes.solicitarHistorico();
        talesCosta.solicitarHistorico();



    }
}
