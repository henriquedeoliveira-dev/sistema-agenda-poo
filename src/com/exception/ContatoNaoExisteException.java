package com.exception;

public class ContatoNaoExisteException extends Exception{
    private String nomeBuscado;

    public ContatoNaoExisteException(String nome) {
        this.nomeBuscado = nome;
    }

    @Override
    public String getMessage() {
        return "O contato " + nomeBuscado + " não foi encontrado!";
    }
}

