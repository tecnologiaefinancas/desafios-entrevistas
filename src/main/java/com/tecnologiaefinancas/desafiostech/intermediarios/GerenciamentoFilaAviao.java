package com.tecnologiaefinancas.desafiostech.intermediarios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class GerenciamentoFilaAviao {

    /* Desafio: Gerenciamento de Fila de Embarque no Avião
    Você deve implementar um sistema de gerenciamento de fila para embarque em um avião. Existem quatro níveis de prioridade:
    - Primeira Classe
    - Clientes com Necessidades Especiais
    - Clientes da Classe Executiva
    - Clientes da Classe Econômica

    O sistema deve ser capaz de receber o nome dos passageiros e sua categoria de prioridade,
    organizar a fila de embarque de acordo com as prioridades e exibir a ordem correta.
     */

    public static void main(String[] args) {
        //Filas para cada prioridade
        Queue<String> primeiraClasse = new LinkedList<>();
        Queue<String> necessidadesEspeciais = new LinkedList<>();
        Queue<String> classeExecutiva = new LinkedList<>();
        Queue<String> classeEconomica = new LinkedList<>();

        //Adicionando passageiros a fila (exemplo de entrada)
        classeEconomica.add("Davi - Classe Econômica");
        primeiraClasse.add("Alice - Primeira Classe");
        classeEconomica.add("Maria - Classe Econômica");
        necessidadesEspeciais.add("Beatriz - Necessidades Especiais");
        classeExecutiva.add("Carol - Classe Executiva");


        //Processo de embarque baseado em prioridade
        Stream.of(primeiraClasse, necessidadesEspeciais, classeExecutiva, classeEconomica)
                .flatMap(Queue::stream) // Combina os elementos das filas
                .forEach(System.out::println);

    }
}
