import java.util.ArrayList;
import java.util.List;

public class Käsi {
    private ArrayList<Kaart> kaardid;

    public Käsi() {
        kaardid = new ArrayList<>();
    }

    public ArrayList<Kaart> getKaardid() {
        return kaardid;
    }

    public ArrayList<Kaart> lisaKaart(Pakk pakk) {
        Kaart uuskaart = pakk.jagaKaart();
        kaardid.add(uuskaart);
        return kaardid;
    }

    public int summa() {
        int summa = 0;
        for (Kaart kaart : kaardid) {
            int[] vaartused = kaart.getVäärtused();
            for (int i = 0; i < vaartused.length; i++) {
                if (vaartused[i] != 1 && vaartused[i] != 11){
                    summa += vaartused[i];
                }
            }
        }
        return summa;
    }

    public String lisaKaartAvatud(Pakk pakk){
        String avatud = pakk.jagaKaart().lahtiselt();
        return avatud;
    }



    @Override
    public String toString() {
        List<String> result = new ArrayList<>();
        for (Kaart kaart : kaardid){
            result.add(String.valueOf(kaart));
        }
        return String.join(" ", result);
    }
}