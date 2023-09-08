import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double S = 1, i;
        for(i = 2; i <= 100; i++){
            S += 1 / i;
        }
        System.out.printf("%.2f\n", S);
        //
        input.close();
    }
}
