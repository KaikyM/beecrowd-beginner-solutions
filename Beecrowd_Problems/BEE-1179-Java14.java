import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // Variables
        int contEven = 0, contOdd =0, N;
        // Arrays
        int [] even = new int[5];
        int [] odd = new int[5];
        // Loop Input
        for(int i = 0; i < 15; i++){
            N = input.nextInt();
            if(N % 2 == 0){
                even[contEven] = N;
                contEven++;
            }else{
                odd[contOdd] = N;
                contOdd++;
            }
            // First Output
            if(contEven == 5){
                contEven = 0;
                for (int j = 0; j < even.length; j++) {
        			System.out.println("par[" + j + "] = " + even[j]);
        		}
            }else if(contOdd == 5){
                contOdd = 0;
                for (int j = 0; j < odd.length; j++) {
        			System.out.println("impar[" + j + "] = " + odd[j]);
        		}
            }
        }
        // Second Output
        for(int i = 0; i < contOdd; i++){
            System.out.println("impar[" + i + "] = " + odd[i]);
        }
        for(int i = 0; i < contEven; i++){
            System.out.println("par[" + i + "] = " + even[i]);
        }
        input.close();
    }
}
