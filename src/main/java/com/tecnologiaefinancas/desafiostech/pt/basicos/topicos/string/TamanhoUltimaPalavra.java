package com.tecnologiaefinancas.desafiostech.pt.basicos.topicos.string;

import java.util.Arrays;

public class TamanhoUltimaPalavra {

    /* Desafio - Dado uma string s composta por palavras e espaços, retorne o comprimento da última palavra na string.
    Uma palavra é uma substring máxima composta apenas por caracteres que não sejam espaços.

    Exemplos:

    Exemplo 1:
    - Entrada:
    s = "Hello World"
    - Saída:
    5
    - Explicação:
    A última palavra é "World", que possui 5 caracteres.

    Exemplo 2:
    - Entrada:
    s = "   fly me   to   the moon  "
    - Saída:
    4
    - Explicação:
    A última palavra é "moon", que possui 4 caracteres.

    Exemplo 3:
    - Entrada:
    s = "luffy is still joyboy"
    - Saída:
    6
    - Explicação:
    A última palavra é "joyboy", que possui 6 caracteres.

    LeetCode - Easy
*/

    public static int tamanhoUltimaPalavra(String s){
        String[] words = s.trim().split("\\s+"); // Remove espaços extras e divide por espaços.
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(tamanhoUltimaPalavra("Hello World")); // Output: 5
        System.out.println(tamanhoUltimaPalavra("   fly me   to   the moon  ")); // Output: 4
        System.out.println(tamanhoUltimaPalavra("luffy is still joyboy")); // Output: 6
    }

}

