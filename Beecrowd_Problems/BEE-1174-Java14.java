import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double X;
        double [] A = new double[100];
        //
        for(int i = 0; i < A.length; i++){
            X = input.nextDouble();
            A[i] = X;
            if(X <= 10.0){
                System.out.printf("A[%d] = %.1f\n",i ,A[i]);
            }
        }
        input.close();
    }
}
