package ExercicioLinguagemFavorita;


import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
            int anoDeCriacao = Integer.compare(o1.anoCriacao, o2.anoCriacao);
            if (nome != 0) return nome;
            if (anoDeCriacao != 0) return anoDeCriacao;
            return o1.ide.compareToIgnoreCase(o2.ide);
    }


static class CompareIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

}
