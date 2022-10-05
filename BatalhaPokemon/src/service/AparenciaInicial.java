/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author brisa
 */
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
