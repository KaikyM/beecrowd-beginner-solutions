import java.io.IOException;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        DecimalFormat DF = new DecimalFormat("0.0");
        //
        double I = 0, J = 1;
        while(I <= 2){
            for(int k = 0; k < 3; k++){
                if(DF.format(I).endsWith("0")){
                    System.out.println("I=" + DF.format(I).substring(0, 1) + " J=" + DF.format(J).substring(0, 1));
                }else{
                    System.out.println("I=" + DF.format(I) + " J=" + DF.format(J));
                }
                J++;
            }
            J -= 3;
            J += 0.2;
            I += 0.2;
        }
    }
}
