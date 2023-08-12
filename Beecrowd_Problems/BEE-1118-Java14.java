import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int flag = 1;
        //
        while(flag == 1){
            double Sum = 0.0;
            // Loop Score
            while(flag != 3){
                double X = input.nextDouble();
                if(0 <= X && X <= 10){
                    Sum += X;
                    flag++;
                }else{
                    System.out.println("nota invalida"); 
                }
            }
            // Calculation
            double Av = Sum / 2;
            System.out.printf("media = %.2f\n", Av);
            // New Calculate
            while(flag != 1 && flag != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = input.nextInt();
            }
        }
        input.close();
    }
}
