import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        //
        int Ns = Sc.nextInt();
        //
        int Hour = Ns / 3600;
        Ns = Ns % 3600;
        int Minute = Ns / 60;
        Ns = Ns % 60;
        int Second = Ns;
        //
        System.out.printf("%d:%d:%d%n", Hour, Minute, Second);
        //
        Sc.close();
    }
}
