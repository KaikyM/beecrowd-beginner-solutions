import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Double A = input.nextDouble();
        Double B = input.nextDouble();
        Double Av = ((3.5 * A) + (7.5 * B)) / 11;
        System.out.printf("AVERAGE = %.5f\n", Av);
        input.close();
    }
}
