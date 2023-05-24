import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        Double A = Sc.nextDouble();
        Double B = Sc.nextDouble();
        Double C = Sc.nextDouble();
        int WA = 2;
        int WB = 3;
        int WC = 5;
        Double Av = ((WA * A) + (WB * B) + (WC * C))/(WA + WB + WC) ;
        System.out.printf("AVERAGE = %.1f\n", Av);
        Sc.close();
    }
}
