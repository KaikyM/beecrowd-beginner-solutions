#include <stdio.h>
#include <math.h>
int main() {
    double A, B , C, Delta = 0, X1 = 0, X2 = 0;
    
    scanf("%lf %lf %lf", &A, &B, &C);
    
    Delta = sqrt(pow(B, 2) - (4 * A * C));
    
    if(Delta >= 0 && A != 0){
        X1 = (-B + Delta) / (2 * A);
        X2 = (-B - Delta) / (2 * A);
        printf("R1 = %.5lf\n", X1);
        printf("R2 = %.5lf\n", X2);
    }else{
        printf("Impossivel calcular\n");
        return 0;
    }
}
