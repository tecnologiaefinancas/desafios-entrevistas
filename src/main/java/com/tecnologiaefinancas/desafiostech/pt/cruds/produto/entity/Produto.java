package com.tecnologiaefinancas.desafiostech.pt.cruds.produto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double preco;

    public Produto() {
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getPreco(){
        return preco;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }
}


