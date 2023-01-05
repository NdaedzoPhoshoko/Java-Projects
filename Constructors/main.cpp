#include <iostream>
using namespace std;

class myClass
{
    public:
    int b;
    myClass(string name)
    {
        cout << name;
        
    }
};
int main()
{
    myClass object("Hy there"); //declaring this object will cause running of the constructor

    return 0;
}