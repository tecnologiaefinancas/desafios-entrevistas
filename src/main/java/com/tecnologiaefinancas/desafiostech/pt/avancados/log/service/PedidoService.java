package com.tecnologiaefinancas.desafiostech.pt.avancados.log.service;

import com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private final List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void imprimirPedidos() {
        if(pedidos.isEmpty()){
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        System.out.println("Lista de pedidos:");
        for (Pedido pedido: pedidos) {
            System.out.println(pedido);
        }
    }

    // Opção Selecionada: 2 - Buscar pedido por código de 0 a 999
    public void buscarPedidosPorCodigo(String codigoPedido) {
        boolean encontrado = false; // Variável para verificar se encontrou o pedido

        for (Pedido pedido : pedidos) {
            if (pedido.getCodigoPedido().equalsIgnoreCase(codigoPedido)) {
                encontrado = true; // Indica que encontrou um pedido
                System.out.println(pedido);
            }
        }

        // Se nenhum pedido foi encontrado, exibe mensagem de erro
        if (!encontrado) {
            System.out.println("Nenhum pedido localizado com esse código.");
        }
    }

    // Opção Selecionada: 3 - Filtrar pedidos acima de determinado preço
    public void filtrarPedidosAcimaDeterminadoPreco(Double preco) {

        for (Pedido pedido : pedidos) {
            if (pedido.getPreco() > preco) {
                System.out.println(pedido);
            }
        }

        // Se nenhum pedido foi encontrado, exibe mensagem de erro
        if (preco < 0) {
            System.out.println("Insira um número positivo.");
        }
    }


}
