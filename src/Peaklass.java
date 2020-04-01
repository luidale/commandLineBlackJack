import java.util.Scanner;
import java.util.List;

public class Peaklass {
    private double rahakott;


    public Peaklass(double rahakott) {
        this.rahakott = rahakott;
    }

    public double getRahakott() {
        return rahakott;
    }

    public static void main(String args[]) throws InterruptedException {
        System.out.println("BlackJack\n");
        double panus = 0.0;
        reeglid();
        Scanner scan = new Scanner(System.in);
        char vastus = 'n';
        do {
            do {
                System.out.println("Alusta mängu? (y/n)");
                vastus = scan.next().charAt(0);
            }
            while (vastus != 'y' && vastus != 'n');
            if (vastus == 'n') {
                System.out.println("Kasutaja ei soovinud mängu alustada ja mäng lõpetati.");
                return;
            }
            Mäng mang = new Mäng();
            mang.jooksuta();
            }
            while (vastus != 'n') ;
        }


        public static void reeglid () {
            String reeglid = "EESMÄRK: Saada diileriga võrdne või rohkem arv punkte.\n" +
                    "Kaartide väärtused:\n" +
                    "\tÄ - 1 või 11\n" +
                    "\tPildid - 10\n" +
                    "\tNumbeid - number\n";
            System.out.println(reeglid);
        }

    }


