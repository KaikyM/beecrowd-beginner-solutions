import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sca = new Scanner(System.in);
        //
        Double A = Sca.nextDouble();
        Double B = Sca.nextDouble();
        Double C = Sca.nextDouble();
        //
        Double Delta = Math.sqrt(Math.pow(B, 2) - (4*A*C));
        Double Div = 2*A;
        Double X1 = (-B + Delta)/(Div);
        Double X2 = (-B - Delta)/(Div);
        //
        if(Delta >= 0 & Div != 0){
	          System.out.printf("R1 = %.5f\n",X1);
            System.out.printf("R2 = %.5f\n",X2);
        } else {
	          System.out.println("Impossivel calcular");
	          return;
        }
        //
        Sca.close();
    }
}
