import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int startime, endtime, resultime;
        //
        startime = input.nextInt();
        endtime = input.nextInt();
        //
        if(startime < endtime){
            resultime = endtime - startime;
        }else{
            resultime = (24 - startime) + endtime;
        }
        //
        System.out.println("O JOGO DUROU " + resultime + " HORA(S)");
        //
        input.close();
    }
}
