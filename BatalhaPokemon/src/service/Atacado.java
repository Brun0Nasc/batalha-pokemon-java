package service;

import java.util.Observable;
import java.util.Observer;

// Classe do objeto observador
public class Atacado implements Observer, IDefesa {
    private Pokemon pokemon;
    
    public void ConfigAtacado(Pokemon p) {
        pokemon = p;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
       // Atacante atacante = (Atacante)arg0;
        String acao = String.valueOf(arg1);
        
        if(acao.equals("ataque")) {
            defender();
            perderVida(1);
        }else if(acao.equals("especial")) {
            defender();
            perderVida(2);
        } else if(acao.equals("critico")) {
            defender();
            perderVida(3);
        }
    }

    @Override
    public void defender() {
        System.out.println("");
        pokemon.defender();
    }
    
    public void perderVida(int valor) {
        pokemon.setVida(pokemon.getVida() - valor);
        pokemon.setMana(pokemon.getMana() + 2);
        System.out.println(pokemon.getNome() + " perdeu " + valor + " de vida.");
        System.out.println(pokemon.getNome() + " ganhou 2 de mana.");
        System.out.println("");
    }
    
}
