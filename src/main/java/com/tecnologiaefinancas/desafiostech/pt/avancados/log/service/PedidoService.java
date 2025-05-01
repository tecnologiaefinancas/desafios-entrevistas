package com.tecnologiaefinancas.desafiostech.pt.avancados.log.service;

import com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

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
}
