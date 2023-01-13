#include <stdio.h>

int main()
{
    int a = 1, sum = 0, n;
    printf(" enter the number to get  natural numbers : \n");
    scanf("%d", &n);
    while (a <= n)
    {

        printf("%d \n", a);
        sum = sum + a;
        a++;
    }
    printf("the sum of given number is %d", sum);
    return 0;
}