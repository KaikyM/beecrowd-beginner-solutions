import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int i, j;
        double Sum = 0.0, Aver = 0.0;
        char O;
        // Didimentional Array
        double [][] M = new double[12][12];
        // Character Operation
        O = input.next().toUpperCase().charAt(0);
        // Input
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[i].length; j++){
                M[i][j] = input.nextDouble();
            }
        }
        // Above the Secundary Green Area Sum
        for(i = 0; i < M.length; i++){
            for(j = 0; j < M[i].length; j++){
        	    if(j < M.length - i - 1){ Sum += M[i][j]; }
        	}
        }
        // Output
        switch(O){
            case 'S':
                System.out.printf("%.1f\n",Sum);
            break;
            case 'M':
                // Aver = Sum / 66;
                Aver = Sum / ( ( (M.length * M.length) - 12) / 2);
                System.out.printf("%.1f\n",Aver);
            break;
        }
        input.close();
    }
}
