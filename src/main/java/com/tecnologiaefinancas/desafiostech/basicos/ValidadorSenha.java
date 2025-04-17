package com.tecnologiaefinancas.desafiostech.basicos;

import java.util.Scanner;

public class ValidadorSenha {


/* Desafio: Validador de Senhas
    Crie uma classe `ValidadorSenha` que verifique se uma senha atende a critérios de segurança.

            ### Requisitos:
            1. A senha deve ter pelo menos:
            - 8 caracteres
            - Uma letra maiúscula
            - Uma letra minúscula
            - Um número
            - Um caractere especial (`!@#$%^&*()` etc.)

            2. Métodos da classe:
            - boolean validarSenha(String senha): retorna `true` se a senha for válida, senão `false`.
            - String obterRegras(): retorna as regras da senha como uma string.
            - Dica: você pode utilizar a expressão "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$"

 */

    public boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$");
    }

    public static String obterRegras(){
        return "A senha deve conter: \n"
                + "- Pelo menos 8 caracteres \n"
                + "- Uma letra maiúscula \n"
                + "- Uma letra minúscula \n"
                + "- Um número \n"
                + "- Um caractere especial (!@#$%^&*())";
    }

    public static void main (String[] args) {
        ValidadorSenha validadorSenha = new ValidadorSenha();

        System.out.println("Insira uma nova senha: \n " + obterRegras());

        Scanner scanner = new Scanner(System.in);
        String senhaInserida = scanner.nextLine();
        boolean validarSenha = validadorSenha.validarSenha(senhaInserida);

        System.out.println("Senha válida? ");

        if(validarSenha) {
            System.out.print("Senha válida. Bem vindo.");
        } else {
            System.out.print("Senha não é valida. " + obterRegras());
        }

    }
}
