import java.util.ArrayList;

public class Käsi {
    private ArrayList<Kaart> kaardipaar;

    public Käsi() {
        kaardipaar = new ArrayList<>();
    }

    public ArrayList<Kaart> getKaardipaar() {
        return kaardipaar;
    }

    public Kaart lisaKaart(Pakk pakk){
        Kaart uuskaart = pakk.jagaKaart();
        return uuskaart;
    }

    public int summa(ArrayList<Pakk> kaardid){
        int summa = 0;
        for (int i = 0; i < kaardid.size(); i++) {
            summa = summa + kaardid.indexOf(i);
        }
        return summa;
    }

    @Override
    public String toString() {
        return "kaardipaar=" + kaardipaar + '}';
    }
}
