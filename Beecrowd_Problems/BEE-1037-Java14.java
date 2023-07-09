import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        //
        float N = Sc.nextFloat();
        //
        if(0.0 <= N && N <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }else if(25.00001 <= N && N <= 50.0000000){
            System.out.println("Intervalo (25,50]");
        }else if(50.0000001 <= N && N <= 75.000000000){
            System.out.println("Intervalo (50,75]");
        }else if(75.000000001 <= N && N <= 100.00000000000){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
        //
        Sc.close();
    }
}
