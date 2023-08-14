import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        boolean Stop = false;
        int Al = 0, Ga = 0, Di = 0; 
        //
        while(Stop == false){
            int N = input.nextInt();
            switch(N){
                case 1: Al++; break;
                case 2: Ga++; break;
                case 3: Di++; break;
                case 4: Stop = true;
            }
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n",Al ,Ga ,Di);
        //
        input.close();
    }
}
