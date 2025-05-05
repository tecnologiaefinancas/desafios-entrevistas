package com.tecnologiaefinancas.desafiostech.pt.basicos.desafiossomenteumaclasse;

public class Instanceof {

    /*
    Desafio: Crie uma classe Instanceof que contém um métod0
   identify(Object obj). Esse métod0 deve verificar se obj é uma instância
   de String, Integer ou Double. Se for um desses tipos, exiba uma mensagem correspondente.
     */

    static void identify(Object obj) {
        if(obj instanceof String) {
            System.out.println("O objeto é uma String!");
        } else if (obj instanceof Double){
            System.out.println("O objeto é um Double!");
        } else if (obj instanceof Integer){
            System.out.println("O objeto é um Integer!");
        } else {
            System.out.println("Tipo desconhecido!");
        }
    }

    public static void main (String[] args){
        identify("Hello, world!");
        identify(42);
        identify(3.14);
        identify(true); // Teste com um tipo não tratado.
    }
}
