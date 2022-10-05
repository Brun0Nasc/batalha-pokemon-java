package tiposPokemon;

import service.AtaqueNormal;
import service.Defesa;
import service.Especial;
import service.Pokemon;

public class Grama extends Pokemon {

    public Grama(String nome) {
        this.setNome(nome);
        this.setVida(10);
        this.setMana(0);
        this.setAtaque(new AtaqueNormal(this));
        this.setDefesa(new Defesa(this));
        this.setEspecial(new Especial(this));
        this.setTipo("grama");
    }
    
}
