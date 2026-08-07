package com.service;

import com.exception.AgendaCheiaException;
import com.exception.ContatoNaoExisteException;
import com.exception.ListaVaziaException;
import com.model.Contato;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                return;
            }
        }
        throw new AgendaCheiaException();
    }

    public Contato consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (Contato c : contatos) {
            if (c != null && c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                return c;
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    public Contato[] listarContatos() throws ListaVaziaException {
        boolean possuiContato = false;
        for (Contato c : contatos) {
            if (c != null) {
                possuiContato = true;
                break;
            }
        }
        if (!possuiContato) {
            throw new ListaVaziaException();
        }
        return contatos;
    }
}

