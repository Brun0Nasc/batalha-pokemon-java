package tiposPokemon;

import java.util.Random;
import service.AtaqueCritico;
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

    @Override
    public int testaCritico() {
        Random gerador = new Random();
        int critico = gerador.nextInt(11);
        
        if(critico == 5) {
            this.setAtaque(new AtaqueCritico(this));
        } else {
            this.setAtaque(new AtaqueGrama(this));
        }
        
        return critico;
    }
    
}
