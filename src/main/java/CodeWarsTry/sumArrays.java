package CodeWarsTry;

public class sumArrays {

    public static double sum(double[] numbers) {
        double sum = 0.0; //sum wird hier initialisiert mit dem wert 0.0

        // hier wird int i als 0 Initialisiert und mit der länge der nummer "numbers" wird
        // durch i++ der wert um 1 erhöt. Dadurch wird durch die zahlen (das Array double[]) durch iteriert
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // hier wird dann zu sum je die neue nummer "numbers" addiert
        }

        return sum; //hier wird dann, wenn die for Schleife fertig ist die gesamt summe "sum" ausgegeben
    }

    // Für CodeWars nicht relevant ist nur zum Darstellen
    public static void main(String[] args) {

        double[] numbers = {1.5, 2.0, 3.2, 0.84674};
        double result = sum(numbers);
        System.out.println("Die Summe der Zahlen ist: " + result);
    }
}

// Alternativ zu der for schleife oben
//        for (double number : numbers) {
//            sum += number;
//        }

// extrem Clever ist Folgender Code
//public static double sum(double[] numbers) {
//    return Arrays.stream(numbers).sum();
//}