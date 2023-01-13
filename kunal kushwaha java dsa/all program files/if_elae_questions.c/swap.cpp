#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int sum =0;
    for (int i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }
    int p = 0;
    while(sum !=0){
        sum = sum % 10;
        p = p + sum;
        sum = sum / 10;
    }
    cout << p << " ";

    return 0;
}