import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
        int Y = input.nextInt();
        int Sum = 0;
        //
        if(X < Y){
            for(int i = X; i <= Y; i++){
                if(i % 13 != 0){
                    Sum += i;
                }
            }
        }else if(X > Y){
            for(int i = Y; i <= X; i++){
                if(i % 13 != 0){
                    Sum += i;
                }
            }
        }
        System.out.println(Sum);
        //
        input.close();
    }
}
