package com.tecnologiaefinancas.desafiostech.pt.cruds.produto.controller;

import com.tecnologiaefinancas.desafiostech.pt.cruds.produto.entity.Produto;
import com.tecnologiaefinancas.desafiostech.pt.cruds.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public Iterable<Produto> listar(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obter(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        produtoRepository.deleteById(id);;
    }
}
