package org.example;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private Professor professor;
    private List<Aluno> listaDeAlunos;
    private List<Avaliacao> avaliacoes;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.listaDeAlunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(Aluno aluno) {
        listaDeAlunos.add(aluno);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }


}

