#include <stdio.h>

int main()
{
    int a = 1, n;
    printf("enter the number \n");
    scanf("%d", &n);
    do
    {
        printf("%d is natural number  \n ", a);
        a++;
    } while (a <= n);

    return 0;
}