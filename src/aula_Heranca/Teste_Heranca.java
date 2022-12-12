package aula_Heranca;

public class Teste_Heranca {
    public static void main (String[] args) {
       Pessoa p1 = new Visitante();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       Aluno a1 = new Bolsista();
       //Pessoa p5 = new Pessoa();
       Visitante v1 = new Visitante();
       Bolsista b1 = new Bolsista();

       b1.setNome("Evandro");
       b1.setIdade(18);
       b1.setMatr(1111);
       b1.setBolsa(12.5f);
       b1.setSexo('m');
       b1.pagarMensalidade();



       v1.setIdade(22);
       v1.setNome("Marcus");
       v1.setSexo('m');
       System.out.println(v1.toString());

       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Ricardo");
       p4.setNome("Ana Claudia");

       p1.setSexo('m');
       p4.setSexo('f');
       p2.setIdade(18);

       p2.setCurso("Informática");
       p3.setSalario(2500.75f);
       p4.setSetor("Estoque");

       //System.out.println(p1.toString());
       //System.out.println(p2.toString());
       //System.out.println(v1.toString());
       //System.out.println(b1.toString());




        //  Pessoa[] p = new Pessoa[4];

      //  p[0]= new Pessoa();
      //  p[1]= new Aluno();
       // p[2]= new Professor();
       // p[3]= new Funcionario();

       // p[0].setNome("Pedro");
       // p[1].setNome("Maria");
       // p[2].setNome("Marcos");
       // p[3].setNome("Ana Cláudia");

       // p[1].setCurso("Informática");

    }
}
