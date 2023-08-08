import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int J = 60, I = 1;
        while(J >= 0){
            System.out.printf("I=%d J=%d\n",I ,J);
            J += -5;
            I += 3;
        }
    }
}
