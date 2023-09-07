import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        int Fact = 1;
        //
        for(int i = 1; i <= N; i++){
            Fact *= i;
        }
        System.out.println(Fact);
        //
        input.close();
    }
}
