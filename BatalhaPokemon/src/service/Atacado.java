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
        
        switch (acao) {
            case "ataque" -> {
                defender();
                perderVida(1);
            }
            case "especial" -> {
                defender();
                perderVida(2);
            }
            case "critico" -> {
                defender();
                perderVida(3);
            }
            default -> {
            }
        }
    }

    @Override
    public void defender() {
        System.out.println("");
        pokemon.defender();
    }
    
    public void perderVida(int valor) {
        pokemon.levaDano(valor);
        pokemon.setMana(pokemon.getMana() + 2);
        System.out.println(pokemon.getNome() + " perdeu " + valor + " de vida.");
        System.out.println(pokemon.getNome() + " ganhou 2 de mana.");
        System.out.println("");
    }
    
}
