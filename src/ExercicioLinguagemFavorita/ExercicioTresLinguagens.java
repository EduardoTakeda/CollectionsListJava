package ExercicioLinguagemFavorita;

import java.util.HashSet;
import java.util.Set;

public class ExercicioTresLinguagens {
    public static void main(String[]args){
        Set<LinguagemFavorita> Linguagens = new HashSet<>(){{
            add(new LinguagemFavorita("java", 1995, "IntelliJ"));
        }};

    }
}
