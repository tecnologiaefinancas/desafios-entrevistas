package com.tecnologiaefinancas.desafiostech.pt.avancados.log.repository;

import com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity.Pedido;

import static com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity.Pedido.listaPedidosEntity;

public class PedidoRepository {

    public static Pedido parseLog(String log) {
        if (log.contains("Pedido: ") && log.contains("Cliente: ") &&
                log.contains("Produto: ") && log.contains("Quantidade: ") && log.contains("Preço: ")) {

            String pedido = log.substring(log.indexOf("Pedido: #") + 9, log.indexOf(" | Cliente:"));
            String cliente = log.substring(log.indexOf("Cliente: ") + 9, log.indexOf(" | Produto:"));
            String produto = log.substring(log.indexOf("Produto: ") + 9, log.indexOf(" | Quantidade: "));
            int quantidade = Integer.parseInt(log.substring(log.indexOf("Quantidade: ") + 12, log.indexOf(" | Preço: ")));
            double preco = Double.parseDouble(log.substring(log.indexOf("Preço: R$ ") + 10).replace(",", "."));

            Pedido novoPedido = new Pedido(pedido, cliente, produto, quantidade, preco);

            listaPedidosEntity.add(novoPedido);
            return novoPedido;
        }
        System.out.println("Erro: Log em formato inválido.");
        return null; // Retorna null se o log for inválido
    }
}


