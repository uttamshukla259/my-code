#include <stdio.h>
int even(int a);

int main()
{
    int a;
    even(a);

    return 0;
}
int even(int a)
{

    for (int a = 0; a <= 12; a++)
    {
        if (a % 2 == 0)
            printf("%d is even number\n", a);
        else
            printf("%d is odd number \n", a);
    }
}