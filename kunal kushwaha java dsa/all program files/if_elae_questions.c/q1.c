// wap program to check wather a number1 is equal or numbert2
#include <stdio.h>

int main()
{
    int num1, num2;
    printf("enter 1 st number for equality check \n");
    scanf("%d", &num1);

    printf("enter 2 nd number for equality check \n");
    scanf("%d", &num2);
    if (num1 == num2)
    {
        printf("%d  and %d is equal \n", num1, num2);
    }
    else
    {
        printf("%d and %d is not  equal \n", num1, num2);
    }

    return 0;
}