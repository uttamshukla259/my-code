// wap to check wather a given number is odd or even
#include <stdio.h>

int main()
{
    int num;
    printf("check the given number is odd or even \n");
    printf("enter the number to check the  given number is odd or even \n");
    scanf("%d", &num);
    if (num % 2 == 0)
        printf("%d is even number\n", num);
    else
        printf("%d is odd number \n", num);

    return 0;
}