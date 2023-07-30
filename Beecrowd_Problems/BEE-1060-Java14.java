import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int positives = 0;
        //
        for(int i = 0; i < 6; i++){
            double numbers = input.nextDouble();
            if(numbers > 0){ positives++; }
        }
        //
        System.out.printf("%d valores positivos\n", positives);
        //
        input.close();
    }
}
