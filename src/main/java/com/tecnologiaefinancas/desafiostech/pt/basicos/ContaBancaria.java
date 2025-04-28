package com.tecnologiaefinancas.desafiostech.pt.basicos;

public class ContaBancaria {

    /*
    Desafio: Gerenciador de Contas Bancárias - A classe deve conter as funcionalidades
    básicas de depósito, saque e exibição de saldo.

    - Requisitos:
    - 01 atributo para armazenar o numero da conta,
    - 01 atributo para armazenar o nome do titular.
    - 01 atributo para o saldo da conta.

    -Métodos:
    - 01 construtor para inicializar o nr da conta, o titular e o saldo inicial.
    - deposito(double montante) - adicionar um valor ao saldo.
    - saque(double montante) - retira um valor do saldo, mas somente se houver
    saldo suficiente. Se o saldo for insuficiente, mostre uma mensagem de erro.
    - getDetalhesConta() exibe as informacoes da conta, incluindo saldo atual.

    - Regras:
    - Não permita que o saldo fique negativo.
    - Formate os valores monetários com 2 casas decimais.

     */

    private Integer numeroConta;
    private String nomeTitular;
    private Double saldoConta;

    private ContaBancaria(){};

    private ContaBancaria(Integer numeroConta, String nomeTitular, Double saldoConta){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getDetalhesConta(){
        return "- Conta: " + numeroConta.toString() + "\n"
        + "- Titular: " + nomeTitular + "\n"
        + "- Saldo atual: R$" + String.format("%.2f", saldoConta);
    }


    public void deposito(double montante) {
        if(montante > 0) {
            saldoConta += montante; // Significa saldoConta atual é igual saldoConta anterior mais o montante
            System.out.println("Depósito efetuado com sucesso. O novo saldo é R$" + String.format("%.2f", getSaldoConta()));
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }

    }

    public void saque(double montante){
        if (montante> 0 && saldoConta >= montante) {
            saldoConta -= montante; // Significa saldoConta é igual saldoConta anterior menos o montante
            System.out.println("Saque no valor de R$" + String.format("%.2f", montante) + " efetuado com sucesso." );
        } else {
            System.out.println("Não há saldo suficiente disponível para realizar o saque de R$" + String.format("%.2f", montante) );
        }
    }

    public static void main(String[] args) {
        ContaBancaria novaConta = new ContaBancaria(4875, "Fulano de Tal", 200.00);
        System.out.println(novaConta.getDetalhesConta());

        // Tentar depositar 200
        novaConta.deposito(200);

        // Tentar depositar -100
        novaConta.deposito(-100);

        // Tentar sacar 401
        novaConta.saque(401);

        // Tentar sacar 400
        novaConta.saque(400);

        novaConta.getDetalhesConta();
    }
}




