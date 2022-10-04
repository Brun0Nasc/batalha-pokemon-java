package tiposPokemon;

import service.AtaqueFogo;
import service.Defesa;
import service.Pokemon;

public class Fogo extends Pokemon {

    public Fogo(String nome) {
        this.setNome(nome);
        this.setVida(10);
        this.setMana(0);
        this.setAtaque(new AtaqueFogo(this));
        this.setDefesa(new Defesa(this));
    }

    @Override
    public void especial() {
        System.out.println(this.getNome() + " está soltando especial!");
    }
    
}
