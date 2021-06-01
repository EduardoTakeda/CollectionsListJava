package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MeuExercicio02 {
    public static void main(String[] args) {
        //Criar lista de perguntas
        ArrayList perguntas = new ArrayList<>();
        perguntas.add("1. Telefonou para a vítima? ");
        perguntas.add("2. Esteve no local do crime? ");
        perguntas.add("3. Mora perto da vítima? ");
        perguntas.add("4. Devia para a vítima? ");
        perguntas.add("5. Já trabalhou com a vítima? ");

        //Criar lista de respostas
        Integer simOuNao = 0;
        ArrayList respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (simOuNao < perguntas.size()) {
            System.out.print(perguntas.get(simOuNao));
            String resposta = scan.next();
            respostas.add(resposta.toLowerCase());
            simOuNao++;
        }
        System.out.println("Respostas: " + respostas);

        //Criar conclusão das respostas
        String valor = " ";
        String sim = "sim";
        Integer conclusao = 0;
        Integer contador = 0;
        while (conclusao < respostas.size()) {
            valor = (String) respostas.get(conclusao);
            if (valor.contains(sim)) {
                contador++;
            }
            conclusao++;
        }
        if (contador <= 1) {
            System.out.println("Inocente");
        }
        if (contador == 2) {
            System.out.println("Suspeito");
        }
        if (contador > 2 && contador < 4) {
            System.out.println("Cúmplice");
        }
        if (contador == 5) {
            System.out.println("Assassina");
        }
    }
}
