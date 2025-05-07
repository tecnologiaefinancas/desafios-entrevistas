package com.tecnologiaefinancas.desafiostech.pt.basicos.somenteumaclasse;

public class SubstituaPalavras {
    //Desafio Dado os seguintes textos:
    //- "O sol brilha forte no céu azul."
    //- "A lua ilumina a noite estrelada."
    //
    //Requisitos:
    //- Substituir "O sol" por "A lua" e "o céu" por "a noite" no primeiro texto.
    //- Substituir "A lua" por "O sol", "a noite" por "o céu" e "estrelada" por "estrelado" no segundo texto.
    //- Manter as palavras "brilha" e "ilumina" inalteradas nos textos originais.

    public static void main(String[] args) {
        String texto01 = "O sol brilha forte no céu azul.";
        String texto02 = "A lua ilumina a noite estrelada.";

        //
        texto01 = texto01.replace("O sol", "A lua").replace("o céu", "a noite");
        texto02 = texto02.replace("A lua", "O sol").replace("a noite", "o céu").replace("estrelada", "estrelado");

        System.out.println(texto01);
        System.out.println(texto02);
    }
}
