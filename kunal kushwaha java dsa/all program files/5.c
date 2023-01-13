#include <stdio.h>

int main()
{
    int rating;
    printf("enter your rating if you like this app \n");
    scanf("%d", &rating);
    switch (rating)
    {
    case 1:
        printf("your rating is * %d \n", rating);
        break;
    case 2:
        printf("your rating is ** %d \n", rating);
        break;
    case 3:
        printf("your rating is *** %d \n", rating);
        break;
    case 4:
        printf("your rating is **** %d \n", rating);
        break;
    case 5:
        printf("your rating is ***** %d \n", rating);
        break;
    default:
        printf("your rating is invalid \n");
        break;
    }

    return 0;
}