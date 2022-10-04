package service;

import java.util.Observable;
import java.util.Observer;

public class Atacado implements Observer, IDefesa {
    private Pokemon pokemon;
    
    public void ConfigAtacado(Pokemon p) {
        pokemon = p;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        Atacante atacante = (Atacante)arg0;
        String acao = String.valueOf(arg1);
        
        if(acao.equals("ataque")) {
            defender();
        }
    }

    @Override
    public void defender() {
        pokemon.defender();
    }
    
}
