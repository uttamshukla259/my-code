#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int k;
    cin >> k;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    for (int j = 0; j < n; j++)
    {
        if (arr[j] == k)
        {
            cout << k << " : is present in te array" << endl;
            // break;
        }
        else
        {
            cout << " : this element is not  present in te array" << endl;
            // break;
        }
    }
    return 0;
}