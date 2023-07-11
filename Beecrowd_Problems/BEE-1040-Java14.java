import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in);
        //
        float N1, N2, N3, N4, Av, N5, AvT;
        N1 = S.nextFloat();
        N2 = S.nextFloat();
        N3 = S.nextFloat();
        N4 = S.nextFloat();
        //
        Av = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", Av);
        //
        if(Av >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(Av <= 4.9){
            System.out.println("Aluno reprovado.");
        }else if(Av >= 5.0 && Av <= 6.9){
            N5 = S.nextFloat();
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", N5);
            AvT = (N5 + Av) / 2;
            if(AvT >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", AvT);
        }
        //
        S.close();
    }
}
