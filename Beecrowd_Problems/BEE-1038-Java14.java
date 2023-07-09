import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner Scan = new Scanner(System.in);
        //
        int X = Scan.nextInt();
        int Y = Scan.nextInt();
        Double TP;
        //
        switch(X){
            case 1:
                TP = 4.00 * Y;
                System.out.printf("Total: R$ %.2f\n", TP);
                break;
            case 2:
                TP = 4.50 * Y;
                System.out.printf("Total: R$ %.2f\n", TP);
                break;
            case 3:
                TP = 5.00 * Y;
                System.out.printf("Total: R$ %.2f\n", TP);
                break;
            case 4:
                TP = 2.00 * Y;
                System.out.printf("Total: R$ %.2f\n", TP);
                break;
            case 5:
                TP = 1.50 * Y;
                System.out.printf("Total: R$ %.2f\n", TP);
                break;
            // The Default case:
//            default:
//                System.out.println("You chose an order off the Menu!");
//                break;
        }
        //
        Scan.close();
    }
}
