package service;

import java.util.Observable;

// Classe do objeto observavel
public class Atacante extends Observable implements IAtaque {

    private String acao = "";
    private Pokemon pokemon;
    
    public void ConfigAtacante(Pokemon p) {
        pokemon = p;
    }
    
    @Override
    public void atacar() {
        acao = "ataque";
        
        // Vendo se o ataque foi critico
        int critico = pokemon.testaCritico();
        
        if(critico == 5) {
            acao = "critico";
        }
        
        // Vendo se ja tem mana o suficiente para um ataque especial
        if(pokemon.getMana() >= 5) {
            acao = "especial";
            pokemon.especial();
            pokemon.setMana(0);
        } else {
            pokemon.atacar();
        }
        
        this.notifica();
    }
    
    public void notifica(){
        setChanged();
        notifyObservers(acao);
    }
    
}
