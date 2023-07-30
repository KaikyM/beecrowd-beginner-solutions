import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int positives = 0;
        double average = 0.0;
        //
        for(int i = 0; i < 6; i++){
            double numbers = input.nextDouble();
            if(numbers > 0){
                average = average + numbers;
                positives++;
            }
        }
        //
        System.out.printf("%d valores positivos\n%.1f\n", positives, average / positives);
        //
        input.close();
    }
}
