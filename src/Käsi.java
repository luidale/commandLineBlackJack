import javax.swing.*;
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

    public void lisaKaart(Pakk pakk, boolean avatud) {
        Kaart uuskaart = pakk.jagaKaart();
        if(avatud)
            uuskaart.avaKaart();
        uuskaart.lahtiselt();
        kaardid.add(uuskaart);
    }

    public int summa() {
        int summa = 0;
        for (Kaart kaart : kaardid) {
            int[] vaartused = kaart.getVäärtused();
            if(!kaart.getSuurus().equals("Ä"))
                for (int i = 0; i < vaartused.length ; i++) {
                    summa += vaartused[i];
                }
            if(kaart.getSuurus().equals("Ä"))
                if(kaardid.indexOf("Ä") == kaardid.size()-1){
                    if(summa < 11)
                        summa += 11;
                }
            else
                summa += 1;
        }
        return summa;
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