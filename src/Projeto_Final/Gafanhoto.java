package Projeto_Final;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAssis;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssis = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssis() {
        return totalAssis;
    }

    public void setTotalAssis(int totalAssis) {
        this.totalAssis = totalAssis;
    }

    public void viuMiasUm() {
        this.totalAssis ++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totalAssis=" + totalAssis +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
