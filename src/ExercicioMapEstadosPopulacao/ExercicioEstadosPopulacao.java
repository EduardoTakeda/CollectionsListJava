package ExercicioMapEstadosPopulacao;

import java.util.*;

public class ExercicioEstadosPopulacao {
    public static void main (String[]args) {
        System.out.println("\nEstados e suas populações ");
        HashMap<String, Integer> dicionarioEstadosPopulacao = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165");
        dicionarioEstadosPopulacao.put("RN", 3534165);
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        dicionarioEstadosPopulacao.put("PB", 4039277);
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\nExiba a população PE");
        System.out.println(dicionarioEstadosPopulacao.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado");
        LinkedHashMap<String, Integer> dicionarioEstadosPopulacaoOrdemInsercao = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};
        System.out.println(dicionarioEstadosPopulacaoOrdemInsercao);

        System.out.println("\nExiba os estados e suas populações em ordem alfabética ");
        TreeMap<String, Integer> EstadosOrdemAlfabetica = new TreeMap<>(dicionarioEstadosPopulacao);
        System.out.println(EstadosOrdemAlfabetica);

        System.out.println("\nExiba o estado com o menor população e sua quantidade");
        Collection<Integer> populacao = dicionarioEstadosPopulacao.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : dicionarioEstadosPopulacao.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.println(estadoMenorPopulacao + "---" + Collections.min(populacao));

        System.out.println("\nExiba o estado com a maior população e sua quantidade");
        System.out.println(estadoMaiorPopulacao + "---" + Collections.max(populacao));

        System.out.println("\nExiba a soma da população desses estados");
        int somaPopulacao = 0;
        Iterator<Integer> iterator = dicionarioEstadosPopulacao.values().iterator();
        while (iterator.hasNext()) {
            somaPopulacao += iterator.next();
        }
        System.out.println(somaPopulacao);

        System.out.println("\nExiba a média da população deste dicionário de estados " + "\nMedia da população nos estados " + somaPopulacao / dicionarioEstadosPopulacao.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = dicionarioEstadosPopulacao.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\nApague o dicionário de estados");
        dicionarioEstadosPopulacao.clear();
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\nConfira se o dicionário está vazio");
        System.out.println(dicionarioEstadosPopulacao.isEmpty());

    }

}
