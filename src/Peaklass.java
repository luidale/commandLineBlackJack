import java.util.Scanner;
import java.util.List;

public class Peaklass {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("BlackJack\n");
        double panus = 0.0;
        double rahakott = 20;
        reeglid();
        Scanner scan = new Scanner(System.in);
        char vastus = 'n';
        do {
            do {
                System.out.println("Raha: " + rahakott);
                System.out.println("Alusta mängu? (y/n)");
                vastus = scan.next().charAt(0);
            }
            while (vastus != 'y' && vastus != 'n');
            if (vastus == 'n') {
                System.out.println("Kasutaja ei soovinud mängu alustada ja mäng lõpetati.");
                return;
            }
            do {
                //System.out.println("Raha: " + rahakott);
                if (panus > rahakott){
                    System.out.println("Eelnev panus oli suurem kui sul on raha. Vali uus panus!");
                } else if (panus < 0.0){
                    System.out.println("Panus ei saa olla väiksem kui null. Vali uus panus!");
                } else {
                    System.out.println("Mis panuse peale soovid mängida?");
                }
                panus = scan.nextDouble();

            }
            while(panus <= 0.0 || panus > rahakott);
            rahakott -= panus;
            Mäng mang = new Mäng();
            double voiduKoefitsent = mang.jooksuta();

            // Arvuta rahakott ümber
            if (voiduKoefitsent > 1) {
                System.out.println("Võitsid: " + panus*(voiduKoefitsent-1));
                rahakott += panus * voiduKoefitsent;
            }

            // Tühista panus
            panus = 0.0;
        }
        while (rahakott > 0) ;

        System.out.println("Raha sai otsa ja mäng seega läbi!");
    }

    public static void reeglid () {
        String reeglid = "EESMÄRK: Saada diileriga võrdne või rohkem arv punkte.\n" +
                "Kaartide väärtused:\n" +
                "\tÄ - 1 või 11\n" +
                "\tPildid - 10\n" +
                "\tNumbrid - number\n";
        System.out.println(reeglid);
    }

}


