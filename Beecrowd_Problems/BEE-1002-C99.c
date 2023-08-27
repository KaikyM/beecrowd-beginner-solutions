#include <stdio.h>
#include <math.h>
int main() {
    double Radius;
    scanf("%lf", &Radius);
    
    double Pi = 3.14159;
    double Area = Pi * pow(Radius, 2);
    
    printf("A=%.4f\n", Area);
}
