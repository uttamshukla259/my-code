#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "enter array size" << endl;
    cin >> n;
    int arr[n];
    cout << "enter element" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 1 + i; j < n; j++)
        {
            if (arr[i] < arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
        // cout << "the first largest element in the array  :"
        //      << " " << arr[0] << endl;
        // cout << "the 2nd largest element in the array  :"
        //      << " " << arr[1] << endl;
        // break;
        // if(arr)
    }
    cout << endl;
    cout << arr[0] + arr[1];

    return 0;
}