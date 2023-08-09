import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int I = 1, J = 7;
        while(I <= 9){
            for(int k = 0; k < 3; k++){
                System.out.printf("I=%d J=%d\n",I ,J);
                J--;  
            }
            J += 5;
            I += 2;
        }
    }
}
