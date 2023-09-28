import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int T, i, j;
        double Sum = 0.0, Aver = 0.0;
        char Char;
        // Didimentional Array
        double [][] M = new double[12][12];
        // Read Column Number and Character Operation
        T = input.nextInt();
        Char = input.next().toUpperCase().charAt(0);
        // Input
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[i].length; j++){
                M[i][j] = input.nextDouble();
            }
        }
        // Green Column Sum
        for(i = 0; i < M.length; i++){
            Sum += M[i][T];
        }
        // Output
        switch(Char){
            case 'S':
                System.out.printf("%.1f\n",Sum);
            break;
            case 'M':
                Aver = Sum/M.length;
                System.out.printf("%.1f\n",Aver);
            break;
        }
        input.close();
    }
}
