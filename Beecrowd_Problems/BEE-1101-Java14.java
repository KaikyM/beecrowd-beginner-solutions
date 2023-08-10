import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int k = 0;
        while(k != 1){
            // Input
            String Values[] = input.nextLine().split(" ");
            int M = Integer.parseInt(Values[0]);
            int N = Integer.parseInt(Values[1]);
            // Stop Case
            if(N <= 0 || M <= 0){ 
                k++;
                break;
            }
            //
            int sum = 0;
            if(M > N){
                for(int i = N; i <= M; i++){
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.println("Sum=" + sum);
            }else{
                for(int i = M; i <= N; i++){
                    sum += i;
                    System.out.print(i + " ");
                }
                System.out.println("Sum=" + sum);
            }
        }
        input.close();
    }
}
