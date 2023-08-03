import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int In = 0, Out = 0, N;
        N = input.nextInt();
        //
        for(int i = 0; i < N; i++){
            int X = input.nextInt();
            if(10 <= X && X <= 20){
                In++;
            }else{ 
                Out++;
            }
        }
        System.out.printf("%d in\n%d out\n", In, Out);
        //
        input.close();
    }
}
