package _2603;

import java.util.Arrays;

public class JavaArraysMethoden {
    public static void main(String[] args) {
        // Um mit Arrays einfacher zu arbeiten, bietet Java über das package util die Array-Klasse an.
        // Arrays bietet uns die Möglichkeit ein Array zu sortieren oder auch in Textform auszugeben.
        int[] einfachesArray = {10, 5, 2, 1};
        System.out.println(Arrays.toString(einfachesArray));
        Arrays.sort(einfachesArray);
        System.out.println(Arrays.toString(einfachesArray));
    }
}
