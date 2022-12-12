package Ultra_Emoji_Kombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2))) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado =  null;
        }

    }
    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            Random alteatorio = new Random();
            int vencedor = alteatorio.nextInt(3);
            switch (vencedor) {
                case 0 : //Empate
                    System.out.println("### EMPATOU ###");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;

                case 1 : //Desafiado vence
                    System.out.println("### VITÓRIA DO " + this.desafiado.getNome() + " ###");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;

                case 2 : //Desafiante vence
                    System.out.println("### VITÓRIA DO " + this.desafiante.getNome() + " ###");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer");
        }

    }

}
