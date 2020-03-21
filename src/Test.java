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

        //Kaardi lisamine
        Käsi kasi = new Käsi();
        System.out.println("Lisatud kaart on " + kasi.lisaKaart(kaardipakk).lahtiselt());




    }
}
