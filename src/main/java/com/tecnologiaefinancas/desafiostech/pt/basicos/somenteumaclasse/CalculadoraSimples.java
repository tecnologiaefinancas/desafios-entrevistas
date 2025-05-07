package com.tecnologiaefinancas.desafiostech.pt.basicos.somenteumaclasse;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        // Desafio: Criar uma Calculadora Simples

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite a operação (+ - * ou /):");
        String operacao = scanner.next();

        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
            case "/":
                if(segundoNumero != 0) {
                    resultado = (double) primeiroNumero/segundoNumero;
                } else {
                    System.out.println("Erro! Divisão por zero não permitida");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                return;
        } System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}


