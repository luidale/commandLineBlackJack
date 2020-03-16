public class Test {
    public static void main(String[] args){

        // Loo kaardipakk
        Pakk kaardipakk = new Pakk();
        System.out.println(kaardipakk);
        // Sega kaardi pakk
        kaardipakk.sega();
        System.out.println(kaardipakk);

        // Simuleeri kaardi jagamist
        System.out.println(kaardipakk.jagaKaart());
        System.out.println(kaardipakk);
    }
}
