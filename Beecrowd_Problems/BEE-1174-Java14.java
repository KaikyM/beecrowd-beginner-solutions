import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double X;
        int [] A = new int[100];
        //
        for(int i = 0; i < A.length; i++){
            X = input.nextInt();
            if(X <= 10){
                A[i] = X;
                System.out.printf("A[%d] = %d.1f\n",i ,X);
            }
        }
        input.close();
    }
}
