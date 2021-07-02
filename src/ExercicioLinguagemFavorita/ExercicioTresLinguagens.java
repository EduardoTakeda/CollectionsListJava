package ExercicioLinguagemFavorita;

import java.util.*;

public class ExercicioTresLinguagens {
    public static void main(String[]args){

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("python", 1991, "IDLE"));
            add(new LinguagemFavorita("java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("kotlin", 2010, "Android Studio"));

        }};
        System.out.println("Ordem de Inserção"); //Definir LinkedHashSet para ordem de inserção
        for (LinguagemFavorita linguagem : linguagens){
            System.out.println(linguagem);
        }
        System.out.println("Ordem Natural (nome)");
         Set<LinguagemFavorita> ordemNome = new TreeSet<>(linguagens);//para TreeSet funcionar, deve-se implementar Comparable no objeto e criar seu método dentro da classe objeto
//         ordemNome.addAll(linguagens0);
//        for (LinguagemFavorita linguage : linguagens) {
//            ordemNome.add(linguage);}
//        for (LinguagemFavorita ling: ordemNome){
//            System.out.println(ling);
//        }
           System.out.println(ordemNome);

           System.out.println("Ordem por IDE ");//criar o implemento e metodo CompareIde na classe Comparator
           Set<LinguagemFavorita> ordemIde = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde.CompareIde());
           ordemIde.addAll(linguagens);
           System.out.println(ordemIde);

           System.out.println("Ano de criação e nome ");//criar implemento e metodo CompareAnoDeCriacaoENome na classe Comparator
           Set<LinguagemFavorita> ordemAnoDeCriacaoENome = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde.CompareAnoDeCriacaoENome());
           ordemAnoDeCriacaoENome.addAll(linguagens);
           System.out.println(ordemAnoDeCriacaoENome);
    }
}

