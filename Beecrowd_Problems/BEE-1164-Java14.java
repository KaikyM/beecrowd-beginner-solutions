import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X, Sum;
	int N = input.nextInt();
        //
        for(int i = 0; i < N; i++){
            Sum = 0;
            X = input.nextInt();
            //
            for(int j = 1; j < X; j++){
                if((X % j) == 0){ Sum += j; }
            }
            // Output
            if(Sum == X){
                System.out.println(X + " eh perfeito");
            }else{
                System.out.println(X + " nao eh perfeito");
            }
        }
        input.close();
    }
}
