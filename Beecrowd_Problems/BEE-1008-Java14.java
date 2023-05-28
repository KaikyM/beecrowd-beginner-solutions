import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
	Scanner S = new Scanner(System.in);
	//
	int N = S.nextInt();
        int H = S.nextInt();
        Double D = S.nextDouble();
        Double Sal = (H * D);
        //
	System.out.println("NUMBER = " + N);
        System.out.printf("SALARY = U$ %.2f\n" , Sal));
        //
	S.close();
    }
}
