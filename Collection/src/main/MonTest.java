package main;

import java.util.Objects;

public class MonTest {
    private  final  int valeur;
    public MonTest (final  int valeur){
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonTest monTest = (MonTest) o;
        return valeur == monTest.valeur;
    }

    @Override
    public int hashCode() {
        return valeur / 100;
    }
}
