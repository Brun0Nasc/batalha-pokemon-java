package service;

public class Defesa implements IDefesa {

    private final Pokemon pokemon;

    public Defesa(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    @Override
    public void defender() {
        System.out.println(pokemon.getNome() + " esta se defendendo");
    }
    
}
