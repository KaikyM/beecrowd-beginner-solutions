import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        //
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, N, i * N);
        }
        //
        input.close();
    }
}
