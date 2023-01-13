#include <iostream>
using namespace std;
int main()
{
    int avg;
    int n;
    cin >> n;
    int marks1;
    int marks2;
    int marks3;
    cin >> marks1;
    cin >> marks2;
    cin >> marks3;
    avg = (marks1 + marks2 + marks3) / n;
    cout << avg << " " << endl;

    return 0;
}
