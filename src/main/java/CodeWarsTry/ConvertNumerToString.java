package CodeWarsTry;



public class ConvertNumerToString {

    public static void main(String[] args) {


        System.out.println(text);               //Hier wird der neue String "text" als String in die Konsole ausgegeben

        System.out.println(text2);                 //und hier wird dann der neue String "text2" als String in die Konsole ausgegeben

        System.out.println(numberToString(815));     //Hier wird der "numberToString" in der Konsole ausgegeben
    }

    public static String text = Integer.toString(42);  //Hier wird direkt ein int in einen String umgewandelt


    static int number = 666;                       //Hier wird erst ein integer mit der bezeichnung "number" erstellt
    public static String text2 = Integer.toString(number);  //wie oben wird dann der wert von "number" in einen String ausgegeben


//_______________________________________________________________________________________________________________________________________
//_________Die vorgaben oben wollte CodeWars so nicht da CodeWars public static String numberToString(int num) im Code haben wollte______
    public static String numberToString(int num) {   //Hier wird eine String mit dem namen "numberToString" aufgerufen die in (die variable "int num") enthält
        return Integer.toString(num); //hier wird der Integer dann in einen String vom wert"num" ausgegeben
    }

//_________Alternative lösungen auf CodeWars____________

    public static String numberToString2(int num) { //Identisch zu meiner nur,
        return String.valueOf(num);                 //anstelle von .toString wird .valueOf genommen
    }

    public static String numberToString3(int num) { //Richtig coole version
        return ""+num;          //"" steht vermutlich für String und +num gibt an was in einen String verwandelt werden soll
    }




}
