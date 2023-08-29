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

