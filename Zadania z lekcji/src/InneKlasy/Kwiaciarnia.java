package InneKlasy;

public class Kwiaciarnia extends Sklep {
    private double powierzchniaZaplecza;

    public Kwiaciarnia(String adres, double powierzchniaLokalu, boolean czyJestWc,
                       double czynszNajmu, double powierzchniaZaplecza) {
        super(adres, powierzchniaLokalu, czyJestWc, czynszNajmu);
        this.powierzchniaZaplecza = powierzchniaZaplecza;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Powierzchnia zaplecza: " + powierzchniaZaplecza + " m^2";
    }

    public int LiczbaPolek() {
        return (int) ((powierzchniaLokalu + powierzchniaZaplecza) / 4);
    }
}

