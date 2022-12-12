package Animal;

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void reagir(String frase) {
        if(frase.equals("mozinho di mamãe") || frase.equals("ó comida")) {
            System.out.println("Abanando rabo");
        } else{
            System.out.println("Rosnando");
        }

    }

    public void reagir( int hora, int min) {
        if( hora < 12) {
            System.out.println("Abanando rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
            this.emitirSom();
        }

    }

    public void reagir(boolean dono) {
        if(dono) {
            System.out.println("Abanando rabo");
            this.emitirSom();
        } else {
            System.out.println("Rosnando");
        }

    }

    public void reagir(int idade, float peso) {
        if (idade < 5 ) {
            if (peso < 10) {
                System.out.println("Abanando rabo");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnaro");
            } else {
                System.out.println("Ignorar");
            }
        }

    }
}
