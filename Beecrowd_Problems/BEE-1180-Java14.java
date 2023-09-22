import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int pos = 0, lowest = 0;
        //
        int N = input.nextInt();
        int [] X = new int[N];
        //
        X[0] = input.nextInt();
        lowest = X[0]; 
        //
        for(int i = 1; i < X.length; i++){
            X[i] = input.nextInt();
            if(X[i] < lowest){
                lowest = X[i];
                pos = i;
            }
        }
        System.out.println("Menor valor: " + lowest + "\nPosicao: " + pos);
        //
        input.close();
    }
}
