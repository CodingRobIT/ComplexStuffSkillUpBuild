package CodeWarsTry;

public class OppositesAttract {

    // TODO Train that Code !!!!
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isPetal1Even = (flower1 % 2 == 0);
        boolean isPetal2Even = (flower2 % 2 == 0);

        // Check if one flower has even petals and the other has odd petals
        return (isPetal1Even && !isPetal2Even) || (!isPetal1Even && isPetal2Even);
    }

    // Just for testing
    public static void main(String[] args) {
        int flower1 = 4; // Replace with the number of petals of the first flower
        int flower2 = 4; // Replace with the number of petals of the second flower

        boolean inLove = isLove(flower1, flower2);

        if (inLove) {
            System.out.println("Timmy and Sarah are in love!");
        } else {
            System.out.println("Timmy and Sarah are not in love.");
        }
    }
}
