#include <stdio.h>
#include <stdbool.h>
int main(){
    bool Stop = false;
    /**/
    while(Stop != true){
        int N;
        scanf("%d", &N);
        if(N != 0){
            int I = 1;
            while(I < N){
                printf("%d ", I);
                I++;
            }
            printf("%d\n", I);
        }else{
            Stop = true;
        }
    }
}
