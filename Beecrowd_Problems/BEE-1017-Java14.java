import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in);
        //
        int hour = S.nextInt();
        int speed = S.nextInt();
        //
        Double Liters = (hour * speed) / 12.0;
        //
        System.out.printf("%.3f\n", Liters);
        //
        S.close();
    }
}
