#include <stdio.h>
#include <stdbool.h>
int main() {
    bool A = false;
    int Password = 2002;
    while(A == false){
            int N; 
            scanf("%d", &N);
            if(N == Password){
                printf("Acesso Permitido\n");
                A = true;
            }else{
                printf("Senha Invalida\n");
            }
        }
    return 0;
}
