package service;

public class AtaqueFogo implements IAtaque {
    
    private final Pokemon pokemon;

    public AtaqueFogo(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    @Override
    public void atacar() {
        System.out.println(pokemon.getNome() + " esta atacando com poder de fogo!");
    }
    
}
