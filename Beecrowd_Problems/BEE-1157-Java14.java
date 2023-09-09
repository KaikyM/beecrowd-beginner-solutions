import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        //
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
