import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in);
        int A = S.nextInt();
        int B = S.nextInt();
        int C = S.nextInt();
        int D = S.nextInt();
        int Dif = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + Dif);
    }
}
