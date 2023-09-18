import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int i;
        int [] N = new int[1000];
        int T = input.nextInt();
        for(i = 0; i < N.length; i++){
            N[i] = i%T;
        }
        for(i = 0; i < N.length; i++){
               System.out.println("N[" + i + "] = "+ N[i]);
            }
        //
        input.close();
    }
}
