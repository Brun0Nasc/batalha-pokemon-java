package tiposPokemon;

import service.AtaqueAgua;
import service.Defesa;
import service.Pokemon;

public class Agua extends Pokemon {

    public Agua(String nome) {
        this.setNome(nome);
        this.setVida(10);
        this.setMana(0);
        this.setAtaque(new AtaqueAgua(this));
        this.setDefesa(new Defesa(this));
    }

    @Override
    public void especial() {
        System.out.println(this.getNome() + " está soltando especial!");
    }
    
}
