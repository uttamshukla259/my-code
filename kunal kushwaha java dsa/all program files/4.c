#include <stdio.h>

int main()
{
    int age;
    int vip = 12;
    printf("ente age to check u r able or not for diving thr car\n");
    scanf("%d", &age);
    if (age >= 70 || age <= 18)
    {
        printf("yr age is %d and u r not able to drive the car  \n", age);
    }
    else
    {
        printf(" your age is %d and u r able to drive the car \n", age);
    }
    // if (vip <= 17)
    // {
    printf(" but u have vip pass and your age is above %d and u r able to drive the car \n", vip);
    // }

    return 0;
}