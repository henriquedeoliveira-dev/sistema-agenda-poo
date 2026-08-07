package com.exception;

public class ContatoNaoExisteException extends Exception{
    public ContatoNaoExisteException(String nome) {
    }

    @Override
    public String getMessage() {
        return "O contato solicitado não existe!";
    }
}

