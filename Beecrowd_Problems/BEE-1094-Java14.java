import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("0.00");
        // Variables
        int Total = 0, TC = 0, TR = 0, TS = 0;
        double PerC = 0.0, PerR = 0.0, PerS = 0.0;
        String FPerC, FPerR, FPerS;
        // Input
        int N = input.nextInt();
        input.nextLine();
        // Interpretation
        for(int i = 0; i < N; i++){
            String[] Animal = input.nextLine().split(" ");
            //
            int Amont = Integer.parseInt(Animal[0]);
            char Type = Animal[1].toUpperCase().charAt(0);
            //
            switch(Type){
                case 'C': TC += Amont; break;
                case 'R': TR += Amont; break;
                case 'S': TS += Amont; break;
            }
        }
        // Calculations
	    Total = TC + TR + TS;
        PerC = (double) TC / Total * 100;
        PerR = (double) TR / Total * 100;
        PerS = (double) TS / Total * 100;
	// Formatting
        FPerC = DF.format(PerC);
        FPerR = DF.format(PerR);
        FPerS = DF.format(PerS);
        // Output
        System.out.print("Total: " + Total + " cobaias\n");
        System.out.print("Total de coelhos: " + TC + "\n" 
                         +"Total de ratos: " + TR + "\n"
                         +"Total de sapos: " + TS + "\n");
        System.out.print("Percentual de coelhos: " + FPerC + " %\n" 
                        +"Percentual de ratos: " + FPerR + " %\n" 
                        +"Percentual de sapos: " + FPerS + " %\n");
        //
        input.close();
    }
}
