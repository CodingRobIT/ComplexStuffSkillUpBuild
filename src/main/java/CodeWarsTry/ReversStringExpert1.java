package CodeWarsTry;

import com.sun.tools.javac.Main;

public class ReversStringExpert1 {
    //Schreibe eine Methode in JAVA die einen Eingabestring rückwärts ausgibt.

    public static void main(String[] args) {
        //Hier ist ein Beispiel für die Verwendung der Methode:
        String result = reverseString("Hello, World!");
        System.out.println(result); // "!dlroW ,olleH"
    }

    public static String reverseString(String input) {

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();

    }

//    Hier ist eine Erklärung, wie die Methode funktioniert:
//
//    Eine neue Instanz von StringBuilder wird mit der Eingabezeichenfolge als Argument erstellt.
//    Die reverse()-Methode wird auf den StringBuilder angewendet, um die Zeichenfolge umzukehren.
//    Die umgekehrte Zeichenfolge wird mit der toString()-Methode des StringBuilder in einen String umgewandelt und zurückgegeben.


}
