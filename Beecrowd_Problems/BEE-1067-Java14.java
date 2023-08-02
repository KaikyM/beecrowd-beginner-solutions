import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
            for(int i = 1; i <= X; i = i +2){
                System.out.println(i);
            }
        //
        input.close();
    }
}
