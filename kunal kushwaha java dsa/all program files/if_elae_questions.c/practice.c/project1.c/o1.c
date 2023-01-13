#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int num, guess, nguesses = 1;
    srand(time(0));
    num = rand() % 100 + 1;
    // printf("the number is %d \n", num);
    do
    {
        printf("guess the number b/w 1 to 100 \n");
        scanf("%d", &guess);
        if (guess > num)
        {
            printf("lower number please \n");
        }
        else if (guess < num)
        {
            printf("highwer number please \n ");
        }
        else
        {
            printf("you guessed it in %d attempet \n ", nguesses);
        }
        nguesses++;
    } while (guess != num);

    return 0;
}