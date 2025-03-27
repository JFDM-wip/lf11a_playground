package _2703;

public class Mensch {
    // Objektvariablen
    private String name;
    private int alter;
    private char geschlecht;

    // Konstruktor
    public Mensch(String name, int alter, char geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    // weitere Objekt-Methoden
    public void geburtstag() {
        alter++;
        System.out.println("Wieder ein Jahr älter.");
    }

    public void begruessung() {
        System.out.println("Hallo, mein Name ist: " + name + ". Ich bin " + alter + " Jahre alt.");
    }

    // main-Methode zum Testen
    public static void main(String[] args) {
        // Ein Mensch-Objekt anlegen
        Mensch peter = new Mensch("Peter", 25, 'm');
        // Aufrufen der einzelnen Methoden
        peter.begruessung();
        peter.geburtstag();
        peter.begruessung();
    }


}
