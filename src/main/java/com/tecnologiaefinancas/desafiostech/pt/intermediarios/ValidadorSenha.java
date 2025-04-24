package com.tecnologiaefinancas.desafiostech.pt.intermediarios;

import java.util.regex.Pattern;

public class ValidadorSenha {
     /*  Desafio: Validador de Senha Segura
        Crie uma classe ValidadorSenha que recebe uma senha como entrada e verifica se ela atende aos seguintes critérios:
        ✔ Mínimo de 8 caracteres
        ✔ Pelo menos uma letra maiúscula
        ✔ Pelo menos um número
        ✔ Pelo menos um caractere especial (!@#$%^&*)
     */

    private final String senha;

    public ValidadorSenha(String senha) {
        this.senha = senha;
    }

    public String validar() {
        if(senha.length() < 8){
            return "Senha inválida: precisa ter pelo menos 8 caracteres.";
        } else if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return "Senha inválida: precisa ter pelo menos uma letra maíuscula.";
        } else if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            return "Senha inválida: precisa ter pelo menos um número.";
        } else if (!Pattern.compile("[!@#$%^&*]").matcher(senha).find()){
            return "Senha inválida: precisa ter pelo menos um caráctere especial.";
        } return "Senha válida.";
    }

    public static void main (String[] args) {
        ValidadorSenha validadorSenha01 = new ValidadorSenha("Senha123!");
        System.out.println(validadorSenha01.validar());

        ValidadorSenha validadorSenha02 = new ValidadorSenha("senha123");
        System.out.println(validadorSenha02.validar());
    }
}
