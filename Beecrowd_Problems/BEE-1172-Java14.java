import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int i;
        // Array
        int [] X = new int[10];
        // Input in Array
        for(i = 0; i < X.length; i++){
            X[i] = input.nextInt();
            // Zero and Negative Substitution in Array
            if(X[i] <= 0){ X[i] = 1; }
        }
        // Output read a Array
        for(i = 0; i < X.length; i++){
            System.out.println("X["+ i +"] = " + X[i]);
        }
        input.close();
    }
}
