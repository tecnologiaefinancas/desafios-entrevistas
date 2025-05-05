package com.tecnologiaefinancas.desafiostech.pt.intermediarios.desafiossomenteumaclasse;

public class SistemaReservaAssentos {

    /* Desafio: Sistema de Reserva de Assentos

Crie uma classe em Java que simule um sistema de reserva de assentos em um teatro. A classe deve permitir ao usuário:
1. Reservar um assento específico.
2. Verificar se um assento está disponível.
3. Cancelar uma reserva.
4. Exibir todos os assentos e seu estado (disponível ou reservado).

Requisitos:
- Utilize uma matriz bidimensional (`char[][]`) para representar os assentos, onde cada posição pode conter `'D'` (disponível) ou `'R'` (reservado).
- Crie métodos públicos para cada funcionalidade: reservar, verificar, cancelar e exibir.
- Mantenha o sistema simples, mas funcional, com feedback para o usuário sobre as ações realizadas.
     */

    private char[][] assentos;


    public SistemaReservaAssentos(int linhas, int colunas){
        assentos = new char[linhas][colunas];
        //Inicializa todos os assentos como disponíveis ('D)
        for (int i = 0; i < linhas; i++){
            for(int j = 0; j <colunas; j++) {
                assentos[i][j] = 'D';
            }
        }
    }

    public boolean reservarAssento(int linha, int coluna) {
        if (assentos[linha][coluna] == 'D') { // Verifica se o assento está marcado como disponível
            assentos[linha][coluna] = 'R'; // se estiver disponível essa linha muda o estado do assento para reservado ('R)
            return true; // indica que a reserva foi feita com sucesso
        }
        return false;
    }

    public boolean verificarDisponibilidade(int linha, int coluna){
        return assentos[linha][coluna] == 'D';
    }

    public boolean cancelarReserva(int linha, int coluna){
        if(assentos[linha][coluna] == 'R'){
            assentos[linha][coluna] = 'D';
            return true;
        }
        return false;
    }


    public void exibirAssentos(){
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] + " ");
            }
            System.out.println(); // após terminar de imprimir todos os elementos de uma linha, insere uma quebra de linha para começar a próxima linha
        // o código efetivamente exibe a matriz de assentos, linha por linha, no console
        }
    }

    public static void main (String[] args) {
        SistemaReservaAssentos sistema = new SistemaReservaAssentos(5, 5); // Teatro com 5x5 assentos
        sistema.exibirAssentos();
        System.out.println("");
        int linha = 2;
        int coluna = 3;
        boolean IsAssentoReservadoComSucesso = sistema.reservarAssento(linha, coluna);
        if (IsAssentoReservadoComSucesso) {
            System.out.println("Assento reservado com sucesso! \n");
        } else {
            System.out.println("Assento indisponível. Verifique a disponibilidade de outro assento. \n");
            sistema.exibirAssentos();
        }
        // Tentativa de reservar o assento já reservado
        boolean IsAssentoJaReservado = sistema.verificarDisponibilidade(linha, coluna);
        System.out.println("Vamos verificar a disponibilidade do assento solicitado. \n");
        if (!IsAssentoJaReservado){
             System.out.println("Assento indisponível. Vamos cancelar a reserva. \n"
                    + "Verifique a disponibilidade de outro assento. \n");
            sistema.cancelarReserva(linha, coluna);
            sistema.exibirAssentos();
        }

    }
}
