import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //
        String A, B, C;
        A = input.next();
        B = input.next();
        C = input.next();
        //
        if(A.equalsIgnoreCase("vertebrado")){
            //
            if(B.equalsIgnoreCase("ave")){
                if(C.equalsIgnoreCase("carnivoro")){System.out.println("aguia");}
                //
                if(C.equalsIgnoreCase("onivoro")){System.out.println("pomba");}
                //
            }else if(B.equalsIgnoreCase("mamifero")){
                if(C.equalsIgnoreCase("onivoro")){System.out.println("homem");}
                //
                if(C.equalsIgnoreCase("herbivoro")){System.out.println("vaca");}
                //
            }
        }else if(A.equalsIgnoreCase("invertebrado")){
            //
            if(B.equalsIgnoreCase("inseto")){
                if(C.equalsIgnoreCase("hematofago")){System.out.println("pulga");}
                //
                if(C.equalsIgnoreCase("herbivoro")){System.out.println("lagarta");}
                //
            }else if(B.equalsIgnoreCase("anelideo")){
                if(C.equalsIgnoreCase("hematofago")){System.out.println("sanguessuga");}
                //
                if(C.equalsIgnoreCase("onivoro")){System.out.println("minhoca");}
                //
            }
        }
        //
        input.close();
    }
}
