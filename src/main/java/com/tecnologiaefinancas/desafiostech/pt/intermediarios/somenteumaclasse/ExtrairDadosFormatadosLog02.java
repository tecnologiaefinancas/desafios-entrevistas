package com.tecnologiaefinancas.desafiostech.pt.intermediarios.somenteumaclasse;

public class ExtrairDadosFormatadosLog02 {
    /*
    Desafio: Imagine que você recebeu um sistema de registros de pedidos com informações formatadas em strings.

    Exemplo de Entrada:
    Pedido: #A123 | Cliente: João Silva | Produto: Laptop | Quantidade: 2 | Preço: R$ 4999.99
    Pedido: #B456 | Cliente: Maria Souza | Produto: Smartphone | Quantidade: 1 | Preço: R$ 3299.50
    Pedido: #C789 | Cliente: Carlos Lima | Produto: Headphones | Quantidade: 3 | Preço: R$ 599.99


    Objetivo:
    1️. Criar um métod0 que receba uma linha do pedido e extraia:
    - O código do pedido (#A123, #B456, #C789)
    - O nome do cliente (João Silva, Maria Souza, Carlos Lima)
    - O produto comprado (Laptop, Smartphone, Headphones)
    - A quantidade comprada
    - O preço do produto
    2️. Usar substring() e indexOf() para capturar essas informações.
    3️. Exibir os resultados formatados corretamente.


     */
    public static void main (String[] args){
        String log1 = "Pedido: #A123 | Cliente: João Silva | Produto: Laptop | Quantidade: 2 | Preço: R$ 4999.99";
        String log2 = "Pedido: #B456 | Cliente: Maria Souza | Produto: Smartphone | Quantidade: 1 | Preço: R$ 3299.50";
        String log3 = "Pedido: #C789 | Cliente: Carlos Lima | Produto: Headphones | Quantidade: 3 | Preço: R$ 599.99";

        parseLog(log1);
        parseLog(log2);
        parseLog(log3);
    }

    public static void parseLog(String log) {
        // Garante que o log contem o formato esperado antes de extrair os dados
        if (log.contains("Pedido: ") && log.contains("Cliente: ") &&
                log.contains("Produto: ") && log.contains("Quantidade: ") && log.contains("Preço: ")) {

            // Extraindo o pedido
            int pedidoStart = log.indexOf("Pedido: ") + 8;
            int pedidoEnd = log.indexOf(" | Cliente:");
            String pedido = log.substring(pedidoStart, pedidoEnd);

            // Extraindo o cliente
            int clientStart = log.indexOf("Cliente: ") + 9;
            int clienteEnd = log.indexOf(" | Produto:");
            String cliente = log.substring(clientStart, clienteEnd);

            // Extraindo o produto
            int produtoStart = log.indexOf("Produto: ") + 9;
            int produtoEnd = log.indexOf(" | Quantidade: ");
            String produto = log.substring(produtoStart, produtoEnd);

            // Extraindo a quantidade
            int quantidadeStart = log.indexOf("Quantidade: ") + 12;
            int quantidadeEnd = log.indexOf(" | Preço: ");
            String quantidade = log.substring(quantidadeStart, quantidadeEnd);

            //Extraindo o preço
            int precoStart = log.indexOf("Preço: R$ ") + 10;
            String preco = log.substring(precoStart);


            // Exibe o log extraido
            System.out.println("Nr pedido: " + pedido);
            System.out.println("Cliente: " + cliente);
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço R$: " + preco);
            System.out.println("-----------------------");
        } else {
            System.out.println("Erro: Log em formato inválido.");
        }
    }

}
