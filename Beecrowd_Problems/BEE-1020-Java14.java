import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        //
        int Days = Sc.nextInt();
        //
        int Year = Days / 365;
        Days = Days % 365;
        int Month = Days / 30;
        Days = Days % 30;
        // Leap Year Case
//        if(Year % 4 == 0){
//           int LeapYear = Year / 4;
//            Days = Days + LeapYear;
//        }
        //
        System.out.println(Year + " ano(s)\n" +
                           Month + " mes(es)\n" +
                           Days + " dia(s)");
        //
        Sc.close();
    }
}
