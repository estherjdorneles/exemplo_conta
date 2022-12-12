public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    int[] vet;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }



    public void status(){
        //System.out.println("Modelo: " + this.modelo);
        //System.out.println("Uma caneta " + this.cor);
        //System.out.println("Ponta: " + this.ponta);
        //System.out.println("Carga: " + this.carga);
        //System.out.println("Está tampada? " + this.tampada);
        System.out.println(vet);
    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRADO! Não posso rabiscar, pois estou tampada");
        } else{
            System.out.println("Estou rabiscando um desenho para você");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
