package service;

public class AtaqueAgua implements IAtaque {
    
    private final Pokemon pokemon;

    public AtaqueAgua(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void atacar() {
        System.out.println(pokemon.getNome() + " esta atacando com o poder de agua!");
    }
    
}
