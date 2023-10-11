import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int N, i, j, k;
        // Start Read 
        N = input.nextInt();
        while(N != 0){
            //Input
            for(i = 1; i <= N; i++){
                for(j = 1; j <= N; j++){
                    k = i;
                    if(j < k){ k = j; }
                    if(N - i + 1 < k){ k = N - i + 1; }
                    if(N - j + 1 < k){ k = N - j + 1; }
                    //Output
                    System.out.printf("%3d", k);
                    // Case Space and line Break
                    if(j < N){ System.out.print(" ");
                    }else{ System.out.print("\n"); }
                }
            }
            // End the Matrix
            System.out.print("\n");
            // Read New Value 
            N = input.nextInt();
        }
    }
}
