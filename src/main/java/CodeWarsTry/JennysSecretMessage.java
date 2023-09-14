package CodeWarsTry;

public class JennysSecretMessage {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    public static void main(String[] args) {
        String name = "Johnny";
        System.out.printf(greet(name));
    }
}
