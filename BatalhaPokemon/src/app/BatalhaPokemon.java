package app;

import java.util.Scanner;
import service.Atacado;
import service.Atacante;
import service.EscolheTipoPokemon;
import service.Pokemon;

public class BatalhaPokemon {
    
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Informe o tipo de Pokemon (1)Agua (2)Fogo (3)Grama: ");
            int opcaoPokemon = entrada.nextInt();
            System.out.println("Informe o tipo nome do Pokemon: ");
            String nomePokemon = entrada.next();
            EscolheTipoPokemon tipoPokemon = EscolheTipoPokemon.values()[opcaoPokemon - 1];
            Pokemon pokemon1 = tipoPokemon.obterPokemon(nomePokemon);
            Atacante atacante = new Atacante();
            Atacado atacado = new Atacado();
        
            int turno = 0;
        
        
            tipoPokemon = EscolheTipoPokemon.values()[1];
            Pokemon pokemon2 = tipoPokemon.obterPokemon("Charmander");
        
            if(turno == 0) {
                // Observado
                atacante.ConfigAtacante(pokemon1);
            
                // Observador
                atacado.ConfigAtacado(pokemon2);
            
                atacante.addObserver(atacado);
            
                atacante.atacar();
            }
        }
        
    }

}
