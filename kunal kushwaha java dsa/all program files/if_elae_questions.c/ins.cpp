#include<iostream>
using namespace std;
void display(int arr[], int n)
{
    for (int i = 0; i < n;i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main()
{
    int arr[100];
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n;i++)
    {
        cin >> arr[i];
    }
    display(arr, n);
    cout<<"delete the element of the last to added in the array "<<endl;
    int k;
    cin >> k;
    int p;
    p = 0;
    for (int i = k; i < n;i++){
        arr[p] = arr[i];
        p++;
    }
    n = n - k;
    display(arr, n);
    return 0;
}