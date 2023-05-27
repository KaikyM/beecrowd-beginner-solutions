import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in); 
        //
        int Km = S.nextInt();
        Double L = S.nextDouble();
        //
        Double Km_L = Km / L;
        //
        System.out.printf("%.3f km/l\n", Km_L);
        //
        S.close();
    }
}
