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
    int count;
    cin >> count;

    for (int i = 0; i < count; i++)
    {
        cin >> arr[i];
        /* code */
    }
    display(arr, count);
    int pos, element;
    cout << "enter the index at which element is to be added=";
    cin >> pos;
    cout << "enter the element to be added=";
    cin >> element;
    for (int i = count; i >= pos; i--)
    {
        arr[i + 1] = arr[i];
    }
    arr[pos] = element;
    count++;
    display(arr, count);
    return 0;
}