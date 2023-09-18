import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int [] N = new int[20];
        int i;
        //
        for(i = 0; i < N.length; i++){
            N[i] = input.nextInt();
        }
        for(i = 0; i < N.length; i++){
            System.out.printf("N[%d] = %d\n", i, N[19 - i]);
        }
        //
        input.close();
    }
}
