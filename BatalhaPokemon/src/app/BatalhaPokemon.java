package app;

import java.util.Scanner;
import service.AdicionarCabelo;
import service.AparenciaInicial;
import service.Atacado;
import service.Atacante;
import service.EscolheTipoPokemon;
import service.IAparenciaPokemon;
import service.Pokemon;

public class BatalhaPokemon {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            
            System.out.println("-------------Cadastro dos Pokemons-------------");
            
            // Cadastrando informações do primeiro pokemon que vai concorrer
            System.out.print("Informe o tipo do primeiro Pokemon \n(1)Agua \n(2)Fogo \n(3)Grama \nR: ");
            int opcaoPokemon = entrada.nextInt();
            
            System.out.println("");
            
            System.out.print("Informe o nome do Pokemon: ");
            String nomePokemon = entrada.next();
            
            // As informações serão usadas para gerar o objeto do tipo que foi escolhido anteriormente
            EscolheTipoPokemon tipoPokemon = EscolheTipoPokemon.values()[opcaoPokemon - 1]; // A instância da classe vem de uma classe enum
            Pokemon pokemon1 = tipoPokemon.obterPokemon(nomePokemon); // Instanciando primeiro pokemon
            
            // Parte referente ao Decorator
            IAparenciaPokemon a = new AparenciaInicial(pokemon1.getNome());
            System.out.println("");
            System.out.println(a.descrever());
            System.out.print("\nDeseja adicionar cabelo ao pokemon? (1)Sim (2)Nao \nR:");
            int escolha = entrada.nextInt();
            System.out.println("");
            if(escolha == 1){
                a = new AdicionarCabelo(a);
                System.out.println(a.descrever());
            }
            
            System.out.println("");
            
            // Cadastrando informações do segundo pokemon que vai concorrer
            System.out.print("Informe o tipo do segundo Pokemon \n(1)Agua \n(2)Fogo \n(3)Grama \nR: ");
            opcaoPokemon = entrada.nextInt();
            
            System.out.println("");
            
            System.out.print("Informe o nome do Pokemon: ");
            nomePokemon = entrada.next();
            
            // As informações serão usadas para gerar o objeto do tipo que foi escolhido anteriormente
            tipoPokemon = EscolheTipoPokemon.values()[opcaoPokemon - 1]; // A instância da classe vem de uma classe enum
            Pokemon pokemon2 = tipoPokemon.obterPokemon(nomePokemon); // Instanciando segundo pokemon
            
            a = new AparenciaInicial(pokemon2.getNome());
            System.out.println("");
            System.out.println(a.descrever());
            System.out.print("\nDeseja adicionar cabelo ao pokemon? (1)Sim (2)Nao \nR:");
            escolha = entrada.nextInt();
            System.out.println("");
            if(escolha == 1){
                a = new AdicionarCabelo(a);
                System.out.println(a.descrever());
            }
            
            System.out.println("");
            pokemon1.mostrarEstado();
            System.out.println("");
            pokemon2.mostrarEstado();
            System.out.println("");
            
            // * INICIANDO COMBATE
            System.out.println("\n-=-=-=-=-=-=-=-= INICIANDO COMBATE -=-=-=-=-=-=-=-=\n");
            iniciarBatalha(pokemon1, pokemon2);
        }
        
    }
    
    public static void iniciarBatalha(Pokemon p1, Pokemon p2){
        Atacante atacante = new Atacante(); // Objeto observado
        Atacado atacado = new Atacado(); // Objeto observador
        int turno = 0;
        int round = 1;
        
        while(true){
            System.out.printf("------------------ROUND %02d------------------\n", round);
            if(turno == 0) {
                atacante.ConfigAtacante(p1); // Observado
                
                atacado.ConfigAtacado(p2); // Observador
            
                atacante.addObserver(atacado);
            
                atacante.atacar();
                
                p2.mostrarEstado();
                
                turno = 1;
                
                System.out.println("");
            }else {
                atacante.ConfigAtacante(p2);
            
                atacado.ConfigAtacado(p1);
            
                atacante.addObserver(atacado);
            
                atacante.atacar();
            
                p1.mostrarEstado();
                
                turno = 0;
                
                System.out.println("");
            }
            if(p1.getVida() <= 0 ){
                System.out.println(p2.getNome() + " venceu a batalha");
                break;
            } else if(p2.getVida() <= 0) {
                System.out.println(p1.getNome() + " venceu a batalha");
                break;
            }
            round++;
            System.out.println("--------------------------------------------");
        }
        
        System.out.println("\n-----------------FIM DA BATALHA-----------------\n");
    }
    
}
