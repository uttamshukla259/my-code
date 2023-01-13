// wap a program top verify person is able or not for vote
#include <stdio.h>

int main()
{
    int age;
    printf("enter the age of voter \n");
    scanf("%d", &age);
    if (age >= 18)
        printf(" %d you are able to vote \n", age);
    else if (age < 18)
    {
        printf("sorry your age is %d you are not able for vote \n ", age);
    }

    return 0;
}