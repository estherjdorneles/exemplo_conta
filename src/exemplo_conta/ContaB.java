package exemplo_conta;

import java.sql.SQLOutput;

public class ContaB {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaB(){
        this.status = false;
        this.saldo = 0.0f;

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void abrirConta( String tipo ){
        setTipo(tipo);
        setStatus(true);
        if("CC".equals(tipo)) {
            this.setSaldo(50);
        }
        else if("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("\nConta aberta com sucesso");
    }
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("\nConta com dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("\nConta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }
    public void depoistar(double novoSaldo) {
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + novoSaldo);
            System.out.println("Depóstito realizado na conta de " +  getDono());
        } else {
            System.out.println("\nImpossivel depositar em uma conta fechada");
        }
    }

    public void sacar(double saque){
        if(this.isStatus()){
            if (this.saldo >= saque){
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if("CC".equals(tipo)) {
            v = 12;
        }else if ("CP".equals(tipo)){
            v =20;
        }
        if(isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        } else{
            System.out.println("Impossível, pois conta fechada");
        }
    }

    public void exibeDados(){
        System.out.println("\n------- Dados da Conta ------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Está aberta? " + this.isStatus());
    }

}



