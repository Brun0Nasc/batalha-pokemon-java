package service;

import java.util.Random;

public abstract class Pokemon {
    private String nome;
    private int vida;
    private int mana;
    private IAtaque ataque;
    private IDefesa defesa;
    private IEspecial especial;
    private String tipo;

    // Set's das interfaces
    public void setAtaque(IAtaque ataque) {
        this.ataque = ataque;
    }
    
    public void setDefesa(IDefesa defesa) {
        this.defesa = defesa;
    }
    
    public void setEspecial(IEspecial especial) {
        this.especial = especial;
    }

    // Getter's e setter's dos atributos normais
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    
    // Funções que vão implementar as interfaces
    public void atacar() {
        ataque.atacar();
    }
    
    public void defender(){
        defesa.defender();
    }
    
    public void especial(){
        especial.especial();
    }
    
    // Funções comum entre todos os pokemons
    public void levaDano(int valor) {
        this.vida -= valor;
    }

    public int testaCritico(){
        Random gerador = new Random();
        int critico = gerador.nextInt(11);
        
        if(critico == 5) {
            this.setAtaque(new AtaqueCritico(this));
        } else {
            this.setAtaque(new AtaqueNormal(this));
        }
        
        return critico;
    };
    
    public void mostrarEstado(){
        System.out.printf("%s esta com %d pontos de vida e %d pontos de mana.%n", this.getNome(), this.getVida(), this.getMana());
    }
}
