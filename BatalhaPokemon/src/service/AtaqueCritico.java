package service;

public class AtaqueCritico implements IAtaque {
    private final Pokemon pokemon;

    public AtaqueCritico(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    @Override
    public void atacar() {
        System.out.println(pokemon.getNome() + " deu um ataque critico!");
    }
    
}
