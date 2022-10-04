package tiposPokemon;

import java.util.Random;
import service.AtaqueAgua;
import service.AtaqueCritico;
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

    @Override
    public int testaCritico() {
        Random gerador = new Random();
        int critico = gerador.nextInt(11);
        
        if(critico == 5) {
            this.setAtaque(new AtaqueCritico(this));
        } else {
            this.setAtaque(new AtaqueAgua(this));
        }
        
        return critico;
    }
    
}
