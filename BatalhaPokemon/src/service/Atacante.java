package service;

import java.util.Observable;
import java.util.Random;

public class Atacante extends Observable implements IAtaque {

    private String acao = "";
    private int critico;
    private Pokemon pokemon;
    
    public void ConfigAtacante(Pokemon p) {
        pokemon = p;
    }
    
    @Override
    public void atacar() {
        acao = "ataque";
        
        Random gerador = new Random();
        critico = gerador.nextInt(11);
        
        if(critico == 5) {
            pokemon.setAtaque(new AtaqueCritico(pokemon));
            acao = "critico";
        }
        
        pokemon.atacar();
        this.notifica();
    }
    
    public void notifica(){
        setChanged();
        notifyObservers(acao);
    }
    
}
