#include <stdio.h>
int sum(int a, int b);

int main()
{
    int a, b;
    printf("enter the value of a \n");
    scanf("%d", &a);
    printf("enter the value of b \n");
    scanf("%d", &b);
    printf("the addation  of a and b is %d ", sum(a, b));

    return 0;
}
int sum(int a, int b)
{
    int add;
    add = a + b;
    return add;
}
