import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        for(int i = 1; i <= N; i++){
            int j = (int)Math.pow(i, 2);
            int k = (int)Math.pow(i, 3);
            System.out.printf("%d %d %d\n",i ,j ,k);
        }
        //
        input.close();
    }
}
