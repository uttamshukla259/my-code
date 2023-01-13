#include <stdio.h>

int main()
{
    int n = 45, prime = 1, i;
    for (i = 2; i < n; i++)
    {
        if (n % 2 == 0)
        {
            prime = 0;
            break;
        }
    }
    if (prime == 0 && n != 2)
    {
        printf("%d is not prime number \n");
    }
    else
    {
        printf("%d is prime number \n");
    }
    return 0;
}