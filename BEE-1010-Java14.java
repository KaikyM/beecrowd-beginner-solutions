import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
//      
        int CodPro1 = input.nextInt();
        int UnitPro1 = input.nextInt();
        Double ValPro1 = input.nextDouble();
        int CodPro2 = input.nextInt();
        int UnitPro2 = input.nextInt();
        Double ValPro2 = input.nextDouble();
//        
        Double PayPro = ((UnitPro1 * ValPro1) + (UnitPro2 * ValPro2));
//
        System.out.printf("Value to Pay: U$ %.2f\n", PayPro);         
        input.close();
    }
}
