#include <iostream>
using namespace std;
int main()
{
    cout << "enter the array size " << endl;
    int n;
    cin >> n;
    cout << "eneter the element which you want to find in the index" << endl;
    int k;
    cin >> k;
    cout << "enter the element in the arry " << endl;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++)
    {
        if (arr[i] == k)
        {
            cout << k << ": is present in the array";
        }
    }
    return 0;
}