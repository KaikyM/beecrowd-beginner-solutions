import java.io.IOException;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
      //
      int A = input.nextInt();
      int N = input.nextInt();
      int sum = 0;
      //
      while(N <= 0){
      	N = input.nextInt();
      }
      for(int i = 1; i <= N; i++){
      	sum += A;
      	A++;
      }
      //
      System.out.println(sum);
      //
      input.close();
  }
}
