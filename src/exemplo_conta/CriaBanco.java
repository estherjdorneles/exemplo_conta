package exemplo_conta;

public class CriaBanco {
    public static void main(String[] args) {
        ContaB p1 = new ContaB();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depoistar(100);
        p1.sacar(150);
        p1.fecharConta();


        ContaB p2 = new ContaB();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depoistar(500);
        p2.sacar(100);

        p1.exibeDados();
        p2.exibeDados();



    }
}
