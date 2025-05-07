package com.tecnologiaefinancas.desafiostech.pt.intermediarios.somenteumaclasse;

import java.util.Random;
import java.util.Scanner;

public class JogoForca {

// Desafio: criar jogo de forca, jogador tem que adivinhar a palavra e tem 6 chances

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Banco de palavras para o jogo
        String[] palavras = {"java", "algoritmo", "programacao", "desenvolvimento", "computador", "tecnologia", "software", "variavel", "metodo", "objeto", "classe", "heranca"};

        // Selecionar uma palavra aleatória
        Random random = new Random();
        String palavraSecreta = palavras[random.nextInt(palavras.length)];

        // Criar array para armazenar letras descobertas
        char[] palavraAtual = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraAtual.length; i++) {
            palavraAtual[i] = '_'; // Aspas simples identifica o caractere como char, aspas duplas como String.
        }

        // Inicializar variaveis do jogo
        int tentativasRestantes = 6;
        boolean palavraCompleta = false;
        StringBuilder letrasUsadas = new StringBuilder(); // Usamos StringBuilder por ser mutável, alocar menos espaço da memória
        // e poder usar métodos como append(), insert() e delete() que são otimizados para manipulação de texto.

        System.out.println("Bem vindo ao Jogo da Forca!");
        System.out.println("Tente adivinhar a palavra secreta. Você tem 6 tentativas.");

        // Loop principal do jogo
        while (tentativasRestantes > 0 && !palavraCompleta){
            // Mostrar estado atual
            System.out.println("\nTentativas restantes: " + tentativasRestantes);
            System.out.println("Letras usadas: " + letrasUsadas.toString());

            // Mostrar palavra com letras descobertas
            System.out.println("Palavra: ");
            for (char c: palavraAtual){
                System.out.println(c + "");
            }
            System.out.println();

            //TODO:
            // Mostrar boneco da forca
            // Pedir ao jogador uma letra
            // Validar entrada
            // Verificar se a letra já foi usada
            // Adicionar letra às letras usadas
            // Verificar se a letra está na palavra
            // Atualizar tentativas restantes se errou
            // Verificar se a palavra foi contemplada
            // Mostrar resultado final
            // Métod0 para desenhar o boneco da forca
        }
    }
    }

