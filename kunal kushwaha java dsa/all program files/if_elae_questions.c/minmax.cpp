#include <iostream>
#include <climits>
using namespace std;
int main()
{
    int minimum = INT_MAX;
    int maximum = INT_MIN;
    int n;
    cin >> n;
    int arr[n];
    cout << minimum << endl;
    cout << maximum << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        minimum = min(arr[i], minimum);
        maximum = max(arr[i], maximum);
    }
    cout << minimum << endl;
    cout << maximum << endl;
    cout << maximum / minimum;
    return 0;
}