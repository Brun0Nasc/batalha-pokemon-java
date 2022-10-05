package service;

public class AtaqueNormal implements IAtaque {
    
    private final Pokemon pokemon;

    public AtaqueNormal(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    @Override
    public void atacar() {
        System.out.println(pokemon.getNome() + " esta atacando com poder de " + pokemon.getTipo() + "!");
    }
    
}
