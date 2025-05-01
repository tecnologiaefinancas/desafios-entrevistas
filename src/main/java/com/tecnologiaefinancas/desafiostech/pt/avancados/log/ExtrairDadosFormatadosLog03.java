package com.tecnologiaefinancas.desafiostech.pt.avancados.log;

import com.tecnologiaefinancas.desafiostech.pt.avancados.log.entity.Pedido;
import com.tecnologiaefinancas.desafiostech.pt.avancados.log.service.PedidoService;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.tecnologiaefinancas.desafiostech.pt.avancados.log.repository.PedidoRepository.parseLog;


public class ExtrairDadosFormatadosLog03 {


    /*
        Desafio: Imagine que você recebeu um sistema de registros de pedidos com informações formatadas em strings.

          Objetivo:
    1️. Criar um métod0 que receba uma linha do pedido e extraia:
    - O código do pedido (#A123, #B456, #C789)
    - O nome do cliente (João Silva, Maria Souza, Carlos Lima)
    - O produto comprado (Laptop, Smartphone, Headphones)
    - A quantidade comprada
    - O preço do produto
    2️. Usar substring() e indexOf() para capturar essas informações.
    3️. Exibir os resultados formatados corretamente.
    -  O usuário poderá:
    4. Digitar o codigo do pedido e deve retornar somente o log daquele pedido.
    5. Filtrar pedidos acima de R$ 1000.
    6. Ordenar por preço.
    6. Contar quantos clientes compraram mais de 2 unidades.


     */

    public static List<String> pedidos = List.of(
            "Pedido: #A001 | Cliente: Ana Souza | Produto: Laptop | Quantidade: 1 | Preço: R$ 4599.99",
            "Pedido: #A002 | Cliente: Bruno Lima | Produto: Smartphone | Quantidade: 2 | Preço: R$ 3299.50",
            "Pedido: #A003 | Cliente: Carlos Santos | Produto: Headphones | Quantidade: 1 | Preço: R$ 599.99",
            "Pedido: #A004 | Cliente: Daniela Martins | Produto: Monitor | Quantidade: 1 | Preço: R$ 1249.99",
            "Pedido: #A005 | Cliente: Eduardo Oliveira | Produto: Teclado Mecânico | Quantidade: 3 | Preço: R$ 499.90",
            "Pedido: #A006 | Cliente: Fernanda Costa | Produto: Mouse Gamer | Quantidade: 2 | Preço: R$ 349.99",
            "Pedido: #A007 | Cliente: Gabriel Almeida | Produto: SSD 1TB | Quantidade: 1 | Preço: R$ 799.99",
            "Pedido: #A008 | Cliente: Helena Pereira | Produto: Cadeira Gamer | Quantidade: 1 | Preço: R$ 899.99",
            "Pedido: #A009 | Cliente: Igor Fernandes | Produto: Monitor Ultrawide | Quantidade: 2 | Preço: R$ 1999.99",
            "Pedido: #A010 | Cliente: Juliana Ribeiro | Produto: Microfone Condensador | Quantidade: 1 | Preço: R$ 999.99",
            "Pedido: #A011 | Cliente: Lucas Silva | Produto: Placa de Vídeo RTX 4080 | Quantidade: 1 | Preço: R$ 5999.99",
            "Pedido: #A012 | Cliente: Mariana Torres | Produto: Fone Bluetooth | Quantidade: 4 | Preço: R$ 249.99",
            "Pedido: #A013 | Cliente: Nelson Rocha | Produto: Processador Ryzen 9 | Quantidade: 1 | Preço: R$ 3199.99",
            "Pedido: #A014 | Cliente: Olivia Duarte | Produto: Gabinete ATX | Quantidade: 1 | Preço: R$ 749.99",
            "Pedido: #A015 | Cliente: Pedro Vasconcelos | Produto: Câmera DSLR | Quantidade: 1 | Preço: R$ 3999.99",
            "Pedido: #A016 | Cliente: Renata Barbosa | Produto: Mesa Digitalizadora | Quantidade: 2 | Preço: R$ 1299.99",
            "Pedido: #A017 | Cliente: Samuel Castro | Produto: Fonte 750W | Quantidade: 1 | Preço: R$ 499.99",
            "Pedido: #A018 | Cliente: Thiago Mendes | Produto: HD Externo 2TB | Quantidade: 1 | Preço: R$ 349.99",
            "Pedido: #A019 | Cliente: Vanessa Lima | Produto: Impressora Multifuncional | Quantidade: 1 | Preço: R$ 799.99",
            "Pedido: #A020 | Cliente: William Freitas | Produto: Webcam Full HD | Quantidade: 3 | Preço: R$ 199.99",
            "Pedido: #A021 | Cliente: Amanda Oliveira | Produto: AirPods Pro | Quantidade: 2 | Preço: R$ 1499.99",
            "Pedido: #A022 | Cliente: Bruno Silva | Produto: Notebook Gamer | Quantidade: 1 | Preço: R$ 7999.99",
            "Pedido: #A023 | Cliente: Camila Souza | Produto: Mesa de Escritório | Quantidade: 1 | Preço: R$ 499.99",
            "Pedido: #A024 | Cliente: Daniel Rodrigues | Produto: Hub USB-C | Quantidade: 3 | Preço: R$ 149.99",
            "Pedido: #A025 | Cliente: Elisa Melo | Produto: Lâmpada Inteligente | Quantidade: 4 | Preço: R$ 99.99",
            "Pedido: #A026 | Cliente: Felipe Nogueira | Produto: Kindle Paperwhite | Quantidade: 1 | Preço: R$ 699.99",
            "Pedido: #A027 | Cliente: Gabriela Costa | Produto: Relógio Smart | Quantidade: 2 | Preço: R$ 1199.99",
            "Pedido: #A028 | Cliente: Hugo Pereira | Produto: Estabilizador de Câmera | Quantidade: 1 | Preço: R$ 1999.99",
            "Pedido: #A029 | Cliente: Isabella Martins | Produto: Tablet Android | Quantidade: 1 | Preço: R$ 2499.99",
            "Pedido: #A030 | Cliente: João Ribeiro | Produto: Chromecast Ultra | Quantidade: 2 | Preço: R$ 449.99",
            "Pedido: #A031 | Cliente: Karina Silva | Produto: Filtro de Linha | Quantidade: 5 | Preço: R$ 59.99",
            "Pedido: #A032 | Cliente: Leonardo Souza | Produto: Luva Touchscreen | Quantidade: 3 | Preço: R$ 89.99",
            "Pedido: #A033 | Cliente: Mônica Andrade | Produto: Dock Station | Quantidade: 1 | Preço: R$ 499.99",
            "Pedido: #A034 | Cliente: Nathan Melo | Produto: Bateria Externa 10000mAh | Quantidade: 2 | Preço: R$ 129.99",
            "Pedido: #A035 | Cliente: Oscar Vasconcelos | Produto: Extensor Wi-Fi | Quantidade: 1 | Preço: R$ 249.99",
            "Pedido: #A036 | Cliente: Paula Almeida | Produto: Carregador Rápido USB-C | Quantidade: 3 | Preço: R$ 179.99",
            "Pedido: #A037 | Cliente: Rodrigo Torres | Produto: Fire TV Stick | Quantidade: 1 | Preço: R$ 349.99",
            "Pedido: #A038 | Cliente: Sabrina Costa | Produto: Caixa de Som Bluetooth | Quantidade: 2 | Preço: R$ 399.99",
            "Pedido: #A039 | Cliente: Tadeu Barbosa | Produto: Micro SD 128GB | Quantidade: 4 | Preço: R$ 149.99",
            "Pedido: #A040 | Cliente: Ulysses Mendes | Produto: Power Bank 20000mAh | Quantidade: 1 | Preço: R$ 199.99",
            "Pedido: #A041 | Cliente: Verônica Rocha | Produto: Hub HDMI | Quantidade: 1 | Preço: R$ 299.99",
            "Pedido: #A042 | Cliente: Wagner Nunes | Produto: Termômetro Digital | Quantidade: 3 | Preço: R$ 79.99",
            "Pedido: #A043 | Cliente: Xavier Almeida | Produto: Volante para Jogos | Quantidade: 1 | Preço: R$ 599.99",
            "Pedido: #A044 | Cliente: Yara Vasconcelos | Produto: Pente de Memória RAM 16GB | Quantidade: 2 | Preço: R$ 899.99",
            "Pedido: #A045 | Cliente: Zeca Martins | Produto: Câmera de Segurança | Quantidade: 1 | Preço: R$ 1299.99"
    );

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        PedidoService pedidoService = new PedidoService();

        //Itera sobre a lista e faz o parseLog do PedidoRepository de forma a criar as entidades
        pedidos.forEach(log -> {
            Pedido pedidoEntity = parseLog(log);
            if (pedidoEntity != null) pedidoService.adicionarPedido(pedidoEntity);
        });

        System.out.println("Bem vindo ao sistema de pedidos \n \n"
        + "Escolha uma opção: \n"
        + "1 - Listar todos os pedidos \n" +
                "2 - Buscar pedido por código de 0 a 999 \n"
        + "3 - Filtrar pedidos acima de determinado preço \n"
        + "4 - Ordenar por preço crescente \n"
        + "5 - Ordernar por preço decrescente \n"
        + "6 - Contar quantos clientes compraram mais do que determinada unidades \n \n"
        + "Digite somente o número da opção selecionada: \n");

    try {
        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                pedidoService.imprimirPedidos();
                break;
            case 2:
                System.out.println("Digite o código conforme o exemplo: A042 ou P067:");
                String codigoDigitado = scanner.next();
                pedidoService.buscarPedidosPorCodigo(codigoDigitado);
                break;
            case 6:
                System.out.println("Digite acima de quantas quantas unidades compradas verificar:");
                int quantidadeUnidades = scanner.nextInt();
                filtrarQuemComprouMaisQueNUnidades(quantidadeUnidades);
                break;
            default:
                System.out.println("(!) Opção inválida! Escolha entre 1 e 6.");

        }

        scanner.close();

    } catch (InputMismatchException er) {
        System.out.println("(!) Erro: Necessário inserir somente números: de 1 a 6");
    }

 }

    // Opção Selecionada: 1 - Na classe pedidoService;



    // Opção Selecionada: 6 - Contar quantos clientes compraram mais do que determinada unidades
    public static void filtrarQuemComprouMaisQueNUnidades(int nUnidades){

        if (nUnidades < 0 ) {
            System.out.println("(!) Erro: Necessário digitar um número positivo.");
        } else {

            long retorno = Long.parseLong(String.valueOf(pedidos.stream()
                    .map(pedido -> {
                        int quantidadeInicio = pedido.indexOf("Quantidade: ") + 12;
                        int quantidadeFim = pedido.indexOf(" | Preço:");
                        int quantidadeFiltrada = Integer.parseInt(pedido.substring(quantidadeInicio, quantidadeFim));
                        return quantidadeFiltrada;
                    })
                    .filter(qtd -> qtd > nUnidades)
                    .count()));

            System.out.println("Quantidade de clientes que compraram mais que " + nUnidades + " unidades: " + retorno + ".");
        }
    };




}
