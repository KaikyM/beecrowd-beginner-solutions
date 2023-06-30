import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in);
        //
        int km = S.nextInt();
        //
        int minute = (60 * km)/30;
        //
        System.out.println(minute + " minutos");
        //
        S.close();
    }
}
