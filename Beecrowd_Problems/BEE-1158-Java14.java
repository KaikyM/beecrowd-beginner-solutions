import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int X = 0, Y = 0, i, j, k;
        //
        int N = input.nextInt();
        input.nextLine();
        for(i = 0; i < N; i++){
            int sum = 0;
            String [] Values = input.nextLine().split(" ");
            X = Integer.parseInt(Values[0]);
            Y = Integer.parseInt(Values[1]);
            //
            for (j = X, k = 0; k < Y; j++) {
				        if (j % 2 != 0) {
					      sum += j;
					      k += 1;
				        }
			      }
			  //
			  System.out.println(sum);
        }
        //
        input.close();
    }
}
