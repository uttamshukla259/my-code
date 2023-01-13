#include <stdio.h>

int main()
{
    int a = 0;
    do
    {
        printf("the value of a is %d \n", a);
        if (a == 300)
        {
            break;
        }
        a++;
    }

    while (a <= 3000);
    return 0;
}