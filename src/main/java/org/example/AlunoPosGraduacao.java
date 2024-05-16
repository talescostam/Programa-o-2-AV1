package org.example;

public class AlunoPosGraduacao extends Aluno {
    private final int mesesDeCurso = 6*2;
    private int ultimoModuloFinalizado = 0;

    public AlunoPosGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    @Override
    public void desenvolverProjetoOuTrabalho() {
        if (ultimoModuloFinalizado != 6) {
            System.out.println( this.getNome() + " ainda não pode fazer o TCC por não ter finalizado o 6º módulo. Módulo atual: " + ultimoModuloFinalizado + 1 + ".");
        } else {
            System.out.println( this.getNome() + " está desenvolvendo o TCC.");
        }
    }

    @Override
    public int getMesesDeCurso() {
        return mesesDeCurso;
    }

    public void getUltimoModuloFinalizado() {
        System.out.println("Último módulo realizado por " + this.getNome() + ": " + ultimoModuloFinalizado);
    }

    public void setUltimoModuloFinalizado(int ultimoModuloFinalizado) {
        this.ultimoModuloFinalizado = ultimoModuloFinalizado;
    }
}

