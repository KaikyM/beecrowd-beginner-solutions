import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        float X = input.nextFloat();
        float Y = input.nextFloat();
        //
        if(X == 0.0 && Y == 0.0){
            System.out.println("Origem");
        } else if ((X > 0.0 || X < 0.0) && Y == 0.0){
            System.out.println("Eixo X");
        } else if ((Y > 0.0 || Y < 0.0) && X == 0.0){
            System.out.println("Eixo Y");
        } else if(X > 0.0 && Y > 0.0){
            System.out.println("Q1");
        } else if(X < 0.0 && Y > 0.0){
            System.out.println("Q2");
        } else if(X < 0.0 && Y < 0.0){
            System.out.println("Q3");
        } else if(X > 0.0 && Y < 0.0){
            System.out.println("Q4");
        }
        //
        input.close();
    }
}
