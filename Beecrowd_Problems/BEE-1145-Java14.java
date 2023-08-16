import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        String [] Values = input.nextLine().split(" ");
        int X = Integer.parseInt(Values[0]);
        int Y = Integer.parseInt(Values[1]);
        int I = 0, K = 0;
        //
        while(I < Y){
            if(K != Y){
                int J = 0;
                while(J < X){
                    J++;
                    K++;
                    if(J < X){
                        System.out.print(K + " ");
                    }else{
                        System.out.print(K + "\n");
                    }
                }
            }
            I = K;
        }
        input.close();
    }
}
