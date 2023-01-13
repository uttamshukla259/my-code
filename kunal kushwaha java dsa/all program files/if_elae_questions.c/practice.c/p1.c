#include <stdio.h>

int main()
{
    int n, a;
    printf("enter the number to get the table \n");
    scanf("%d", &n);
    for (a = 10; a >= 1; a--)

    {
        printf("%d x %d = %d \n\n", n, a, n * a);
    }

    return 0;
}