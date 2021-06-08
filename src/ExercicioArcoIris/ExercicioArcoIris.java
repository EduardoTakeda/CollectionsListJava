package ExercicioArcoIris;

import java.util.HashSet;
import java.util.Set;

public class ExercicioArcoIris {

    public static void main(String[] args) {
        Set<ArcoIris> coresArcoIris= new HashSet<>(){{
            add(new ArcoIris("vermelho"));
            add(new ArcoIris("laranja"));
            add(new ArcoIris("amarelo"));
            add(new ArcoIris("verde"));
            add(new ArcoIris("azul"));
            add(new ArcoIris("anil"));
            add(new ArcoIris("violeta"));
        }};
        for (ArcoIris cor: coresArcoIris) System.out.println(cor);
    }
}
