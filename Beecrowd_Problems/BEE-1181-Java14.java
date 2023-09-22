import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int L, i, j;
        double Sum = 0.0, Aver = 0.0;
        char Char;
        // Didimentional Array
        double [][] M = new double[12][12];
        // Read Line Number and Character Operation
        L = input.nextInt();
        Char = input.next().toUpperCase().charAt(0);
        // Input
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[i].length; j++){
                M[i][j] = input.nextDouble();
            }
        }
        // Green Line Sum
        for(i = 0; i < M.length; i++){
            Sum += M[L][i];
        }
        // Output
        switch(Char){
            case 'S':
                System.out.println(Sum);
            break;
            case 'M':
                Aver = Sum / M.length;
                System.out.println(Aver);
            break;
        }
        input.close();
    }
}
