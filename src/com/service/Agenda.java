package com.service;

import com.exception.AgendaCheiaException;
import com.exception.ContatoNaoExisteException;
import com.exception.ListaVaziaException;
import com.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contato> contatos;
    private static final int LIMITE_MAXIMO = 30;

    public Agenda() {
        contatos = new ArrayList<>();
    }


    public void verificarLimite() throws AgendaCheiaException {
        if (contatos.size() >= LIMITE_MAXIMO) {
            throw new AgendaCheiaException(LIMITE_MAXIMO);
        }
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        verificarLimite();
        contatos.add(c);
    }

    public Contato consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                return c;
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    public List<Contato> listarContatos() throws ListaVaziaException {
        if (contatos.isEmpty()) {
            throw new ListaVaziaException();
        }
        return contatos;
    }

    public void deletarContato(String nome) throws ContatoNaoExisteException {
        Contato contatoEncontrado = consultarContatoPorNome(nome);
        contatos.remove(contatoEncontrado);
    }
}

