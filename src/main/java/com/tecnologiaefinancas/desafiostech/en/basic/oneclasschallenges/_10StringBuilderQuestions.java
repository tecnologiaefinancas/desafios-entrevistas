package com.tecnologiaefinancas.desafiostech.en.basic.oneclasschallenges;

public class _10StringBuilderQuestions {
    /*
    Use StringBuilder to:
    1 - Reverse a String
    2 - Remove vowels from a String
    3 - Replace spaces with hyphens
    4 - Check if a String is a palindrome
    5 - Concatenate multiple Strings efficiently
    6 - Count the occurrences of a specific character
    7 - Remove duplicate characters from a String
    8 - Convert all characters to uppercase
    9 - Insert a character at a specific position
    10 - Remove the first N characters from a String

     */

    //1 - Reverse a String
    private static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //2 - Remove vowels from a String
    private static String removeVowels(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = sb.length() - 1; i >= 0; i --){
            if("aeiouAEIOU".indexOf(sb.charAt(i)) != -1){
                sb.deleteCharAt(i);
            }
        } return sb.toString();
    }

    //3 - Replace spaces with hyphens

    private static String replaceSpacesToHyphen(String str){
        return new StringBuilder(str).toString().replace(" ", "-");
    }
    /*
    When you remove characters from a StringBuilder, the indexes shift and can
    affect the logic of the loop. Iterating from back to front avoids this issue,
    as you are always eliminating the last characters before the first ones,
    without shifting the remaining ones.
     */

    //4 - Check if a String is a palindrome
    private static boolean isPalindrome(String str){
        return str.equals((new StringBuilder(str).reverse().toString()));
    }

    //5 - Concatenate multiple Strings efficiently
    private static String concatenateStrings(String ... strings){
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    //6 - Count the occurrences of a specific character
    private static int countCharacterOccurrences(String str, char c){
        int count = 0;
        StringBuilder sb = new StringBuilder(str);
        for(int i =0; i < sb.length(); i++){
            if(sb.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    //7 - Remove duplicate characters from a String
    public String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()){
            if (sb.indexOf(String.valueOf(c)) == -1){ //check if the character is already in sb, if the ch is NOT already in sb, then add it
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //8 - Convert all characters to uppercase
    private static String charactersToUppercase(String str){
        return new StringBuilder().toString().toUpperCase();
    }
    //9 - Insert a character at a specific position
    private static String insertCharacter(String str, int index, char c){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, c);
        return sb.toString();
    }
    //10 - Remove the first N characters from a String
    private static String removeFirstNCharacters(String str, int n){
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, Math.min(n, sb.length()));
        return sb.toString();
    }

}
