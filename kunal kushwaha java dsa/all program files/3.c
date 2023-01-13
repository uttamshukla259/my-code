#include <stdio.h>

int main()
{
    int a;
    printf("enter a number to check wather a number is even or odd\n ");
    scanf("%d", &a);
    if (a % 2 == 0)

    {
        printf("%d number is even \n", a);
    }
     else
     {
     printf("number is odd \n");
     }

    return 0;
}