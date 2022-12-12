package Projeto_Final;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssis(this.espectador.getTotalAssis() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "\nespectador=" + espectador +
                ", \nfilme=" + filme +
                '}';
    }

    public void avaliar() {
        this.filme.setAvaliacoes(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacoes(nota);

    }

    public void avaliar(float porcent) {
        int tot = 0;
        if(porcent<= 20) {
            tot = 3;
        } else if (porcent <= 50) {
            tot = 5;
        } else if (porcent <= 90) {
            tot = 8;

        } else {
            tot = 10;
        }
        this.filme.setAvaliacoes(tot);
    }
}
