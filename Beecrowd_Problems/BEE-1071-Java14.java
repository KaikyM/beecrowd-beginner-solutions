import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int sum = 0, X, Y;
        X = input.nextInt();
        Y = input.nextInt();
        //
        if(X < Y){
            for(int i = X + 1; i < Y; i++){
                if(i % 2 != 0){ sum += i; }
            }
        }else{
            for(int i = Y + 1; i < X; i++){
                if(i % 2 != 0){ sum += i; }
            }
        }
        //
        System.out.println(sum);
        //
        input.close();
    }
}
