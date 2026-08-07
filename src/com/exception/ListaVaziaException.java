package com.exception;

public class ListaVaziaException extends Exception{
    public ListaVaziaException() {
    }
    @Override
    public String getMessage() {
        return "lista de contato vazia!";
    }
}

