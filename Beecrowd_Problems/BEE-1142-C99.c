#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    int i = 0, j = 0;
    while(j < N){
        j++;
        printf("%d %d %d PUM\n",(i + 1) ,(i + 2) ,(i + 3));
        i += 4;
    }
    return 0;
}
