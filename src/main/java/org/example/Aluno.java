package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Aluno implements Pessoa {
    private String nome;
    private String cpf;
    private String matricula;
    private String telefone;
    private String email;
    private String endereco;
    private int mesesDeCurso;
    private List<Disciplina> listaDeDisciplinas;
    private HashMap<Avaliacao, Double> boletim;
    private HashMap<Disciplina, Integer> presenca;

    public Aluno(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.listaDeDisciplinas = new ArrayList<>();
        this.boletim = new HashMap<>();
        this.presenca = new HashMap<>();
    }

    public abstract void desenvolverProjetoOuTrabalho();

    public void inscreverEmDisciplina(Disciplina disciplina) {
        this.listaDeDisciplinas.add(disciplina);
        disciplina.setListaDeAlunos(this);
        System.out.println(this.getNome() + " está se inscrevendo na disciplina: " + disciplina.getNome() + ".");
    }

    public void solicitarBoleto() {
        System.out.println("Boleto solicitado por " + this.getNome() + ".");
    }

    public void solicitarHistorico() {
        System.out.println(this.getNome() + " solicitou o histórico:");
        for (Map.Entry<Disciplina, Integer> entry : presenca.entrySet()) {
            Disciplina disciplina = entry.getKey();
            Integer presencas = entry.getValue();

            System.out.println("Disciplina: " + disciplina.getNome() + ", Presenças: " + presencas);

            for (Avaliacao avaliacao : disciplina.getAvaliacoes()) {
                Double nota = boletim.get(avaliacao);
                if (nota != null) {
                    System.out.println("  Avaliação: " + avaliacao.getNome() + ", Nota: " + nota);
                }
            }
        }
        System.out.println("Fim do histórico.");
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

    public int getMesesDeCurso() {
        return mesesDeCurso;
    }

    public List<Disciplina> getListaDeDisciplinas() {
        return listaDeDisciplinas;
    }

    public void setListaDeDisciplinas(List<Disciplina> listaDeDisciplinas) {
        this.listaDeDisciplinas = listaDeDisciplinas;
    }

    public HashMap<Avaliacao, Double> getBoletim() {
        return boletim;
    }

    public void setBoletim(Avaliacao avaliacao, Double nota) {
        this.boletim.put(avaliacao, nota);
    }

    public HashMap<Disciplina, Integer> getPresenca() {
        return presenca;
    }

    public void adicionarPresenca(Disciplina disciplina) {
        presenca.put(disciplina, presenca.getOrDefault(disciplina, 0) + 1);
    }

    public int contarPresencas(Disciplina disciplina) {
        int x = presenca.getOrDefault(disciplina, 0);
        System.out.println("Quantidade de presenças de " + this.getNome() + " na matéria " + disciplina.getNome() + ": " + x +".");
        return x;
    }
}

