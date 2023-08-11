import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int I = 0;
        double Sum = 0.0;
        //
        while(I <= 1){
            double N = input.nextDouble();
            //
            if(0 <= N && N <= 10){
                Sum += N;
                I++;
            }else{
               System.out.println("nota invalida"); 
            }
        }
        double Av = Sum / I;
        System.out.printf("media = %.2f\n", Av);
        //
        input.close();
    }
}
