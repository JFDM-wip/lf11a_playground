package _2603;

public class JavaArrays {
    public static void main(String[] args) {
        int zahl = 10;
//        Datentyp[] arrayName = new int[10]
//        Datentyp arrayName[]
//        Datentyp[] arrayName = {10, 20, 30, 40}
//        String text = "Text";
//        String text1 = new String();

//        Das Array kann 10 int Werte aufnehmen, Größe des Arrays ist 10
//        Arrays fangen immer bei 0 an
//                [0][1][2][3][4][5][6][7][8][9]
        int[] zahlenArray = new int[zahl];

//        Eignet sich um die einzelnen Werte des Arrays auszugeben / auszulesen - aber nicht um diese zu verändern
//        for (int i : zahlenArray) {
//            System.out.println(i);
//        }
//        in der "normalen" for -Schleife kann ich auf die einzelnen Werte des Arrays per Index zugreifen und Werte verändern
//        for (int i = 0; i <= zahlenArray.length - 1; i++) {
//            System.out.println(zahlenArray[i]);
//            zahlenArray[i] = i + 3;
//            System.out.println(zahlenArray[i]);
//        }

//        Mehrdimensionale Arrays
//        int[][] mehrdimensionalesArray; [[0][1]]
        int[][] mehrdimensionalesArray = {{10, 11, 12}, {14, 15, 16}};
        for (int i = 0; i < mehrdimensionalesArray.length; i++) {
            System.out.println(mehrdimensionalesArray[i][i]);
        }


    }
}
