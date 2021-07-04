package DesafioLancamentoDado100Vezes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lancando100Valores {
    public static void main(String[] args) {

        Map<Integer, Integer> lancamentos = new HashMap<>();
        Random random = new Random();
        int lancando = 1;
        while (lancando < 7) {
            int numero = random.nextInt(6) + 1;
            lancamentos.put(lancando, numero);
            lancando++;
        }



            System.out.println(lancamentos);
        }

    }

