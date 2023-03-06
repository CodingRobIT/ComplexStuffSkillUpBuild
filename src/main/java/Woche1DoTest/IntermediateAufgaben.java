package Woche1DoTest;

import java.util.Arrays;

public class IntermediateAufgaben {

    public static void main(String[] args) {

        System.out.println("Aufgabe String-Array  EINS bis ZEHN "+ stringArrayEinsBisZehn());
        System.out.println(numToString());
        //System.out.println(numToStringV2());
        //System.out.println(oneToOneHundred());
    }

    public static String stringArrayEinsBisZehn() {     //Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn" //Aufgabenstellung
        String[] number = new String[10];

        number[0] = "Eins";
        number[1] = "Zwei";
        number[2] = "Drei";
        number[3] = "Vier";
        number[4] = "Fünf";
        number[5] = "Sechs";
        number[6] = "Sieben";
        number[7] = "Acht";
        number[8] = "Neun";
        number[9] = "Zehn";

        // System.out.println(number[0]);  // Zeigt eine der gewünschten Nummern an. In diesem Fall ist 0 = eins.
        //System.out.println(Arrays.toString(number)); // gibt alle Arrays aus.
        return Arrays.toString(number);
   }

   public static String numToString() {  // Hier wieder ein Array wie oben, das aber nur eine Zahl ausgibt.
        String[] number = new String[9]; // Die Frage hier ist, ob man nicht auf das obige Array (stringArray) zugreifen kann.
                                            //um von dort aus die bestehenden Nummern zu nutzen
       number[0] = "Eins";
       number[1] = "Zwei";
       number[2] = "Drei";
       number[3] = "Vier";
       number[4] = "Fünf";
       number[5] = "Sechs";
       number[6] = "Sieben";
       number[7] = "Acht";
       number[8] = "Neun";

       return number[8]; // Ähnlich wie oben bei "stringArray", nur dass im "return" nur eine Zahl ausgegeben wird.

  }

  //public static String

//  public  static String oneToOneHundred() {
//        String[] number = new String[100];
//        int i = 0;
//        String c = 1;
//        while (i < 100){
//            i++;
//        }
//        while (i < 101){
//            c++;
//        }
//
//
//  }


}
