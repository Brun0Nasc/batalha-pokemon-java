package service;

import tiposPokemon.Agua;
import tiposPokemon.Fogo;
import tiposPokemon.Grama;

public enum EscolheTipoPokemon {
    AGUA {
        @Override
        public Pokemon obterPokemon(String nome) {
            return new Agua(nome);
        }
    },
    FOGO {
        @Override
        public Pokemon obterPokemon(String nome) {
            return new Fogo(nome);
        }
    },
    GRAMA {
        @Override
        public Pokemon obterPokemon(String nome) {
            return new Grama(nome);
        }
    };
    
    public abstract Pokemon obterPokemon(String nome);
}
