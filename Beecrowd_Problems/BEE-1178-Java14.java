import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int i;
        double [] N = new double[100];
        double T = input.nextDouble();
        //
        for(i = 0; i < N.length; i++){
            if(i == 0){
                N[i] = T;
            }else{
                T = T/2;
                N[i] = T;
            }
        }
        //
        for(i = 0; i < N.length; i++){
            System.out.printf("N[%d] = %.4f\n",i ,N[i]);
        }
        input.close();
    }
}
