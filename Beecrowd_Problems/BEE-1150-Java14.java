import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = input.nextInt();
        int Z = input.nextInt();
        int cont = 0;
        int sum = 0;
        //
        while(Z <= X){
        	Z = input.nextInt();
        }
        while(sum < Z){
        	sum += X;
        	cont++;
        	X++;
        }
        //
        System.out.println(cont);
        //
        input.close();
    }
}
