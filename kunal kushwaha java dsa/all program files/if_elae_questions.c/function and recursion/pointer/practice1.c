#include <stdio.h>

int main()
{
    int a = 6;
    int *ptr;
    ptr = &a;
    printf("the value of a is %d\n", a);
    printf("the addrerss of a is %u\n", ptr);
    printf("the addrerss of a is %d\n", *ptr);

    return 0;
}