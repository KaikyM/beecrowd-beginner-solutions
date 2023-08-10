import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int Z = 0;
        //
        while(Z != 1){
            String[] Values = input.nextLine().split(" ");
            int X = Integer.parseInt(Values[0]);
            int Y = Integer.parseInt(Values[1]);
            //
            if(X > Y){ System.out.println("Decrescente"); }
            else if(X < Y){ System.out.println("Crescente"); }
            else if(X == Y){ Z = 1; }
        }
        //
        input.close();
    }
}
