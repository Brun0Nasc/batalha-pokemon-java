package service;

import java.util.Observable;

public class Atacante extends Observable implements IAtaque {

    private String acao = "";
    private Pokemon pokemon;
    
    public void ConfigAtacante(Pokemon p) {
        pokemon = p;
    }
    
    @Override
    public void atacar() {
        acao = "ataque";
        pokemon.atacar();
        this.notifica();
    }
    
    public void notifica(){
        setChanged();
        notifyObservers(acao);
    }
    
}
