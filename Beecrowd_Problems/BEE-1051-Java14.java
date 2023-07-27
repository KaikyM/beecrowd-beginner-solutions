import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double salary, tax;
        salary = input.nextDouble();
        //
        if(0 <= salary && salary <= 2000){ 
            System.out.println("Isento"); 
        }else{
            if(2000.01 <= salary && salary <= 3000 ){
                tax = ((salary - 2000.0) * 0.08);
                System.out.printf("R$ %.2f\n", tax);
            }
            if(3000.01 <= salary && salary <= 4500 ){ 
                tax = ((salary - 3000.0) * 0.18 + (1000.0 * 0.08));
                System.out.printf("R$ %.2f\n", tax);
            }
            if(4500.01 <= salary){ 
                tax = ((salary - 4500.0) * 0.28 + (1500.0 * 0.18) + (1000.0 * 0.08));
                System.out.printf("R$ %.2f\n", tax);
            }
        }
        //
        input.close();
    }
 }
