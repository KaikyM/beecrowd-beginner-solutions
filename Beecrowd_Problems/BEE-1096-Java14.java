import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int I = 1;
        while(I <= 9){
            int J = 7;
            for(int i = 0; i < 3; i++){
                System.out.printf("I=%d J=%d\n",I ,J);
            	J--; 
            }
       	    I += 2;
        }
    }
}
