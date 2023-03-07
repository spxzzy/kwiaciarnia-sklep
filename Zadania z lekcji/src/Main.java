import InneKlasy.Sklep;
import InneKlasy.Kwiaciarnia;
public class Main {
    public static void main(String[] args) {
            Sklep sklep = new Sklep("ul. Szkolna 5", 60, true, 2000);
            System.out.println(sklep.toString());
            System.out.println("Liczba półek: " + sklep.iloscPolkek());
            System.out.println("Czynsz za 12 miesięcy: " + sklep.obliczCzynsz(12));

            Kwiaciarnia kwiaciarnia = new Kwiaciarnia("ul. R.Traugutta 2", 80, false, 2500, 20);
            System.out.println(kwiaciarnia.toString());
            System.out.println("Liczba półek: " + kwiaciarnia.LiczbaPolek());
            System.out.println("Czynsz za 6 miesięcy: " + kwiaciarnia.obliczCzynsz(6));
        }
    }