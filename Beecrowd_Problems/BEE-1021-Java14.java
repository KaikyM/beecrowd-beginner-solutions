import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sca = new Scanner(System.in);
        //
        Double ValueInput = Sca.nextDouble();
        // 
        if(0 < ValueInput && ValueInput < 1000000.00){
            int Value = 0;
            //// Notes
            System.out.println("NOTAS:");
            Value = (int) (ValueInput / 100);
            System.out.printf("%d nota(s) de R$ 100.00\n", Value);
            ValueInput = ValueInput % 100.0;
            //
            Value = (int) (ValueInput / 50);
            System.out.printf("%d nota(s) de R$ 50.00\n", Value);
            ValueInput = ValueInput % 50.0;
            //
            Value = (int) (ValueInput / 20);
            System.out.printf("%d nota(s) de R$ 20.00\n", Value);
            ValueInput = ValueInput % 20.0;
            //
            Value = (int) (ValueInput / 10);
            System.out.printf("%d nota(s) de R$ 10.00\n", Value);
            ValueInput = ValueInput % 10.0;
            //
            Value = (int) (ValueInput / 5);
            System.out.printf("%d nota(s) de R$ 5.00\n", Value);
            ValueInput = ValueInput % 5.0;
            //
            Value = (int) (ValueInput / 2);
            System.out.printf("%d nota(s) de R$ 2.00\n", Value);
            ValueInput = ValueInput % 2.0;
            //
            ValueInput = ValueInput * 100.0;
            //// Coins
            System.out.println("MOEDAS:");
            Value = (int) (ValueInput / 100);
            System.out.printf("%d moeda(s) de R$ 1.00\n", Value);
            ValueInput = ValueInput % 100.0;
            //
            Value = (int) (ValueInput / 50);
            System.out.printf("%d moeda(s) de R$ 0.50\n", Value);
            ValueInput = ValueInput % 50.0;
            //
            Value = (int) (ValueInput / 25);
            System.out.printf("%d moeda(s) de R$ 0.25\n", Value);
            ValueInput = ValueInput % 25.0;
            //
            Value = (int) (ValueInput / 10);
            System.out.printf("%d moeda(s) de R$ 0.10\n", Value);
            ValueInput = ValueInput % 10.0;
            //
            Value = (int) (ValueInput / 5);
            System.out.printf("%d moeda(s) de R$ 0.05\n", Value);
            ValueInput = ValueInput % 5.0;
            //
            Value = (int) (ValueInput / 1);
            System.out.printf("%d moeda(s) de R$ 0.01\n", Value);
        }
        //
        Sca.close();
    }
}
