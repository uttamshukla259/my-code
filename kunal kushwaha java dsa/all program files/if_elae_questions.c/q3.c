// wap to check given year is leep yer or not
#include <stdio.h>

int main()
{
    int year;
    printf("enter the year to check the given year is leep year or not \n");
    scanf("%d", year);
    if (year % 400 == 0)
        printf("%d is leep year \n", year);
    else if (year % 100 == 0)
        printf("%d is not leep year \n ", year);
    else if (year % 4 == 0)
        printf("%d is leep year \n", year);
    else
        printf("%d is not leep year \n", year);

    return 0;
}