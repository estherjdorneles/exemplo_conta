package Projeto_Final;

import javax.annotation.processing.SupportedSourceVersion;

public class ProjetoYouTube {
    public static void main (String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de POO");
        v[2] = new Video("Aula 10 de HTML5");



        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Jubileu", 22, 'm', "Otariano");
        g[1] = new Gafanhoto("Creuza", 30, 'f', "olartu");


        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        vis[1].avaliar(87.0f);


        System.out.println(vis[0].toString());
        System.out.println(v[1].toString());
        System.out.println(g[1].toString());
    }
}
