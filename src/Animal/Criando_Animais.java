package Animal;

import aula_Heranca.Pessoa;

public class Criando_Animais {
    public static void main (String[] args) {
        Animal[] ani = new Animal[11];
        ani[0] = new Cachorro();
        Cachorro r = new Cachorro();
        Peixe p = new Peixe();
        Ave a = new Ave();

        r.reagir(true);




    }
}
