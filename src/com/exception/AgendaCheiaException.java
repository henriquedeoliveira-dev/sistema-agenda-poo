package com.exception;

public class AgendaCheiaException extends Exception{
    private final int limite;

    public AgendaCheiaException(int limite) {
        this.limite = limite;
    }

    @Override
    public String getMessage() {
        return "Não é possível adicionar novos contatos," +
                "número máximo da agenda: " + this.limite;
    }
}

