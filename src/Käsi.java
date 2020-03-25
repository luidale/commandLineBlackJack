import java.util.ArrayList;

public class Käsi {
    private ArrayList<Kaart> kaardid;

    public Käsi() {
        kaardid = new ArrayList<>();
    }

    public ArrayList<Kaart> getKaardid() {
        return kaardid;
    }

    public ArrayList<Kaart> lisaKaart(Pakk pakk){
        Kaart uuskaart = pakk.jagaKaart();
        kaardid.add(uuskaart);
        return kaardid;
    }

    public int summa(){
        int summa = 0;
        for (int i = 0; i < kaardid.size(); i++){
            Kaart kaart = kaardid.get(i);
            String number = kaart.getSuurus();
            if(number == "S" || number == "E" || number == "K"){
                int arv = 10;
                summa = summa + arv;
            }
            else if (number == "Ä"){
                if(summa >= 11){
                    int arv = 1;
                    summa = summa + arv;
                }
                else{
                    int arv = 11;
                    summa = summa + arv;
                }
            }
            else{
                int arv = Integer.parseInt(number);
                summa = summa + arv;
            }
        }
        return summa;
    }

    @Override
    public String toString() {
        return "kaardipaar=" + kaardid + '}';
    }
}
