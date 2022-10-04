/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

import service.Pokemon;

/**
 *
 * @author Bruno
 */
public abstract class Atributo extends Pokemon  {
    private Pokemon pokemon;
    protected String frase;
    
    public Atributo(Pokemon pokemon, String frase){
        this.pokemon = pokemon;
        this.frase = frase;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("%s diz: %s", this.getNome(), this.frase);
    }
    
    
}
