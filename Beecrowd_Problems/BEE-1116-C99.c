#include <stdio.h>
#include <math.h>
int main(){
    int N, X, Y;
    scanf("%d", &N);

    for(int i = 0; i < N; i++){
        scanf("%d %d", &X, &Y);
      
        if(Y == 0){
            printf("divisao impossivel\n");
        }else{
            float R = (X*1.0) / Y; 
            printf("%.1f\n", R);
        }
    }
}
