package tiposPokemon;

import service.AtaqueGrama;
import service.Defesa;
import service.Pokemon;

public class Grama extends Pokemon {

    public Grama(String nome) {
        this.setNome(nome);
        this.setVida(10);
        this.setMana(0);
        this.setAtaque(new AtaqueGrama(this));
        this.setDefesa(new Defesa(this));
    }

    @Override
    public void especial() {
        System.out.println(this.getNome() + " está soltando especial!");
    }
    
}
