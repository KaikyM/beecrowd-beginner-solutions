import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        boolean flag = false;
        while(flag == false){
            String[] Values = input.nextLine().split(" ");
            int X = Integer.parseInt(Values[0]);
            int Y = Integer.parseInt(Values[1]);
            //
            if(X != 0 && Y != 0){
                if(X > 0.0 && Y > 0.0){ System.out.println("primeiro"); }
                else if(X < 0.0 && Y > 0.0){ System.out.println("segundo"); }
                else if(X < 0.0 && Y < 0.0){ System.out.println("terceiro"); }
                else if(X > 0.0 && Y < 0.0){ System.out.println("quarto"); }
            }else{ flag = true; }
        }
        input.close();
    }
}
