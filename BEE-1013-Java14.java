import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        //
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();
        // .abs means absolute number !!!
        int AB = (A + B + Math.abs(A - B)) / 2;
        int GreatestABC = (AB + C + Math.abs(AB - C)) / 2;
        //
        System.out.println(GreatestABC + " eh o maior");
        //
        Sc.close();
    }
}
