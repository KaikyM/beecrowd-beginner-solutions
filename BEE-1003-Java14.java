import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);
        int A = sca.nextInt();
        int B = sca.nextInt();
        int Sum = A + B;
        System.out.println("SOMA = " + Sum);
        sca.close();
    }
}
