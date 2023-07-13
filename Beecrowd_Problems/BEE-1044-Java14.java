import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
        int Y = input.nextInt();
        //
        if(X % Y == 0 || Y % X == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        //
        input.close();
    }
}
