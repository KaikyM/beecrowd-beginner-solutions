import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();
        //
        Double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //
        System.out.printf("%.4f\n", Distance);
        //
        input.close();
    }
}
