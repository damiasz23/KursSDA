package drugiTydzie.czwartek;

/**
 * Created by RENT on 2017-07-13.
 */
public class Pracownik {

//    utworzenie pola klasy
    public String imie; //pole
    public String nazwisko; //pole
    public int wiek;  //pole
    public float pensja;

    public Pracownik(){
        pensja = 2000;
            }

//    metody klasy Pracownik
    public void Opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika(){
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko + " \npensja " + pensja );
    }
}
