package CodeWarsTry.AllStarCode;

// Hier haben wir eine Klasse namens "StringCounter".
public class Challenge18 {

    // Diese Methode zählt, wie oft ein bestimmter Buchstabe in einem String vorkommt.
    // Sie akzeptiert einen String und einen einzelnen Buchstaben als Argumente.
    public static int strCount(String string, char ch) {
        // Hier initialisieren wir eine Variable namens "count", die die Anzahl der Vorkommen zählt.
        int count = 0;

        // Jetzt beginnt die Schleife. Sie läuft so lange, wie die Länge des Strings.
        for (int i = 0; i < string.length(); i++) {
            // Innerhalb der Schleife überprüfen wir, ob der Buchstabe an der aktuellen Position dem gegebenen Buchstaben entspricht.
            if (string.charAt(i) == ch) {
                // Wenn ja, erhöhen wir die Zählung.
                count++;
            }
        }

        // Am Ende geben wir die endgültige Zählung zurück.
        return count;
    }

    // Hier haben wir die "main"-Methode, die das Hauptprogramm enthält.
    public static void main(String[] args) {
        // Wir rufen unsere Methode mit verschiedenen Testfällen auf und geben die Ergebnisse aus.
        System.out.println(strCount("Hello", 'o'));  // Ausgabe: 1
        System.out.println(strCount("Hello", 'l'));  // Ausgabe: 2
        System.out.println(strCount("", 'z'));       // Ausgabe: 0
    }
}

