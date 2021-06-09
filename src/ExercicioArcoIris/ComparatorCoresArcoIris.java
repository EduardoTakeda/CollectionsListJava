package ExercicioArcoIris;


import java.util.Comparator;

public class ComparatorCoresArcoIris implements Comparator<ArcoIris> {

    @Override
    public int compare(ArcoIris cor1, ArcoIris cor2) {
        int coresArcoIris = cor1.getCoresArcoIris().compareTo(cor2.getCoresArcoIris());
        if (coresArcoIris != 0) return coresArcoIris;
        return String.CASE_INSENSITIVE_ORDER.compare(cor1.getCoresArcoIris(), cor2.getCoresArcoIris());
    }
}
