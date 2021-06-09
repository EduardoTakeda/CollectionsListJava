package ExercicioArcoIris;


import java.util.Objects;

public class ArcoIris {
    private String coresArcoIris;

    //construtor
    public ArcoIris(String coresArcoIris) {
        this.coresArcoIris = coresArcoIris;
    }

    //getters
    public String getCoresArcoIris() {return coresArcoIris;}

    //sobrescrever to.String
    @Override
    public String toString() {return coresArcoIris;}

    //
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ArcoIris ArcoIris = (ArcoIris) o;
//        return coresArcoIris.equals(ArcoIris.coresArcoIris) ;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(coresArcoIris);
//    }
}
