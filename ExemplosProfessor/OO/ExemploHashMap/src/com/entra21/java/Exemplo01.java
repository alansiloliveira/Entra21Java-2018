package com.entra21.java;

import java.util.HashMap;

public class Exemplo01 {

    public static void main(String[] args) {
        HashMap<String, Integer> idades
                = new HashMap<>();
        idades.put("Cleiton", 22);
        idades.put("Kleyton", 24);

        if (idades.containsKey("Kreytom")) {
            System.out.println("TEM KREYTOM");
        } else {
            System.out.println("NÃO TEM KREYTOM");
        }

        // Pega o valor de acordo com a chave
        int idade = idades.get("Kleyton");
        System.out.println("Idade do Kleyton: " + idade);

        // Altera o valor daquela chave
        // parralelepidedo
        idades.put("Kleyton", 27);


        // remove o valor de acordo com a key
        idades.remove("Kleyton");




    }


}
