#include <stdio.h>

int main()
{
    int marks[4];
    printf("inter the the marks of student 1st:");
    scanf("%d", &marks[0]);
    printf("inter the the marks of student 2st:");
    scanf("%d", &marks[1]);
    printf("inter the the marks of student 3st:");
    scanf("%d", &marks[2]);
    printf("inter the the marks of student 4st:");
    scanf("%d", &marks[3]);
    printf("the marks of student is %d %d %d and %d", marks[0],
           marks[1], marks[2], marks[3]);
    return 0;
}