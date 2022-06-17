#include <iostream>
#include <stack>
using namespace std;

int main() {

    stack<string> s;

    s.push("hirva");
    s.push("dhandhukia");
    s.push("last ele");

    cout << "top ele before pop: " << s.top() << endl;
    s.pop();
    cout << "top ele after pop: " << s.top() << endl;

    cout << "size: " << s.size() << endl;
    cout << "is empty or not: " << s.empty();

    return 0;
}