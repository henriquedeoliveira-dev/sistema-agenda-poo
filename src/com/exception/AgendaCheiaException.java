package com.exception;

public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage() {
        return "Não é possível adicionar novos contatos, pois a agenda está cheia!";
    }
}

