import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        //
        for(int i = 1; i <= N; i++){
            int J = 0;
            int K = (int) Math.pow(i, 2) - 1;
            int L = (int) Math.pow(i, 3) - 1;
            while(J != 2){
                J++; K++; L++;
                System.out.printf("%d %d %d\n",i ,K ,L);
            }
        }
        input.close();
    }
}
