package service;

public class AparenciaInicial implements IAparenciaPokemon {

    private String nome;
    
    public AparenciaInicial(String nome){
        this.nome = nome;
    }
    
    @Override
    public String descrever() {
        return this.nome + " é um pokemon";
    }
    
}
