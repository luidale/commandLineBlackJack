import java.util.Scanner;
import java.util.List;

public class Peaklass {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("BlackJack\n");

        Mängur mangur = new Mängur();

        reeglid();
        Scanner scan = new Scanner(System.in);
        char vastus = 'n';
        do {
            do {
                System.out.println("Raha: " + mangur.getRahakott());
                System.out.println("Alusta mängu? (y/n)");
                vastus = scan.next().charAt(0);
            }
            while (vastus != 'y' && vastus != 'n');
            if (vastus == 'n') {
                System.out.println("Kasutaja ei soovinud mängu alustada ja mäng lõpetati.");
                return;
            }

            Mäng mang = new Mäng();
            mang.jooksuta(mangur);

        }
        while (mangur.getRahakott()> 0) ;

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


