package DesafioLancamentoDado100Vezes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lancando100Valores {
    public static void main(String[] args) {

        Map<Integer, Integer> lancamentos = new HashMap<>();
        Map<Integer, Integer> lancamentosContador = new HashMap<>(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};
        Random random = new Random();
        int lancando = 0;

        while (lancando <= 99) {
            int numero = random.nextInt(6)+1;
            lancamentos.put(lancando,numero);
            lancando++;
        }

        for (int i=0; i<lancamentos.size();i++){
            Integer ind =0;
            ind = lancamentos.get(i);
            Integer ob = lancamentosContador.get(ind);
            ob=ob+1;

            lancamentosContador.put(ind, ob);
//errado!            lancamentosContador.put(lancamentos.get(i),(valor0)+1);
        }
//        System.out.println(lancamentosContador);
        lancamentosContador.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        });
        }
// LEMBRAR MUDAR O USER.NAME !!!!!!!!!!!!!!!!!!!!!!
    }

