package tiposPokemon;

import service.AtaqueNormal;
import service.Defesa;
import service.Especial;
import service.Pokemon;

public class Agua extends Pokemon {

    public Agua(String nome) {
        this.setNome(nome);
        this.setVida(10);
        this.setMana(0);
        this.setAtaque(new AtaqueNormal(this));
        this.setDefesa(new Defesa(this));
        this.setEspecial(new Especial(this));
        this.setTipo("agua");
    }
    
}
