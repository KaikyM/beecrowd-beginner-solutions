#include <stdio.h>
int main(){
    int High = 0, Pos = 0; 
    //
    for(int i = 1; i <= 100; i++){
        int X;
        scanf("%d",&X);
        if(High < X){
            High = X;
            Pos = i;
        }
    }
    printf("%d\n%d\n", High, Pos);
    //
    return 0;
}
