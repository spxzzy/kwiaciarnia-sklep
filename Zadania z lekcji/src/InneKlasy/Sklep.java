package InneKlasy;

public class Sklep {
    protected String adres;
    protected double powierzchniaLokalu;
    protected boolean czyJestWc;
    protected double czynszNajmu;

    public Sklep(String adres, double powierzchniaLokalu, boolean czyJestWc, double czynszNajmu) {
        this.adres = adres;
        this.powierzchniaLokalu = powierzchniaLokalu;
        this.czyJestWc = czyJestWc;
        this.czynszNajmu = czynszNajmu;
    }
    public int iloscPolkek() {
        return (int) (powierzchniaLokalu / 2);
    }
    public final double obliczCzynsz(int liczbaMiesiecy) {
        return czynszNajmu * liczbaMiesiecy;
}
    @Override
    public String toString() {
        return "Sklep{" +
                "adres='" + adres + '\'' +
                ", powierzchniaLokalu=" + powierzchniaLokalu +
                ", czyJestWc=" + czyJestWc +
                ", czynszNajmu=" + czynszNajmu +
                '}';
    }
}


