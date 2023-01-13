#include <stdio.h>
#include <math.h>

int main()
{
    int side;
    printf("enter the side of rectangle \n");
    scanf("%d", &side);
    printf("the area of rectangle is %f \n", pow(side, 2));

    return 0;
}