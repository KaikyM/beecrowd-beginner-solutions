import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X, cont;
	    int N = input.nextInt();
        //
        for(int i = 0; i < N; i++){
            cont = 0;
            X = input.nextInt();
            for(int j = 2; j < X; j++){
        		if((X % j) == 0){cont++;}
        	}
        	if(cont == 0){
        	    System.out.println(X + " eh primo");
        	}else{
        	    System.out.println(X + " nao eh primo");
        	}
        }
        //
        input.close();
    }
}
