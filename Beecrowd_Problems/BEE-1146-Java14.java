import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        boolean Stop = false;
        //
        while(Stop != true){
            int N = input.nextInt();
            if(N != 0){
                int I = 1;
                while(I < N){
                    System.out.print(I + " ");
                    I++;
                }
                System.out.println(I);
            }else{
                Stop = true;
            }
        }
        //
        input.close();
    }
}
