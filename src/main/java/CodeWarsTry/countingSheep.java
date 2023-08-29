package CodeWarsTry;

public class countingSheep {

    public static String countingSheep(int n) {
        StringBuilder murmur = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            murmur.append(i).append(" sheep...");
        }
        return murmur.toString();
    }

    public static void main(String[] args) {
        int num = 3;
        String result = countingSheep(num);
        System.out.println(result);  // Bei 3 Ausgabe: "1 sheep...2 sheep...3 sheep..."
    }
}

//StringBuilder murmur: Hier wird eine Variable namens murmur vom Typ StringBuilder deklariert.
// Dies ist ein Objekt, das verwendet wird, um die Zeichenkette zu erstellen.
//
//new StringBuilder(): Mit dieser Anweisung wird eine neue Instanz eines StringBuilder erstellt.
// Der StringBuilder ist zu diesem Zeitpunkt leer und kann verwendet werden, um Zeichenketten aufzubauen.
//
//
// murmur.append(i): Hier wird die aktuelle Zahl i an den StringBuilder murmur angehängt.
// Das append-Methode fügt den Wert von i als Text in den StringBuilder ein.
//
//.append(" sheep..."): Anschließend wird der Text " sheep..." an den StringBuilder murmur angehängt.
// Dies fügt das Wort " sheep..." nach der gerade hinzugefügten Zahl ein.
