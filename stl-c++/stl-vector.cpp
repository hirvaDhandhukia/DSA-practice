#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> v;
    cout << v.capacity() << endl;

    v.push_back(1);
    cout << v.capacity() << endl;
    v.push_back(2);
    cout << v.capacity() << endl;
    v.push_back(3);
    cout << v.capacity() << endl;

    cout << "Ele at 2nd index: " << v.at(2) << endl; 

    // pop_back
    cout << "before pop: ";
    for(int i:v) {
        cout << i << " ";
    } cout << endl;

    v.pop_back();
    cout << "after pop: ";
    for(int i:v) {
        cout << i << " ";
    }


    // v.size() gives size of vector (i.e. kitne elements ismai pade huie hai)
    // v.capacity() gives capacity of vector (i.e. kitni space vector ko assign ki gai hai)
    // every time we push_back some element in a vector, if it doesn't have memory to place that ele, it makes it's size into double 
    // i.e. here when we push_back ele '1', vector's capacity got from 0->1;
    // after push_back ele '2', capacity got double i.e. from 1->2;
    // after push_back ele '3', capacity gets from 2->4
    // i.e. even if there are 3 elements in the vector, the actual capacity is 4 at this stage. 

    return 0;
}