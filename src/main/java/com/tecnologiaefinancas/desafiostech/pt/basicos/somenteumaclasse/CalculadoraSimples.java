package com.tecnologiaefinancas.desafiostech.pt.basicos.somenteumaclasse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        // Desafio: Criar uma Calculadora Simples

        Scanner scanner = new Scanner(System.in);
        double primeiroNumero = 0;
        double segundoNumero = 0;
         primeiroNumero = lerNumero(scanner, "Digite o primeiro número:");

        System.out.println("Digite a operação (+ - * ou /):");
        String simboloOperacao = scanner.next();

        segundoNumero = lerNumero(scanner, "Digite o segundo número");

        try {
            Operacao operacao = Operacao.doSimbolo(simboloOperacao);
            double resultado = operacao.executar(primeiroNumero, segundoNumero);

            System.out.println("O resultado da operação é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double lerNumero(Scanner scanner, String prompt){
        double numero = 0;
        boolean entradaValida = false;
        while(!entradaValida){
            System.out.println(prompt);
            try{
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e){
                System.err.println("Erro de entrada. Por favor, digite APENAS números nesse campo.");
            scanner.next();
            }
        }
        return numero;
    }

    public enum Operacao {
        SOMA("+") {
            @Override
            public double executar(double a, double b) {
                return a + b;
            }
        },
        SUBTRACAO("-") {
            @Override
            public double executar(double a, double b){
                return a - b;
            }
        },
        MULTIPLICACAO("*"){
            @Override
            public double executar(double a, double b){
                return a * b;
            }
        },
        DIVISAO("/"){
            @Override
            public double executar(double a, double b){
                if (b==0){
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
                return a/b;
            }
        };
        private final String simbolo;
        Operacao(String simbolo){
            this.simbolo = simbolo;
        }

        public abstract double executar(double a, double b);


        public static Operacao doSimbolo(String simbolo) {
            for (Operacao op : values()) {
                if (op.simbolo.equals(simbolo)) {
                    return op;
                }
            }
            throw new IllegalArgumentException("Operação inválida: " + simbolo + ". Digite: +, -, * ou / em operação.");
        }
    }
}


