import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        //
        int T, N;
        long before = 1, current = 0, after;
		    long Fibo[] = new long[61];
        //
        for(int i = 0; i < Fibo.length; i++){
            Fibo[i] = current;
            after = before;
            before = current;
            current = after + before;
        }
        //
	      T = input.nextInt();
	      for(int i = 0; i < T; i++){
		        N = input.nextInt();
		        System.out.println("Fib(" + N + ") = " + Fibo[N]);
	      }
        input.close();
    }
}
