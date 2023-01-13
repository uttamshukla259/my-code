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
    cout << "enter the initital value of n";

    cin >> count;
    for (int i = 0; i < count; i++)
    {
        cin >> arr[i];
        /* code */
    }
    display(arr, count);
    cout << "enter the number of element to be added=";
    int n;
    cin >> n;
    for (int j = 0; j < n; j++)
    {

        for (int i = count; i >= 0; i--)
        {
            arr[i + 1] = arr[i];
        }
        cin >> arr[0];

        count++;
    }
    display(arr, count);
    return 0;
}