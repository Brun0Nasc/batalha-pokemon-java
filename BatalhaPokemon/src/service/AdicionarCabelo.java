/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author brisa
 */
public class AdicionarCabelo extends AparenciaPokemon {
    
    public AdicionarCabelo(IAparenciaPokemon pokemon){
        super(pokemon);
    }

    @Override
    public String descrever() {
        return super.descrever() + " com cabelos muito bonitos"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
