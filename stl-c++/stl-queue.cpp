#include <iostream>
#include <queue>
using namespace std;

int main() {

    queue<string> q;

    q.push("hirva");
    q.push("dhandhukia");
    q.push("last ele");

    cout << "size before pop: " << q.size() << endl;
    cout << "front " << q.front() << endl;
    cout << "back " << q.back() << endl;


    q.pop();
    cout << "size after pop: " << q.size() << endl;
    cout << "front " << q.front();

    return 0;
}