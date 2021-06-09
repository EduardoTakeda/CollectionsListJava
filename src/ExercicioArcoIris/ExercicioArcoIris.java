package ExercicioArcoIris;

import java.util.*;


public class ExercicioArcoIris {

    public static void main(String[] args) {
        Set<ArcoIris> coresArcoIris = new HashSet<>() {{
            add(new ArcoIris("vermelho"));
            add(new ArcoIris("laranja"));
            add(new ArcoIris("amarelo"));
            add(new ArcoIris("verde"));
            add(new ArcoIris("azul"));
            add(new ArcoIris("anil"));
            add(new ArcoIris("violeta"));
        }};

        System.out.println("--(A)--Exibir todas as cores uma abaixo da outra ");
        for (ArcoIris cor : coresArcoIris) System.out.println(cor);

        System.out.println("--(B)--A quantidade de cores que o arco-íris tem é: " + coresArcoIris.size() + " !!!");

        System.out.println("--(C)--Exiba as cores em ordem alfabética ");
        Set<ArcoIris> coresOrdemAlfabet = new TreeSet<>(new ComparatorCoresArcoIris());
        coresOrdemAlfabet.addAll(coresArcoIris);
        for (ArcoIris cor : coresOrdemAlfabet) System.out.println(cor);

        System.out.println("--(D)--Exiba as cores na ordem inversa da que foi informada");
        List<ArcoIris> ordemInversa = new ArrayList<>();  //criando uma lista para aplicar o Collection.reverse
        ordemInversa.addAll(coresArcoIris);              //add vetor coresArcoIris para a lista ordemInversa
        Collections.reverse(ordemInversa);
        System.out.println(ordemInversa);

        System.out.println("--(E)--Exiba todas as cores que começam com a letra ”v”");
        for (ArcoIris cores : coresArcoIris) {
            if (cores.startsWith("v")) {
            }
        }
    }
}
