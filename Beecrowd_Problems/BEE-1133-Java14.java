import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //Input
        int X = input.nextInt();
        int Y = input.nextInt();
        //
        int abc = 0;
        if(X > Y){ abc = Y; Y = X; X = abc;}
        //Output
        for(int i = X + 1; i < Y; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
        //
        input.close();
    }
}
