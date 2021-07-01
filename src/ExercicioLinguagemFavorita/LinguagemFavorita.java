package ExercicioLinguagemFavorita;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoCriacao;
    public String ide;

    //construtor
    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    //fazer OS GETTRES
    public String getNome() { return nome; }
    public Integer getAnoCriacao() {return anoCriacao;}
    public String getIde() {return ide;}

    //sobrescrever toString
    @Override
    public String toString() {
        return nome + "---" + anoCriacao + "---" + ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita ling = (LinguagemFavorita) o;
        return nome.equals(ling.nome) && ide.equals(ling.ide) && anoCriacao.equals(ling.anoCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, anoCriacao);
    }


    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {

        return this.nome.compareTo(linguagemFavorita.nome);
    }
}
