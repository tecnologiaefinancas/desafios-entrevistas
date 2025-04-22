package com.tecnologiaefinancas.desafiostech.pt.basicos.stream;


import java.util.Arrays;
import java.util.List;

public class Stream01 {
    /*
     Desafio: Filtragem e Transformação com Streams
     Você recebe uma lista de números inteiros. Sua tarefa é:
    - Filtrar apenas os números pares.
    - Elevar cada número ao quadrado.
    - Ordenar os números em ordem crescente.
    - Exibir os números formatados como uma única linha de saída.
    */
    public static void main (String[] args) {
        List<Integer> numeros = Arrays.asList(3, 7, 8, 2, 10, 1, 5, 4);
        List<Integer> resultado = numeros.stream()
                .filter(n -> (n % 2 == 0))
                .map(n -> n * n)
                .sorted()
                .toList();

        System.out.println(resultado);
    }


}
