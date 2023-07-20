#include <stdio.h>
int main(){
    float A, B, C, triangle, trapezium;
    
    scanf("%f %f %f", &A, &B, &C);
    
    if((A < B + C) && (B < A + C) && (C < A + B)){
        triangle = A + B + C;
        printf("Perimetro = %.1lf\n", triangle);
    }else{
        trapezium = ((A + B) * C) / 2;
        printf("Area = %.1lf\n", trapezium);
    }
    return 0;
}
