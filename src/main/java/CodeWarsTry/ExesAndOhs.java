package CodeWarsTry;

public class ExesAndOhs {

    public static boolean getXO(String str) {

        str = str.toLowerCase();

        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'x') {
                xCount++;
            } else if (currentChar == 'o') {
                oCount++;
            }
        }
        return xCount == oCount;
    }

    // Just for testing the code
    public static void main(String[] args) {

        String input1 = "xXoO";                     // true
        String input2 = "xXo";                      // false
        String input3 = "xXoOo";                    // false
        // CodeWars Examples
        String input4 = "ooxx";                     // true
        String input5 = "xooxx";                    // false
        String input6 = "ooxXm";                    // true
        String input7 = "zpzpzpp";                  //true  >>> when no 'x' and 'o' is present should return true
        String input8 = "zzoo";                     //false
        // CodeWars Test
        String input9 = "xxxooo";                   //true
        String input10 = "xxxXooOo";                //true
        String input11 = "xxx23424esdsfvxXXOOooo";  //false
        String input12 = "xXxxoewrcoOoo";           //false
        String input13 = "XxxxooO";                 //false
        String input14 = "zssddd";                  //true
        String input15 = "Xxxxertr34";              //false
        String input16 = "";                       //true

        System.out.println("Put here an Random Test" + getXO("Here!!!"));     // keep in mind no x or o is true
        System.out.println("Shoul be true = " + getXO(input1));
        System.out.println("Shoul be false = " + getXO(input2));
        System.out.println("Shoul be false = " + getXO(input3));
        System.out.println("Shoul be true = " + getXO(input4));
        System.out.println("Shoul be false = " + getXO(input5));
        System.out.println("Shoul be true = " + getXO(input6));
        System.out.println("Shoul be true = " + getXO(input7));
        System.out.println("Shoul be false = " + getXO(input8));
        System.out.println("Shoul be true = " + getXO(input9));
        System.out.println("Shoul be true = " + getXO(input10));
        System.out.println("Shoul be false = " + getXO(input11));
        System.out.println("Shoul be false = " + getXO(input12));
        System.out.println("Shoul be false = " + getXO(input13));
        System.out.println("Shoul be true = " + getXO(input14));
        System.out.println("Shoul be false = " + getXO(input15));
        System.out.println("Shoul be true = " + getXO(input16));

    }


}

//    **** CodeWars Instruction ****
//    Check to see if a string has the same amount of 'x's and 'o's.
//    The method must return a boolean and be case insensitive.
//    The string can contain any char.