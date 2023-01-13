#include <stdio.h>

int main()
{
    float height;
    printf("enter your height :\n");
    scanf("%f", &height);
    if (height < 150.0)
    {
        printf("the person is dwarf \n");
    }
    else if (height >= 150.0 && height < 165.0)
    {
        printf("average height \n");
    }
    else if (height >= 165.0 && height < 175.0)
    {
        printf("you are tall \n");
    }
    else
    {
        printf(" you are abnormal \n");
    }
    return 0;
}