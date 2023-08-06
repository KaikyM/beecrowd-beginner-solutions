import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int High = 0, Pos = 1; 
        //
        for(int i = 1; i <= 100; i++){
            int X = input.nextInt();
            if(High < X){
                High = X;
                Pos = i;
            }
        }
        System.out.printf("%d\n%d\n", High, Pos);
        //
        input.close();
    }
}
