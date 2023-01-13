#include <stdio.h>

int main()
{
    int num1, num2, num3;
    printf(" enter the first number \n");
    scanf("%d", &num1);
    printf(" enter the second number \n");
    scanf("%d", &num2);
    // printf("enter the third number \n");
    // scanf("%d", &num3);
    if (num1 > num2)
        printf("%d is grater \n", num1);
    else
        printf("%d is grater  \n", num2);

    return 0;
}