#include <stdio.h>

int main()
{
    int sum = 0, n, a = 0;
    printf("enter the number \n");
    scanf("%d", &n);
    while (a <= 10)
    {
        sum = sum + a;
        a++;
        printf("%d is natural number \n ", a);
    }
    printf(" the sum of all natural number is %d \n", sum);

    return 0;
}