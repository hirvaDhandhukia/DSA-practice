#include <iostream>
#include <deque>
using namespace std;

int main() {
    
    deque<int> d;

    d.push_back(1);
    d.push_front(2);

    for(int i:d) {
        cout << i << " ";
    } cout << endl;

    // d.pop_back();
    // d.pop_front();

    cout << "Print ele at 1st index: " << d.at(1) << endl;
    cout << "front " << d.front() << endl;
    cout << "back " << d.back() << endl;

    cout << "Size before erase: " << d.size() << endl;
    d.erase(d.begin(), d.begin()+1);
    cout << "Size after erase: " << d.size() << endl;

    return 0;
}