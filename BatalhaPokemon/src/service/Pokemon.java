package service;

public abstract class Pokemon {
    private String nome;
    private int vida;
    private int mana;
    private IAtaque ataque;
    private IDefesa defesa;

    public void setAtaque(IAtaque ataque) {
        this.ataque = ataque;
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
    
    public void atacar() {
        ataque.atacar();
    };
    public void defender(){
        defesa.defender();
    };

    public void setDefesa(IDefesa defesa) {
        this.defesa = defesa;
    }
    public abstract void especial();
    
    public void mostrarEstado(){
        System.out.printf("%s esta com %d pontos de vida e %d pontos de mana.%n", this.getNome(), this.getVida(), this.getMana());
    }
}
