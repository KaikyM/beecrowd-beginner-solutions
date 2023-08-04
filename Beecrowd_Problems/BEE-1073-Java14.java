import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
        int stop = 0, Y = 2;
        //
        while(stop < X){
            if(X % 2 == 0){
                System.out.printf("%d^2 = %d\n",Y , Y*Y);
                Y += 2;
                stop += 2;
            }else{ X--; }
        }
        //
        input.close();
    }
}
