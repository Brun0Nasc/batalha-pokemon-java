package service;

public abstract class AparenciaPokemon implements IAparenciaPokemon {

    private final IAparenciaPokemon pokemon;
    
    public AparenciaPokemon(IAparenciaPokemon p) {
        this.pokemon = p;
    }
    
    @Override
    public String descrever() {
        return pokemon.descrever();
    }
    
    public IAparenciaPokemon getIAparenciaPokemon(){
        return pokemon;
    }
    
}
