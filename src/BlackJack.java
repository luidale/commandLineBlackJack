import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BlackJack {
    public static void main(String[] args) throws InterruptedException {
        ////////////////////
        // ETTEVALMISTUS

        // Loo kaardipakk
        Pakk kaardipakk = new Pakk();
        // Sega kaardi pakk
        kaardipakk.sega();

        // Loo käed
        Käsi diiler = new Käsi();
        Käsi mängija = new Käsi();

        ///////////////////////
        // MÄNG


        // Algus
        System.out.println("BLACKJACK\n");
        reeglid();

        // Küsi üle alustamine
        Scanner scan = new Scanner(System.in);
        char vastus = 'n';
        do {
            System.out.println("Alusta mängu? (y/n)");
            vastus = scan.next().charAt(0);
            System.out.println(vastus);
        }
        while (vastus != 'y' && vastus != 'n');

        if (vastus == 'n') {
            System.out.println("Kasutaja ei soovinud mängu alustada ja mäng lõpetati.");
            return;
        }

        // Kaartide jagamine
        kaartideJagamine(diiler, mängija, kaardipakk);

        // Kasutaja voor
        mängijaVoor(mängija, diiler,  kaardipakk);

        if (mängija.summa() > 21){
            System.out.println("Mängija kaotas, kuna punkte oli " + mängija.summa());
            return;
        }

        // Diileri voor
        diileriVoor(mängija, diiler,  kaardipakk);

        // Lõpptulemus
        System.out.println("");
        if (diiler.summa() > 21) {
            System.out.println("Mängija võitis! Diiler läks lõhki " + diiler.summa() + " punktiga!");
        }
        if(diiler.summa() > mängija.summa()){
            System.out.println("Diiler võitis! \n\tDiiler: " + diiler.summa() + "\n\tMängija: " + mängija.summa());
        } else if (diiler.summa() < mängija.summa()){
            System.out.println("Mängija võitis! \n\tDiiler:" + diiler.summa() + "\n\tMängija: " + mängija.summa());
        } else {
            System.out.println("Viik!  \n\tDiiler:" + diiler.summa() + "\n\tMängija: " + mängija.summa());
        }

    }

    public static void kuvaLaud(Käsi diiler, Käsi mängija, String pealkiri) {
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
        System.out.println(pealkiri);
        System.out.println("Diiler: " + diiler);
        System.out.println("Mängija: " + mängija);
    }

    public static void reeglid() {
        String reeglid = "EESMÄRK: Saada diileriga võrdne või rohkem arv punkte.\n" +
                "Kaartide väärtused:\n" +
                "\tÄ - 1 või 11\n" +
                "\tPildid - 10\n" +
                "\tNumbeid - number\n" +
                " DUUBELDADA, SPLITTIDA JA PANUSEID TEHA EI SAA";
        System.out.println(reeglid);
    }

    public static void kaartideJagamine(Käsi diiler, Käsi mängija, Pakk pakk) throws InterruptedException {
        // 1 kaart
        mängija.lisaKaart(pakk,true);
        kuvaLaud(diiler, mängija, "Kaartide jagamine");
        TimeUnit.SECONDS.sleep(1);
        // 2 kaarti
        mängija.lisaKaart(pakk,true);
        kuvaLaud(diiler, mängija, "Kaartide jagamine");
        TimeUnit.SECONDS.sleep(1);
        // 3 kaarti
        diiler.lisaKaart(pakk,false);
        kuvaLaud(diiler, mängija, "Kaartide jagamine");
        TimeUnit.SECONDS.sleep(1);
        // 4 kaarti
        diiler.lisaKaart(pakk,true);
    }

    public static void mängijaVoor(Käsi mängija, Käsi diiler,  Pakk pakk) {
        char vastus;
        Scanner scan = new Scanner(System.in);
        do {
            // Saa vastus
            vastus = 's';
            do {
                kuvaLaud(diiler, mängija,  "Mängija voor:");
                System.out.println("Kas võtad kaardi juurde? (y/n)");
                vastus = scan.next().charAt(0);
                System.out.println(vastus);
            }
            while (vastus != 'y' && vastus != 'n');

            // Lisa kaart
            if (vastus == 'y'){
                mängija.lisaKaart(pakk,true);
            }
            // Kontrolli summat
            if (mängija.summa() >= 21){
                kuvaLaud(diiler, mängija,  "Mängija voor:");
                return;
            }
        }
        while (vastus == 'y');

        return;

    }

    public static void diileriVoor(Käsi mängija, Käsi diiler,  Pakk pakk) throws InterruptedException {

        // Pööra diileri esimene kaart ümber
        diiler.getKaardid().get(0).avaKaart();

        kuvaLaud(diiler, mängija,  "Diileri voor:");
        TimeUnit.SECONDS.sleep(2);
        while (diiler.summa() < 17){
            diiler.lisaKaart(pakk,true);
            kuvaLaud(diiler, mängija,  "Diileri voor:");
            TimeUnit.SECONDS.sleep(2);
        }

        kuvaLaud(diiler, mängija,  "Diileri voor:");
        return;

    }
}
