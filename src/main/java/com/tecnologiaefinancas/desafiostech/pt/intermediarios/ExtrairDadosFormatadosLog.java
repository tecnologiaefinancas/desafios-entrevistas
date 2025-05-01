package com.tecnologiaefinancas.desafiostech.pt.intermediarios;

public class ExtrairDadosFormatadosLog {
    /*
    - Desafio: Escreva um programa que receba uma string contendo informações formatadas,
    como um log de eventos, e extraia partes específicas do texto usando substring()

    Exemplo de Entrada
    [INFO] User: Alice | ID: 12345 | Status: Active
    [ERROR] User: Bob | ID: 67890 | Status: Inactive
    [WARNING] User: Charlie | ID: 11223 | Status: Pending

    Objetivo:
    1️. Criar um métod0 que receba uma linha do log e extraia:
    - O tipo de log (INFO, ERROR, WARNING)
    - O nome do usuário
    - O ID do usuário
    - O status
    2️. Usar substring() e indexOf() para capturar essas informações.
    3️. Exibir os resultados formatados corretamente.

     */

    public static void main (String[] args){
        String log1 = "[INFO] User: Alice | ID: 12345 | Status: Active";
        String log2 = "[ERROR] User: Bob | ID: 67890 | Status: Inactive";
        String log3 = "[WARNING] User: Charlie | ID: 11223 | Status: Pending";

        parseLog(log1);
        parseLog(log2);
        parseLog(log3);
    }

    public static void parseLog(String log) {
        // Garante que o log contem o formato esperado antes de extrair os dados
        if (log.contains("[") && log.contains("]") &&
                log.contains("User: ") && log.contains("ID: ") && log.contains("Status: ")) {

            // Extraindo o tipo de log
            String logType = log.substring(log.indexOf("[") + 1, log.indexOf("]"));

            // Extraindo o nome do usuário
            int userStart = log.indexOf("User: ") + 6;
            int userEnd = log.indexOf(" | ID:");
            String user = log.substring(userStart, userEnd);

            // Extraindo o ID
            int idStart = log.indexOf("ID: ") + 4;
            int idEnd = log.indexOf(" | Status:");
            String userId = log.substring(idStart, idEnd);

            // Extraindo o status
            int statusStart = log.indexOf("Status: ") + 8;
            String status = log.substring(statusStart);

            // Exibe o log extraido
            System.out.println("Log Type: " + logType);
            System.out.println("User: " + user);
            System.out.println("ID: " + userId);
            System.out.println("Status: " + status);
            System.out.println("-----------------------");
        } else {
            System.out.println("Erro: Log em formato inválido.");
        }
    }


}
