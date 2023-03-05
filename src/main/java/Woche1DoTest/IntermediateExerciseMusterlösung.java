package Woche1DoTest;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateExerciseMusterlösung {

//    Level: Intermediate
//    Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
//    Schreibe eine Methode die zu einer einstelligen Zahl das entsprechende Zahlenwort ausgibt.
//    Schreibe ein Programm, das die Zahlen 1-100 ausgibt, aber:
//    Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
//    Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
//    Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
//    Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.

    public static String[] numbersInText = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public static void main(String[] args) {

        checkHundredNumbers();
        printHundredNumbers();
        nameGame();
    }

    public static String numberToText(int number) {
        if (number >= 10) {
            System.out.println("Bitte gebe eine Zahl zwischen 1 und 9 an");
            return "Int zu lang";
        }
        switch (number) {
            case 1:
                return "Eins";
            case 2:
                return "Zwei";
            case 3:
                return "Drei";
            case 4:
                return "Vier";
            case 5:
                return "Fünf";
            case 6:
                return "Sechs";
            case 7:
                return "Sieben";
            case 8:
                return "Acht";
            case 9:
                return "Neun";
            default:
                return "Hier könnte Ihre Werbung stehen";
        }

    }


    public static String checkNumber(int value) {
        String result = "";

        if (value % 3 == 0) {
            result += "#";
        }
        if (value % 5 == 0) {
            result += "$";
        }
        return result + value;
    }

    public static String checkHundredNumbers() {
        String numbersText = "";

        for (int i = 1; i <= 100; i++) {
            numbersText += (checkNumber(i) + " ");
        }

        return numbersText;
    }

    public static void printHundredNumbers(){
        System.out.println(checkHundredNumbers());
    }

    public static void nameGame() {
        Scanner scanner = new Scanner(System.in);
        String[] names = {};

        while (true) {

            printNames(names);

            System.out.println("Bitte neuen Namen eingeben: ");
            String newName = scanner.nextLine();

            names = Arrays.copyOf(names, names.length + 1);
            names[names.length - 1] = newName;

        }
    }

    private static void printNames(String[] names) {
        System.out.println("Bisherige Namen: ");

        for (String name : names) {
            System.out.println(name + " ");
        }

    }


}