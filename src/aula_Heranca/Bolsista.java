package aula_Heranca;

public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void removerBolsa() {
        System.out.println("Rrenovamndo bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println( this.getNome() + "  é bolsista. Pagamento com desconto");

    }
}
