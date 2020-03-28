public class Test {
    public static void main(String[] args){

        // Loo kaardipakk
        Pakk kaardipakk = new Pakk();
        System.out.println("Segamata kaardipakk: " + kaardipakk);

        // Sega kaardi pakk
        kaardipakk.sega();
        System.out.println("Segatud kaardipakk: " + kaardipakk);

        // Simuleeri kaardi jagamist
        System.out.println("Jagatav kaart: " + kaardipakk.jagaKaart().lahtiselt());
        System.out.println("Kaardipakk pärast kaardi jagamist: " + kaardipakk);

        //Kaardi lisamine ja summa leidmine
        Käsi kasi = new Käsi();
        kasi.lisaKaart(kaardipakk);
        kasi.lisaKaart(kaardipakk);
        kasi.lisaKaart(kaardipakk);
        System.out.println(kasi.summa());

        // Käe kuvamine
        System.out.println(kasi);

        // Ava kõik kaardid (peaks olema ehk mingi käe meetod hoopis).
        for (Kaart kaart: kasi.getKaardid()){
            kaart.avaKaart();
        }
        System.out.println(kasi);
        // Avatud kaardi lisamine
        System.out.println(kasi.lisaKaartAvatud(kaardipakk));



    }
}
