package CodeWarsTry.AllStarCode;

import java.sql.SQLOutput;

public class Clock {
    public static int Past(int h, int m, int s) {

        int hour = h*(60*60*1000);
        int min = m*(60*1000);
        int sec = s*(1000);
        int ClockPast = hour+min+sec;


        return (ClockPast);
    }

    public static void main(String[] args) {

        // enter here your own digits
        int h = 1; // Hour
        int m = 0; // Minutes
        int s = 0; // Seconds

        System.out.println("");
        System.out.println("when this Line shows 61000 code works fine = " + Past(0,1,1) + " dose it work ?");
        System.out.println("If Code works fine then free calculate your own result");
        System.out.println("");
        System.out.println(h + " Hour " + m + " Minutes and " + s + " Seconds are " + Past(h,m,s) + " Millisecoonds");
    }
}

// Very Cool variation is this one

//public class Clock
//{
//    public static int Past(int h, int m, int s)
//    {
//        return h * 3600000 + m * 60000 + s * 1000;
//    }
//}

// also cool but not rly mine is this one

//import java.time.Duration;
//
//public class Clock {
//    public static int Past(int h, int m, int s) {
//        return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
//    }
//}

// also rly cool is

//public class Clock
//{
//    public static int Past(int h, int m, int s)
//    {
//        return 1000*(s+60*(m+60*h));
//    }
//}