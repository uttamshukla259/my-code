#include <stdio.h>
void printArray(int *ptr, int n)
{
    for (int i = 0; i < n; i++)
        printf("the value of element %d is %d  \n", i + 1, *(ptr + i));
}
int main()
{
    int arr[] = {12, 41, 85, 85};
    printArray(arr, 4);

    return 0;
}