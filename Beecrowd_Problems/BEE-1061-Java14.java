import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
// Input
        String[] Startday = input.nextLine().split(" ");
        String[] Starthours = input.nextLine().replaceAll(" ", "").split(":");
        String[] Enday = input.nextLine().split(" ");
        String[] Endhours = input.nextLine().replaceAll(" ", "").split(":");
// Start and End of the Event
        int Sday = Integer.parseInt(Startday[1]);
        int Shour = Integer.parseInt(Starthours[0]);
        int Sminute = Integer.parseInt(Starthours[1]);
        int Second = Integer.parseInt(Starthours[2]);
        int Eday = Integer.parseInt(Enday[1]);
        int Ehour = Integer.parseInt(Endhours[0]);
        int Eminute = Integer.parseInt(Endhours[1]);
        int Esecond = Integer.parseInt(Endhours[2]);
// Calculation
        int Day1 = Second + Sminute * 60 + Shour * 3600 + Sday * 86400;
        int Day2 = Esecond + Eminute * 60 + Ehour * 3600 + Eday * 86400;
        int Total = Day2 - Day1;
// Output
        System.out.printf("%d dia(s)\n", Total/86400);
        Total = Total % 86400;
        System.out.printf("%d hora(s)\n", Total/3600);
        Total = Total % 3600;
        System.out.printf("%d minuto(s)\n", Total/60);
        Total = Total % 60;
        System.out.printf("%d segundo(s)\n", Total);
//
        input.close();
    }
}
