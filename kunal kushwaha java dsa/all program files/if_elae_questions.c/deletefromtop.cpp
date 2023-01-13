#include <iostream>
using namespace std;
void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main()
{
    int arr[1000];
    cout << "enter the array size" << endl;
    int count;
    cin >> count;
    cout << "enter the ellements of array" << endl;
    for (int i = 0; i < count; i++)
    {
        cin >> arr[i];
    }
    display(arr, count);
    cout << "enter the number  of elements to be delted from last=";
    int k;
    cin >> k;
    int p = 0;
    for (int i = k; i < count; i++)
    {
        arr[p] = arr[i];
        p++;
    }
    count -= k;
    display(arr, count);
    return 0;
}