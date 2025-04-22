package com.tecnologiaefinancas.desafiostech.pt.basicos.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream02 {

        /*
     Desafio:  Transformação com Streams
     Você recebe uma lista de palavras. Sua tarefa é:
    - Transformar em letras maíusculas.
    - Ordenar por tamanho.
    - Coletar em uma nova lista.
    */
    public static void main (String[] args){
        List<String> listaPalavras = Arrays.asList("Java", "Stream", "API", "Programação", "Lambda");

        List<String> novaLista = listaPalavras.stream()
                .map(p -> p.toUpperCase())
                .sorted(Comparator.comparingInt(String::length))
                        .toList();
        System.out.println(novaLista);
    }
}
