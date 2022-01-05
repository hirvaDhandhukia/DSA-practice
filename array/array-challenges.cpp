#include <iostream>
#include <limits.h>
using namespace std;

void maxtilli(int n, int arr[]) {
    // find the maximum number till ith element
    // and print all of them in sequence
    int mx = INT_MIN;
    for(int i=0; i<n; i++) {
        mx = max(mx, arr[i]);
        cout << mx << " "; 
    }
}

void sumSubarray(int n, int arr[]) {
    // given an arr[] of size n. output sum of each subarray of the given array
    int sum=0;
    for(int i=0; i<n; i++) {
        for(int j=i; j<n; j++) {
            sum += arr[j];
            cout << sum << " "; 
        }
    }
}

int main() {
    int n; cin>>n;
    int arr[n]; 
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    // maxtilli(n,arr);
    sumSubarray(n,arr);

    return 0;
}