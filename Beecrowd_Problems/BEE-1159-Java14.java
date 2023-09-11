import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        boolean Stop = false;
        //
        while(Stop != true){
            // Input
            int X = input.nextInt();
            //
            if(X != 0){
                int Sum = 0;
                int j = 0;
                // Sum of Consecutive Even
                for(int i = X; j < 5; i++){
                    if(i % 2 == 0){
                        Sum += i;
                        j += 1;
                    }
                }
                // Output
                System.out.println(Sum);
            // Stopping Criterion
            }else{
                Stop = true; 
            }
        }
        //
        input.close();
    }
}
