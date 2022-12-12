package aula_Heranca;

public class Professor extends Pessoa {
    private String espec;
    private float salario;


    //public Professor(String nome, int idade, char sexo,
                   //  String espec, float salario) {
        //super(nome, idade, sexo);
        //this.espec = espec;
        //this.salario = salario;
   // }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void recebeAumento(float aumento) {
        this.setSalario(getSalario() + aumento);

    }
}
