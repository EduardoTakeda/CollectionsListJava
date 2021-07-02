package ExercicioMapEstadosPopulacao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ExercicioEstadosPopulacao {
    public static void main (String[]args) {
        System.out.println("\n"+"Estados e suas populações ");
        HashMap<String, Integer> dicionarioEstadosPopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\n"+"Substitua a população do estado do RN por 3.534.165");
        dicionarioEstadosPopulacao.put("RN", 3534165);
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\n"+"Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        dicionarioEstadosPopulacao.put("PB", 4039277);
        System.out.println(dicionarioEstadosPopulacao);

        System.out.println("\n"+"Exiba a população PE");
        System.out.println(dicionarioEstadosPopulacao.get("PE"));

        System.out.println("\n"+"Exiba todos os estados e suas populações na ordem que foi informado");
        LinkedHashMap<String, Integer> dicionarioEstadosPopulacaoOrdemInsercao = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};
        System.out.println(dicionarioEstadosPopulacaoOrdemInsercao);

        System.out.println("\n"+ "Exiba os estados e suas populações em ordem alfabética ");
        TreeMap<String,Integer> EstadosOrdemAlfabetica = new TreeMap<>(dicionarioEstadosPopulacao);
        System.out.println(EstadosOrdemAlfabetica);

        System.out.println("\n"+"Exiba o estado com o menor população e sua quantidade");

    }

}
