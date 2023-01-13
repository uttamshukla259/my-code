#include <stdio.h>

int main()
{
    int a = 1, sum;
    while (a < 10)
    {

        a++;
        // sum = sum + a;
        printf("%d ia natural number\n", a, sum);
        sum = sum + a;
        // printf("%d ia natural number\n", sum);
    }

    return 0;
}