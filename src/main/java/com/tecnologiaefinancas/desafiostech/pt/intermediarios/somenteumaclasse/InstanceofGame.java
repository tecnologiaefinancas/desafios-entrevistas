package com.tecnologiaefinancas.desafiostech.pt.intermediarios.somenteumaclasse;

public class InstanceofGame {

    /*
    Desafio: Crie uma classe InstanceofGame que simule um jogo de verificação
    de tipos. Teremos três classes: Warrior, Mage e Rogue.
    Um métod0 describeCharacter(Object character) deve identificar o tipo do personagem
    e exibir uma mensagem diferente para cada um.
     */


    static void describeCharacter(Object character){
        if (character instanceof Warrior){
            System.out.println("Este é um Guerreiro!");
            ((Warrior) character).fight();
        } else if (character instanceof Mage){
            System.out.println("Este é um Mago!");
            ((Mage) character).castSpell();
        } else if (character instanceof Rogue){
            System.out.println("Esté é um Ladino!");
            ((Rogue) character).sneak();
        } else {
            System.out.println("Personagem desconhecido!");
        }
    }

    public static void main (String[] args){
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Rogue rogue = new Rogue();
        String randomObject = "Isso não é um personagem válido!";

        describeCharacter(warrior);
        describeCharacter(mage);
        describeCharacter(rogue);
        describeCharacter(randomObject); // Teste com um tipo diferente;
    }
}

class Warrior {
    void fight() {
        System.out.println("O guerreiro está lutando ferozmente");
    }
}

class Mage {
    void castSpell(){
        System.out.println("O mago lança um feitiço poderoso!");
    }
}

class Rogue {
    void sneak(){
        System.out.println("O ladino se mode nas sombras!");
    }
}
