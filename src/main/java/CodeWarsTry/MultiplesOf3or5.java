package CodeWarsTry;

public class MultiplesOf3or5 {

        // Codewars Code starts here
        public static int sumMultiples3Or5(int numbers) {
            int totalSum = 0;  // Eine Variable, um die Summe der Vielfachen zu speichern
            for (int num = 0; num < numbers; num++) {  // Schleife von 0 bis n-1 (die gegebene Zahl)
                if (num % 3 == 0 || num % 5 == 0) {  // Prüfen, ob num ein Vielfaches von 3 oder 5 ist
                    totalSum += num;  // Wenn ja, füge num zur Gesamtsumme hinzu
                }
            }
            return totalSum;  // Gib die berechnete Gesamtsumme zurück
        }
        //to here
        public static void main(String[] args) {
            int number = 10;  // Die gegebene Zahl, für die wir die Summe berechnen
            int result = sumMultiples3Or5(number);  // Rufe die Funktion auf, um die Summe zu berechnen
            System.out.println("The sum of all multiples of 3 or 5 below " + number + " is " + result + ".");
        }


}
