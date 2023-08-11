import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        boolean A = false;
        int Password = 2002;
        while(A == false){
            int N = input.nextInt();
            if(N == Password){
                System.out.println("Acesso Permitido");
                A = true;
            }else{
                System.out.println("Senha Invalida");
            }
        }
        //
        input.close();
    }
}
