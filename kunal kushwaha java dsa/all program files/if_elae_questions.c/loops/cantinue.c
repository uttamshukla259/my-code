#include <stdio.h>

int main()
{
    int a = 0, skip = 5;
    while (a < 10)
    {
        a++;
        if (a != skip)
        {
            continue;
        }
        else
        {
            printf("%d\n", a);
        }
    }

    return 0;
}