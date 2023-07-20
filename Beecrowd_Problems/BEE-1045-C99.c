#include <stdio.h>
int main(){
    double A, B, C, abc;
//
    scanf("%lf %lf %lf", &A, &B, &C);
//
    if(B > A && B > C){
        abc = A;
        A = B;
        B = abc;
    }else if(C > A){
        abc = A;
        A = C;
        C = abc;
    }
//
    if(A >= B + C){
        printf("NAO FORMA TRIANGULO\n");
    }else{
        if(A*A == B*B + C*C){printf("TRIANGULO RETANGULO\n");}
        //
        if(A*A > B*B + C*C){printf("TRIANGULO OBTUSANGULO\n");}
        //
        if(A*A < B*B + C*C){printf("TRIANGULO ACUTANGULO\n");}
        //
        if(A == B && B == C){printf("TRIANGULO EQUILATERO\n");}
        //
        if((B == A && A != C)|| (A == C && C != B) || (C == B && B != A)){
            printf("TRIANGULO ISOSCELES\n");}
    }
//
    return 0;
}
