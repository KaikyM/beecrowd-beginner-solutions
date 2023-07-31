import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int even = 0;
        //
        for(int i = 0; i < 5; i++){
            int numbers = input.nextInt();
            if(numbers % 2 == 0){ even++; }
        }
        //
        System.out.println(even + " valores pares");
        //
        input.close();
    }
}
