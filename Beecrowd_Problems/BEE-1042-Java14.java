import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int A, B, C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        // Array Exemple
        int[] Sort = new int[3];
        Sort[0] = A;
        Sort[1] = B;
        Sort[2] = C;
        Arrays.sort(Sort);
        //
        for(int i = 0; i < Sort.length; i++){
            System.out.println(Sort[i]);
        }
        System.out.println("\n"+ A + "\n" + B + "\n" + C);
        //
        input.close();
    }
}
