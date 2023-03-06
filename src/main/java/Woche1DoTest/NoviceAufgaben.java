package Woche1DoTest;

import java.util.Scanner;

public class NoviceAufgaben {

    public static void main(String[] args) {
        System.out.println(myName());
        myName5times();
        System.out.println(checkNumberBiggerThenZero(1));
        System.out.println(squareOfNumber(5));
        whatIsYourName();

    }

    public static String myName() {
        return "Mein Name ist Robin";
    }

    public static void myName5times() {
        int i = 1;

        while (i <= 5) {
            System.out.println(myName());
            i++;
        }
    }

    public static boolean checkNumberBiggerThenZero(int value1) {
        return value1 > 0;
    }
    public static int squareOfNumber(int value1){
        return value1 * value1;
    }

    public static void whatIsYourName(){
        Scanner inputname = new Scanner(System.in);
        System.out.println("Hallo wie ist dein Name ?");
        String name = inputname.nextLine();
        System.out.println("Hallo " + name + ", wilkommen bei NeueFische");
        inputname.close();

    }
//      Beispiel von Mattias was ich nicht hatte war "scanner.close();" bei mir dann inputname.close(); hat aber aucgh ohne Funktioniert
//    public static void greetUser() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Bitte Namen eingeben: ");
//        String username = scanner.nextLine();
//
//        System.out.println("Hi " + username + "!");
//        scanner.close();



}
