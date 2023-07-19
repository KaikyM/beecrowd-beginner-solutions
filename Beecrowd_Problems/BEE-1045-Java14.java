import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
//      
        double A, B, C, abc;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
//
        if (B > A && B > C) {
		abc = A;
		A = B;
		B = abc;
	} else if (C > A) {
		abc = A;
		A = C;
		C = abc;
	}
//
        if(A >= B + C){ 
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            //
            if(A*A == B*B + C*C){ System.out.println("TRIANGULO RETANGULO"); }
            //
            if(A*A > B*B + C*C){ System.out.println("TRIANGULO OBTUSANGULO"); }
            //
            if(A*A < B*B + C*C){ System.out.println("TRIANGULO ACUTANGULO"); }
            //
            if(A == B && B == C){ System.out.println("TRIANGULO EQUILATERO"); }
            //
            if((B == A && A != C)|| (A == C && C != B) || (C == B && B != A)){
		System.out.println("TRIANGULO ISOSCELES"); }
        }
//
        input.close();
    }
}
