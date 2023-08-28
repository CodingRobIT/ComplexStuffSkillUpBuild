package CodeWarsTry;
import java.util.Scanner;
public class Quadrants {
    public static int quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die x-Koordinate ein: ");
        int x = scanner.nextInt();

        System.out.print("Geben Sie die y-Koordinate ein: ");
        int y = scanner.nextInt();

        int quadrant = quadrant(x, y);
        System.out.println("Der Punkt befindet sich im Quadranten: " + quadrant);

        scanner.close();
    }
}


