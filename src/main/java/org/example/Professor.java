package org.example;

import java.util.HashSet;
import java.util.Set;

public class Professor implements Pessoa {
    private String nome;
    private String cpf;
    private String matricula;
    private String telefone;
    private String email;
    private String endereco;
    private Set<String> presencasRegistradas;

    public Professor(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.presencasRegistradas = new HashSet<>();
    }

    public void ministrarDisciplina(Disciplina disciplina) {
        disciplina.setProfessor(this);
        System.out.println( this.getNome() + " agora está ministrando disciplina: " + disciplina.getNome() + ".");
    }

    public void lancarNotas(Avaliacao avaliacao, Aluno aluno, Double nota) {
        aluno.setBoletim(avaliacao, nota);
        System.out.println(
                "Nota " + nota +
                " lançada na avaliação " + avaliacao.getNome() +
                " do dia " + avaliacao.getData() +
                " para o aluno " + aluno.getNome() + "."
        );
    }

    public void lancarFrequencias(Disciplina disciplina, String data, Aluno aluno) {
        String chavePresenca = aluno.getMatricula() + "-" + disciplina.getNome() + "-" + data.toString();
        if (presencasRegistradas.contains(chavePresenca)) {
            System.out.println("Presença já lançada para esta data(" + data + ").");
        } else {
            aluno.adicionarPresenca(disciplina);
            presencasRegistradas.add(chavePresenca);
            System.out.println("Presença lançada com sucesso. Aluno:" + aluno.getNome() + " | Data: " + data + ".");
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

