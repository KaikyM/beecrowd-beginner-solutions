import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        Double Pi = 3.14159;
        Double R = input.nextDouble();
        Double V = ((4/3.0) * Pi * Math.pow(R, 3));
        //
        System.out.printf("VOLUME = %.3f\n", V);
        //
        input.close();
    }
}
