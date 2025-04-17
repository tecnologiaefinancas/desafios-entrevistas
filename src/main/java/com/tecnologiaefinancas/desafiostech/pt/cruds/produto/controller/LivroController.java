package com.tecnologiaefinancas.desafiostech.pt.cruds.produto.controller;

import com.tecnologiaefinancas.desafiostech.pt.cruds.produto.entity.Livro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("api/livros")
public class LivroController {

    public static Livro livro01 = new Livro("Titulo 01", "AutorA", 2005, "Ficção");
    public static Livro livro02 = new Livro("Titulo 02", "AutorB", 2007, "Ficção");
    public static Livro livro03 = new Livro("Titulo 03", "AutorA", 2009, "Aventura");
    public static Livro livro04 = new Livro("Titulo 04", "AutorA", 2005, "Ficção");

    public static List<Livro> buscarLivrosPorAutor() {
        List<Livro> list = new ArrayList<>();
        list.add(livro01);
        list.add(livro02);
        list.add(livro03);
        list.add(livro04);
        List<Livro> livrosPorAutor = list.stream().filter(l -> l.getAutor().equals("AutorA")).toList();
        System.out.println(livrosPorAutor.toString());
        return livrosPorAutor;
    }



}

