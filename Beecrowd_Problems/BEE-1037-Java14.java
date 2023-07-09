import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        //
        float N = Sc.nextFloat();
        //
        if(0.00 <= N && N <= 25.00){
            System.out.println("Intervalo [0,25]");
        }else if(25.01 <= N && N <= 50.00){
            System.out.println("Intervalo (25,50]");
        }else if(50.01 <= N && N <= 75.00){
            System.out.println("Intervalo (50,75]");
        }else if(75.01 <= N && N <= 100.00){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
        //
        Sc.close();
    }
}
