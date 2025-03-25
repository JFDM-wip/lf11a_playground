package _2403;

public class Strings {
    public static void main(String[] args) {
        String einfacherText = new String();
        einfacherText = "Startwert";
        System.out.println(einfacherText);
        System.out.println(einfacherText.charAt(2)); // a
        String neuerText = einfacherText.substring(0, 5);
        System.out.println(neuerText);
        System.out.println(neuerText.length());

    }
}
