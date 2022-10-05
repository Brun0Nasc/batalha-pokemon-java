/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author brisa
 */
public class Especial implements IEspecial {
    
    private final Pokemon pokemon;

    public Especial(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    
    @Override
    public void especial() {
        System.out.printf("%s esta atacando com um ataque especial de %s\n", pokemon.getNome(), pokemon.getTipo());
    }
    
}
