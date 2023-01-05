#include <iostream>
using namespace std;

//create a class called box
class Box
{
    public: //access specifier
    int dataMember; //data member

    void myF(); //method
};

int main()
{
    Box myObject, myObject2, myObject3; //create an object of class box
    //object is used to access data member and method in class
    myObject.dataMember = 10;
    myObject2.dataMember = 30;

    return 0;
}

//but this is c++ isnt it? Lets take a look at how we achieve all this in java