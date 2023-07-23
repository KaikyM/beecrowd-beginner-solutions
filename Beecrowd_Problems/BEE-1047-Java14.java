import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        int startH, startM, endH, endM, resultH, resultM;
        //
        startH = input.nextInt();
        startM = input.nextInt();
        endH = input.nextInt();
        endM = input.nextInt();
        //
        resultH = endH - startH;
        resultM = endM - startM;
        //
        if(startH == endH && startM == endM){
            resultH = 24;
        }else{
            if(resultH < 0){
                resultH = 24 + (endH - startH);
            }
            if(resultM < 0){
                resultM = 60 + (endM - startM);
                resultH--;
            }
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", resultH, resultM);
        //
        input.close();
    }
}
