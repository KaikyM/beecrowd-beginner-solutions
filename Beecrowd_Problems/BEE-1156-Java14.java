import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double S = 1, i, j;
        for(i = 3, j = 2; i <= 39; i+= 2, j*= 2){
            S+= i / j;
        }
        System.out.printf("%.2f\n", S);
        //
        input.close();
    }
}
