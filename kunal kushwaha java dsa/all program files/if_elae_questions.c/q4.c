// wap to check the given number is negative or possative
#include <stdio.h>

int main()
{
    int num;
    printf("enter the number to check the given number is possative or negative \n");
    scanf("%d", &num);
    if (num > 0)
        printf("%d is possative number \n ", num);
    else
        printf("%d is negative number \n", num);
    return 0;
}