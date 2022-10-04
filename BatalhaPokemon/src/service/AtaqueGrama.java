package service;

public class AtaqueGrama implements IAtaque {
    private final Pokemon pokemon;

    public AtaqueGrama(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    @Override
    public void atacar() {
        System.out.println(pokemon.getNome() + " esta atacando com o poder de grama!");
    }
    
}
