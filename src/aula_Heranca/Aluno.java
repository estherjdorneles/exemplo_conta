package aula_Heranca;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    //public Aluno(String nome, int idade, char sexo) {
        //super(nome, idade, sexo);
    //}

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void cancelarMatr() {
        System.out.println("Matricula será cancelada");

    }
    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade do/a aluno/a " + this.getNome());

    }
}
