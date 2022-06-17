#include <iostream>
#include <queue>
using namespace std;

int main() {

    // by declaring my pq with this method, the max-heap is created. 
    // i.e. whenever we fetch the poped element it will be the maximum ofall 
    priority_queue<int> pq;

    // min-heap
    priority_queue<int, vector<int>, greater<int>> minpq;

    pq.push(1);
    pq.push(3);
    pq.push(2);
    pq.push(0);
    int num = pq.size();
    cout << num << endl;
    for(int i=0; i<num; i++) {
        cout << pq.top() << " ";
        pq.pop();
    } cout << endl;


    minpq.push(5);
    minpq.push(1);
    minpq.push(0);
    minpq.push(4);
    minpq.push(3);
    int minNum = minpq.size();
    cout << minNum << endl;
    for(int i=0; i<minNum; i++) {
        cout << minpq.top() << " ";
        minpq.pop();
    } cout << endl;

    cout << "is empty or not: " << minpq.empty();
    
    return 0;
}