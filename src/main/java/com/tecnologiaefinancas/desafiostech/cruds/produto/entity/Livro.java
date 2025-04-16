package com.tecnologiaefinancas.desafiostech.cruds.produto.entity;


public class Livro {

    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private String genero;

    public Livro (){};

    public Livro (String titulo, String autor, Integer anoPublicacao, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    private String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao(){
        return anoPublicacao;
    }

    public String getGenero(){
        return genero;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                '}';
    }
}
