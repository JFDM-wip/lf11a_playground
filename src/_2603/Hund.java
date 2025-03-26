package _2603;

// Zugriffsmodifikator in Java
// public, private, protected
    /*
        public
            Öffentlich sichtbar; Mitglieder der Klasse (d.h.: Eigenschaften, Methoden),
            Kind-Klassen und andere Klassen können auf die jeweiligen Mitglieder, die public sind, zugreifen.
            UML-Symbol: +

        protected
            Geschützte Sichtbarkeit: Klienten (= Mitglieder anderer Klassen) können protected Mitglieder nicht nutzen,
            Mitglieder von Unter- und Basisklassen können sie benutzen.
            UML-Symbol: #

        private
            Privat sichtbar: Mitglieder können innerhalb von Klassen auf private Mitglieder zugreifen.
            Unterklassen können nicht auf die privaten Mitglieder zugreifen.
            UML-Symbol: -

    */
public class Hund {
    static int hundeZaehler = 0;
    private String color;
    private String eyeColor;
    private double height;
    private double length;
    private double weight;

    // Konstruktoren
    public Hund(String color) {
        this(color, "schwarz", 36.0);
    }

    public Hund(String color, String eyeColor, double height) {
        this(color, eyeColor, height, 10.0);
    }

    public Hund(String color, String eyeColor, double height, double length) {
        this(color, eyeColor, height, length, 30.0);
    }

    public Hund(String color, String eyeColor, double height, double length, double weight) {
        this.color = color;
        this.eyeColor = eyeColor;
        this.height = height;
        this.length = length;
        this.weight = weight;
        hundeZaehler++;
    }

    // Methoden
    // Getter und Setter
    public static int getHundeZaehler() {
        return hundeZaehler;
    }

    public static void setHundeZaehler(int hundeZaehler) {
        Hund.hundeZaehler = hundeZaehler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // weitere Methoden
    public void sit() {
        System.out.println("Der Hund sitzt");
    }
    public void layDown() {}
    public void shake() {}
    public void come() {}
}
