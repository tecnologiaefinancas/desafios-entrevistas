package com.tecnologiaefinancas.desafiostech.pt.basicos.somenteumaclasse;

import java.util.Scanner;

public class ContadorPalavras {

    // Desafio: contar quantas palavras tem em uma frase

    public static int contarPalavras(String texto) {
        if (texto == null || texto.isEmpty()){
            return 0;
        }
        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String entrada = scanner.nextLine();
        scanner.close();

        int numeroPalavras = contarPalavras(entrada);
        System.out.println("Número de palavras " + numeroPalavras);
    }
}
