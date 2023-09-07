import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int cont = 0; 
        double sum = 0, N = 0;
        //
        while(N >= 0){
            N = input.nextInt();
            if(N >= 0){
                sum += N;
                cont++;
            }
        }
        double AgeAv = sum / cont;
        //
        System.out.printf("%.2f\n", AgeAv);
        //
        input.close();
    }
}
