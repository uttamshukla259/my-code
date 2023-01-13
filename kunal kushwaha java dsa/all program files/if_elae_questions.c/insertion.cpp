#include <iostream>
using namespace std;
void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        /* code */
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main()
{
    int arr[1000];
    cout << "enter the initIAL size of array=";
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        /* code */
        cin >> arr[i];
    }
    display(arr, n);
    int k;
    cout << "enter the number of elements to added at last=";
    cin >> k;
    k += n;
    while (n < k)
    {
        cin >> arr[n];
        /* code */
        n++;
    }

    display(arr, n);
    return 0;
}