import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sca = new Scanner(System.in);
        //
        int Value = Sca.nextInt();
        // Print and Decomposition
        if(0 < Value && Value < 1000000){
            System.out.println(Value);
            System.out.println(Value/100 +" nota(s) de R$ 100,00");
            Value = Value % 100;
            System.out.println(Value/50 +" nota(s) de R$ 50,00");
            Value = Value % 50;
            System.out.println(Value/20 +" nota(s) de R$ 20,00");
            Value = Value % 20;
            System.out.println(Value/10 +" nota(s) de R$ 10,00");
            Value = Value % 10;
            System.out.println(Value/5 +" nota(s) de R$ 5,00");
            Value = Value % 5;
            System.out.println(Value/2 +" nota(s) de R$ 2,00");
            Value = Value % 2;
            System.out.println(Value/1 +" nota(s) de R$ 1,00");
        }
        //
        Sca.close();
    }
}
