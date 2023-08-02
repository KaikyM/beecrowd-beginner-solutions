import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
        int Y = 0;
        while(Y < 6){
            if(X % 2 == 1){
                System.out.println(X);
                Y++;
            }
            X++;
        }
        //
        input.close();
    }
}
