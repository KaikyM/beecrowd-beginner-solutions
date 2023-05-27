import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sca = new Scanner(System.in);
        //
        Double Pi = 3.14159;
        Double A = Sca.nextDouble();
        Double B = Sca.nextDouble();
        Double C = Sca.nextDouble();
        // Calculation
        Double AreaRT = (A * C) / 2;
        Double AreaCi = Pi * Math.pow(C ,2);
        Double AreaTr = 0.5 * (A + B) * C;
        Double AreaSq = B * B;
        Double AreaRe = A * B;
        //
        System.out.printf("TRIANGULO: %.3f\n", AreaRT);
        System.out.printf("CIRCULO: %.3f\n", AreaCi);
        System.out.printf("TRAPEZIO: %.3f\n", AreaTr);
        System.out.printf("QUADRADO: %.3f\n", AreaSq);
        System.out.printf("RETANGULO: %.3f\n", AreaRe);
        //
        Sca.close();
    }
}
