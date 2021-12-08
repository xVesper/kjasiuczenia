package pl.imiajd.banul;
import java.lang.Cloneable;
import java.lang.Comparable;
import java.time.LocalDate;
import java.lang.Object;


public class Osoba implements Cloneable, Comparable {

    private String nazwisko;
    private LocalDate dataUrodzenia;

    Osoba(String nazwisko, int dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public String toString() {
        return getClass().getName() + " [ " + nazwisko + ", " + dataUrodzenia + " ] ";
    }
    public boolean equals(Object nazwisko, Object dataUrodzenia){
        if(this == nazwisko && this == dataUrodzenia) {
            return true;
        }
        return false;
    }

}
