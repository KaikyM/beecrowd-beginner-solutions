import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);
        //
        Double Pi = 3.14159;
        Double Radius = sca.nextDouble();
        Double Area = Pi * Math.pow(Radius, 2);
        //
        System.out.printf("A=%.4f\n", Area);
        sca.close();
    }
}
