package aula_Heranca;

public class Funcionario extends Pessoa{
    public String setor;
    public boolean trabalhando;

    //public Funcionario(String nome, int idade, char sexo,
                       //String setor, boolean trabalhando) {
        //super(nome, idade, sexo);
        //this.setor = setor;
        //this.trabalhando = trabalhando;
   // }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;


    }
}
