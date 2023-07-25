import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int startH, startM, endH, endM, Dif;
        //
        startH = input.nextInt();
        startM = input.nextInt();
        endH = input.nextInt();
        endM = input.nextInt();
        //
        Dif = ((endH * 60) + endM) - ((startH * 60) + startM);
        //
        if(Dif <= 0){
            Dif += 24*60;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", Dif / 60, Dif % 60);
        //
        input.close();
    }
}
