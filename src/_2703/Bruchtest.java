package _2703;

public class Bruchtest {
    public static void main(String[] args) {
        Bruch bruch1 = new Bruch();
        bruch1.ausgeben();
        bruch1.setZaehler(10);
        bruch1.setNenner(10);
        bruch1.ausgeben();

        Bruch bruch2 = new Bruch();
        bruch2.setZaehler(5);
        bruch2.setNenner(10);
        bruch2.ausgeben();
//
//        Bruch bruch3 = new Bruch(1, 0);
//        bruch3.ausgeben();
//
//        bruch2.erweitern(2);
//        bruch2.ausgeben();

        bruch2.erweitern(4);
        bruch2.ausgeben();

        bruch2.kuerzen();
        bruch2.ausgeben();

        System.out.println(Bruch.getAnzahlBrueche());
        System.out.println(bruch2);
    }
}
