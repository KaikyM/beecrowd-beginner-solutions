import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        //
        for(int i = 0; i < N; i++){
            int X = input.nextInt();
            if(X == 0){ 
                System.out.println("NULL"); 
            }
            // Evens
            else if(X % 2 == 0 && X > 0){ System.out.println("EVEN POSITIVE"); }
            else if(X % 2 == 0 && X < 0){ System.out.println("EVEN NEGATIVE"); }
            // Odds
            else if(X % 2 != 0 && X > 0){ System.out.println("ODD POSITIVE"); }
            else if(X % 2 != 0 && X < 0){ System.out.println("ODD NEGATIVE"); }
        }
        //
        input.close();
    }
}
