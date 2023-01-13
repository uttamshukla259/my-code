#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    // for (int j = 2; j <= n; j++)
    // {
    //     bool flag = true;
    //     for (int i = 2; i < j; i++)
    //     {
    //         if (j % i == 0)
    //         {
    //             flag = false;
    //             break;
    //         }
    //     }
    //     if (flag)
    //     {
    //         cout << j << " ";
    //     }
    // }
    for (int i = 2; i <= n;i++){
        if(n%i == 0){
            cout << " yes" << endl;
        }
        // else {
        //     cout << "not prime" << endl;
        // }
    }
    
        return 0;
}