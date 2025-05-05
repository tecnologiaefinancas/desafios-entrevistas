package com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String codigoPedido;
    private String nomeCliente;
    private String nomeProduto;
    private int quantidade;
    private double preco;

    public static List<Pedido> listaPedidosEntity = new ArrayList<>();



    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pedido() {
    }

    public Pedido(String codigoPedido, String nomeCliente, String nomeProduto, int quantidade, double preco) {
        this.codigoPedido = codigoPedido.toLowerCase();
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nr pedido: #" + codigoPedido.toUpperCase() + '\n' +
        "Cliente: " + nomeCliente + '\n' +
        "Produto: " + nomeProduto + '\n' +
        "Quantidade: " + quantidade + '\n' +
                "Preço R$: " + preco + '\n' +
                "-----------------------";
    }

}
