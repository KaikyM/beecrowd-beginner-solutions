import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int N = input.nextInt();
        input.nextLine();
        //
        for(int i = 1; i <= N; i++){
            String[] Values = input.nextLine().split(" ");
            // 
            double Num0 = Double.parseDouble(Values[0]);
            double Num1 = Double.parseDouble(Values[1]);
            double Num2 = Double.parseDouble(Values[2]);
            double Av = ((Num0 * 2) + (Num1 * 3) + (Num2 * 5)) / 10.0;
            //
            System.out.printf("%.1f\n", Av);
        }
        //
        input.close();
    }
}
