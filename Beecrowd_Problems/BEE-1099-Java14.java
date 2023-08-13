import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        input.nextLine();
        //
        for(int i = 0; i < N; i++){
            int sum = 0;
            //
            String[] Values = input.nextLine().split(" ");
            int X = Integer.parseInt(Values[0]);
            int Y = Integer.parseInt(Values[1]);
            //
            if(Y > X){
                for(int j = X + 1; j < Y; j++){
                    if(j % 2 != 0){ sum += j; }
                }
            }else{
                for(int j = Y + 1; j < X; j++){
                    if(j % 2 != 0){ sum += j; }
                }
            }
            //
            System.out.println(sum);
        }
        input.close();
    }
}
