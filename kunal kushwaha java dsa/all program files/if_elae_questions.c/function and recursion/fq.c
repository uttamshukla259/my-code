#include <stdio.h>
float average(int a, int b, int c);

int main()
{
    int a, b, c;
    printf(" inter the value of a \n");
    scanf("%d", &a);
    printf(" inter the value of b \n");
    scanf("%d", &b);
    printf(" inter the value of c \n");
    scanf("%d", &c);
    printf("the value of avg is %f", average(a, b, c));

    return 0;
}
float average(int a, int b, int c)
{
    float result;
    result = (float)(a + b + c) / 3;
    return result;
}