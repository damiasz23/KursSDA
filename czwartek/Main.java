package drugiTydzie.czwartek;

/**
 * Created by RENT on 2017-07-13.
 */
public class Main {

    public static void main(String[] args) {

        Pracownik prezzes = new Pracownik();
        prezzes.imie = "Damian";
        prezzes.nazwisko= "Gawlak";
        prezzes.wiek = 32;
        prezzes.pensja = 17000;




        Pracownik dyrektor = new Pracownik();
        dyrektor.imie = "Jan";
        dyrektor.nazwisko = "Kowalski";
        dyrektor.wiek = 66;
        dyrektor.pensja = 1200;

        System.out.println("Prezez imie: " + prezzes.imie + "\nPrezes nazwisko: " + prezzes.nazwisko);

        prezzes.Opis();
        System.out.println();
        prezzes.OpiszPracownika();
        System.out.println();
        dyrektor.OpiszPracownika();
    }
}
