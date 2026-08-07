package com;

import com.exception.AgendaCheiaException;
import com.exception.ContatoNaoExisteException;
import com.exception.ListaVaziaException;
import com.model.Contato;
import com.service.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        boolean continuar = true;

        while (continuar) {
            System.out.println("*****AGENDA*****");
            System.out.println("selecione a opção desejada:");
            System.out.println("tecle 0: listar todos os contatos");
            System.out.println("tecle 1: adicionar contato");
            System.out.println("tecle 2: consultar contato por nome");
            System.out.println("tecle 3: sair");

            try {
                int opcaoDesejada = scanner.nextInt();
                scanner.nextLine();

                if (opcaoDesejada == 0) {
                    Contato[] todosContatos = agenda.listarContatos();
                    System.out.println("*****Lista de contatos*****");
                    for (Contato c : todosContatos) {
                        if (c != null) {
                            System.out.println(c);
                        }
                    }

                } else if (opcaoDesejada == 1) {
                    System.out.println("digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("digite seu telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.println("digite seu email");
                    String email = scanner.nextLine();

                    Contato c = new Contato();
                    c.setNome(nome);
                    c.setTelefone(telefone);
                    c.setEmail(email);

                    agenda.adicionarContato(c);
                    System.out.println("contato adicionado com sucesso!");

                } else if (opcaoDesejada == 2) {
                    System.out.println("digite o nome do contato para consulta:");
                    String nomeBusca = scanner.nextLine();

                    Contato c = agenda.consultarContatoPorNome(nomeBusca);
                    System.out.println("nome encontrado: " + c);
                } else if (opcaoDesejada == 3) {
                    continuar = false;
                    System.out.println("aplicação encerrada!");
                } else {
                    System.out.println("opção inválida!");
                }

            } catch (ListaVaziaException e){
                System.out.println("\nErro: " + e.getMessage());
            } catch (AgendaCheiaException e) {
                System.out.println("\nErro:" + e.getMessage());
            } catch (ContatoNaoExisteException e) {
                System.out.println("\nErro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("entrada inválida, Digite apenas números!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

