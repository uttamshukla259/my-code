#include <stdio.h>
float fer(float cel);

int main()
{
    float cel;
    printf("enter celcius to convert into ferhnhite  \n");
    scanf("%d", &cel);
    printf("celcius is %d \n", fer(cel));

    return 0;
}
float fer(float cel)
{
    float fer;
    fer = (cel * 9.5) + 32;
    return fer;
}