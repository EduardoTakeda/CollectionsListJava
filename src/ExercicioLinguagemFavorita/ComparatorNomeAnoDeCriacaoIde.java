//package ExercicioLinguagemFavorita;
//
//
//import java.util.Comparator;
//
//public class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
//
//    @Override
//        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//            int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
//            int anoDeCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
//            if (nome != 0) return nome;
//            if (anoDeCriacao != 0) return anoDeCriacao;
//            return lf1.ide.compareToIgnoreCase(lf2.ide);
//        }
//    }
//class ComparatorIde implements Comparator<LinguagemFavorita>{
//
//    @Override
//    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//        return lf1.ide.compareToIgnoreCase(lf2.ide);
//    }
//}
//
//class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
//
//    @Override
//    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
//        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
//        if (anoDeCriacao != 0) return anoDeCriacao;
//        return lf1.nome.compareToIgnoreCase(lf2.nome);
//    }
//}
