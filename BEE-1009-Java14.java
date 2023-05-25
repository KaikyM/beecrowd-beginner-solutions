import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        Double S = input.nextDouble();
        Double B = input.nextDouble();
        Double T = S + (B * 0.15);
        System.out.printf("TOTAL = U$ %.2f\n", T);
        input.close();
    }
}
