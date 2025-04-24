package com.tecnologiaefinancas.desafiostech.pt.basicos;

import java.util.LinkedList;

public class MessageBank {
    /*
    Desafio: Banco de Mensagens Compartilhado
    Crie um sistema onde várias threads representam usuários enviando mensagens para um banco compartilhado. Uma thread gerencia a leitura das mensagens e as exibe na tela.
    -- Requisitos:
    - Cada usuário (thread) adiciona mensagens ao banco.
    - O banco de mensagens é protegido com synchronized para evitar conflitos.
    - A thread de leitura espera até que haja mensagens e exibe uma por vez usando wait() e notify().
     */

    private final LinkedList<String> messages = new LinkedList<>();

    public synchronized void addMessage(String message) {
        messages.add(message);
        System.out.println("Nova mensagem adicionada: " + message);
        notify();
    }

    public synchronized String readMessage(){
        while (messages.isEmpty()){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        } return messages.removeFirst();
    }

    public void startReaderThread() {
        new Thread(() -> {
            while(true) {
                String message;

                synchronized (this) {
                    message = readMessage();
                } if (message != null) {
                    System.out.println("Mensagem lida " + message);
                }
            }
        }).start();
    }

    public static void main (String[] args) {
        MessageBank messageBank = new MessageBank();

        // Inicia a thread de leitura
        messageBank.startReaderThread();

        // Criando usuários (threads) que adiciona mensagens
        for (int i=1; i <= 5; i++) {
            final int userId = i;
            new Thread(() -> {
                for (int j = 1; j <= 3; j++) {
                    String message = "Usuário " + userId + ": Mensagem " + j;
                    messageBank.addMessage(message);
                    try {
                        Thread.sleep(500); // Simula intervalo entre mensagens
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }).start();
        }
    }
}
