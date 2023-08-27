#include <stdio.h>
#include <math.h>
int main(){
    int N;
    //
    scanf("%d", &N);
    //
    for(int i = 1; i <= N; i++){
        int j = pow(i, 2);
        int k = pow(i, 3);
        printf("%d %d %d\n",i ,j ,k);
    }
}
