import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        int before = 0, current = 1, after; 
        //
        for(int i = 1; i <= N; i++){
            if(i == N){ System.out.println(before); }
            else{ System.out.print(before + " "); }
            // Fibonacci
            after = before + current;
            before = current;
            current = after;
        }
        //
        input.close();
    }
}
