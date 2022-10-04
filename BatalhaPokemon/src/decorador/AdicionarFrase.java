package decorador;

import java.util.Random;
import service.AtaqueAgua;
import service.AtaqueCritico;
import service.Pokemon;

public class AdicionarFrase extends Atributo {
    
    public AdicionarFrase(Pokemon pokemon, String frase) {
        super(pokemon, frase);
        this.frase = frase;
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
