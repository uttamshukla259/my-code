#include <iostream>
using namespace std;
int main()
{
    int n;


    
    cin >> n;
    // for (int i = 0; i <= n; i++)
    {
        if (n > 0)
        {
            cout << n << " : is possitive number" << endl;
        }
        else if (n < 0)
        {
            cout << n << " : is negative number" << endl;
        }
        if (n == 0)
        {
            cout << n << " : is zero number " << endl;
        }
    }

    return 0;
}