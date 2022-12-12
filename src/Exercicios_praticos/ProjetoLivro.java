package Exercicios_praticos;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, 'm' );
        p[1] = new Pessoa("Helena", 27, 'f');


        l[0] = new Livro("ACOTAR", "Sarah J. Mass", 680, p[0]);
        l[1] = new Livro("Dom Casmurro", "Machado de Assis", 240, p[1]);
        l[2] = new Livro("5:30", "Esther J. Dorneles", 19, p[1]);

        l[1].abrir();
        l[1].folhear(50);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

    }
}
