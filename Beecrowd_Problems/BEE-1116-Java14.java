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
            String[] Values = input.nextLine().split(" ");
            int X = Integer.parseInt(Values[0]);
            int Y = Integer.parseInt(Values[1]);
            //
            if(Y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", (double) X / Y);
            }
        }
        //
        input.close();
    }
}
