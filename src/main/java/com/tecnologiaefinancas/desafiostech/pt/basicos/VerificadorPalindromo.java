package com.tecnologiaefinancas.desafiostech.pt.basicos;

import java.util.Scanner;

public class VerificadorPalindromo {

    // Desafio: verificar se uma palavra é palíndromo

    public static boolean isPalindromo(String str){
        String limpo = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverso = new StringBuilder(limpo).reverse().toString();
        return limpo.equals(reverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou uma frase: ");
        String entrada = scanner.nextLine();
        scanner.close();

        if(isPalindromo(entrada)){
            System.out.println("É um palíndromo!");
        } else {
            System.out.println(("Não é um palíndromo."));
        }
    }
}
