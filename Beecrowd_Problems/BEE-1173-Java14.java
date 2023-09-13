import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int [] N = new int[10];
        int X = input.nextInt();
        //
        for(int i = 0; i < N.length; i++){
            N[i] = X;
            System.out.println("N[" + i + "] = "+ X);
            X = X * 2;
        }
        input.close();
    }
}
