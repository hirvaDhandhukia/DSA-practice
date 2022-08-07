#include <bits/stdc++.h>
using namespace std;

void maxTilli(int arr[], int n) {

    int mx = INT_MIN;
    for(int i=0; i<n; i++) {
        arr[i+1] = max(arr[i], arr[i+1]);
    }
    for(int i=0; i<n; i++) {
        cout << arr[i]<< " ";
    }

}

void sumOfEachSubarray(int arr[], int n) {

    int curr = 0;
    for(int i=0; i<n; i++) {
        curr = 0;
        for(int j=i; j<n; j++) {
            curr += arr[j];
            cout << curr << " ";
        }
    }
}

void longestArithmeticSubarray(int a[], int n) {

    int currDiff = a[1]-a[0];
    int currLength = 2;
    int maxLength = 2;
    for(int i=2; i<n; i++) {
        // new subarray 
        if(currDiff != a[i]- a[i-1]) {
            currDiff = a[i]-a[i-1];
            currLength = 2;
        }
        // same subarray (i.e. no change in currDiff)
        else if (currDiff == a[i] - a[i-1]) {
            currLength++;
        }
        maxLength = max(maxLength, currLength);
    }

    cout << endl << maxLength;

}

// O(n)
void recordBreakingDay(int a[], int n) {

    int ansRBD = 0;
    int totalNumRBD = 0;
    for(int i=0; i<n; i++) {
        if(n==1) {
            cout << "1" << endl;
            return;
        }
        // checking both conditions are true
        if(ansRBD < a[i] && a[i]>a[i+1]) {
            ansRBD = a[i];
            totalNumRBD++;
            cout << ansRBD << " ";
        }
    }
    cout << endl << totalNumRBD;

}

int main() {

    int n; cin>>n;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin>> arr[i];
    }

    // maxTilli(arr, n);
    // sumOfEachSubarray(arr, n);
    // longestArithmeticSubarray(arr, n);
    recordBreakingDay(arr, n);

    return 0;
}