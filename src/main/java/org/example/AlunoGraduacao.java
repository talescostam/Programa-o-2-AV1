package org.example;

public class AlunoGraduacao extends Aluno {
    private final int mesesDeCurso = 5*6;

    public AlunoGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    @Override
    public void desenvolverProjetoOuTrabalho() {
        System.out.println( this.getNome() + " está desenvolvendo Projeto Integrador.");
    }

}
