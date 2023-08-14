import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        int i = 1, j = 0;
        while(j < N){
            j++;
            System.out.printf("%d %d %d PUM\n",i ,i += 1 ,i += 1);
            i += 2;
        }
        //
        input.close();
    }
}
