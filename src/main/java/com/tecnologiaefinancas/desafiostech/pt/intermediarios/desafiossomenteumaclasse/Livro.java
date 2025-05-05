package com.tecnologiaefinancas.desafiostech.pt.intermediarios.desafiossomenteumaclasse;

import java.util.ArrayList;

public class Livro {

    /*
    Desafio: Sistema de Gestão de Livros
    Crie uma classe `GerenciamentoLivro` que permita gerenciar um catálogo de livros.
    O sistema deve possibilitar adicionar, buscar e exibir livros, garantindo a organização de uma pequena biblioteca.

    ---

    📌 Requisitos
    1. Atributos da Classe `Livro`:
       - `titulo` (String) → O nome do livro.
       - `autor` (String) → Autor do livro.
       - `anoPublicacao` (int) → Ano de publicação.
       - `disponivel` (boolean) → Define se o livro está disponível ou emprestado.

    2. Métodos:
       - Construtor para inicializar os atributos (`titulo`, `autor`, `anoPublicacao`).
       - `emprestarLivro()` → Define o livro como indisponível.
       - `devolverLivro()` → Define o livro como disponível novamente.
       - `getDetalhesLivro()` → Retorna as informações formatadas do livro.

    3. Criar um Catálogo de Livros:
       - Utilize um **ArrayList** para armazenar vários objetos `Livro`.
       - Métod0 `adicionarLivro(Livro livro)` → Adiciona um livro ao catálogo.
       - Métod0 `buscarPorTitulo(String titulo)` → Retorna um livro com base no nome.
       - Métod0 `exibirCatalogo()` → Exibe todos os livros cadastrados.

    */



    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean estaDisponivel;

    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public boolean getEstaDisponivel(){
        return estaDisponivel;
    }

    private void setTitulo(String titulo){
        this.titulo = titulo;
    }

    private void setAutor(String autor){
        this.autor = autor;
    }

    private void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    private void setEstaDisponivel(boolean estaDisponivel){
        this.estaDisponivel = estaDisponivel;
    }


    public Livro(){};

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estaDisponivel = true;
    }

    public String getDetalhesLivro(){
        return "- Título: " + getTitulo() + "\n"
                          +"- Autor: " + getAutor() + "\n"
                          +"- Ano publicação: " + getAnoPublicacao() + "\n"
                          +"- Está disponivel? " + getEstaDisponivel() + ".";
    }

    public void emprestarLivro(){
        if(estaDisponivel){
            estaDisponivel = false;
            System.out.println("Você pegou um livro emprestado: " + titulo);
        } else {
            System.out.println("Livro indisponível para empréstimo: " + titulo);
        }
    }

    public void devolverLivro(){
        estaDisponivel = true;
        System.out.println("Livro devolvido com sucesso: " + titulo);
    }

}

class Biblioteca {

    private ArrayList<Livro> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public void exibirCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("O catálogo está vazio!");
        } else {
            catalogo.forEach(livro -> System.out.println(livro.getDetalhesLivro() + "\n ==========="));
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        return catalogo.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }



    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("\n📚 Catálogo de Livros:");
        biblioteca.exibirCatalogo();

        System.out.println("\n🔎 Buscando '1984'...");
        Livro livroBuscado = biblioteca.buscarPorTitulo("1984");
        if (livroBuscado != null) {
            System.out.println(livroBuscado.getDetalhesLivro());
            livroBuscado.emprestarLivro();
        } else {
            System.out.println("Livro não encontrado.");
        }

        System.out.println("\n📚 Catálogo atualizado:");
        biblioteca.exibirCatalogo();
    }


}