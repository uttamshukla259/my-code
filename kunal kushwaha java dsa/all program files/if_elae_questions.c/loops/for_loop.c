#include <stdio.h>

int main()
{
    int a, n;
    printf("entr the value of n \n");
    scanf("%d", &n);
    for (a = n; a > 0; a--)
    {
        printf("%d is natural number \n", a);
    }
    return 0;
}