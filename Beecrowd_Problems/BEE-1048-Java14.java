import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        double Salary = input.nextDouble();
        int Percentage = 0;
        double Earned = 0.0;
        //
        if(Salary <= 400.00){ Percentage = 15; }
        if(400.01 <= Salary && Salary <= 800.00){ Percentage = 12; }
        if(800.01 <= Salary && Salary <= 1200.00){ Percentage = 10; }
        if(1200.01 <= Salary && Salary <= 2000.00){ Percentage = 7; }
        if(2000.01 <= Salary){ Percentage = 4; }
        //
        Earned = Salary * Percentage / 100;
        Salary = Salary + Earned;
        //
        System.out.printf("Novo salario: %.2f\n", Salary);
        System.out.printf("Reajuste ganho: %.2f\n", Earned);
        System.out.println("Em percentual: " + Percentage + " %");
        //
        input.close();
    }
}
