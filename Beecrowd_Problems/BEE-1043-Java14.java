import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        float A, B, C, triangle, trapezium;
        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();
        //
        if((A < B + C) && (B < C + A) && (C < A + B)){
            triangle = A + B + C;
            System.out.printf("Perimetro = %.1f\n", triangle);
        }else{
            trapezium = ((A + B)*C) / 2;
            System.out.printf("Area = %.1f\n", trapezium);
        }
        //
        input.close();
    }
}
