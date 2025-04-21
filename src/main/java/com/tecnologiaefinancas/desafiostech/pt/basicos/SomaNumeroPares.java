package com.tecnologiaefinancas.desafiostech.pt.basicos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaNumeroPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula a soma de todos os números pares até um número que você escolher.");
        System.out.print("Digite um número inteiro positivo: ");
               try {
            int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int soma = 0;

            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    soma += i;
                }
            }

            System.out.println("A soma dos números pares até o número " + numero + " inserido é: " + soma);



        scanner.close();
    }
               } catch (InputMismatchException ex) {
                   System.out.println("Somente é valido números inteiros positivos. Tente novamnte.");
               }
}}