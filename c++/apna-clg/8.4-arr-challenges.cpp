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

void firstRepeatingEle(int a[], int n) {

    const int N = 1e6+2;
    int idx[N];
    for(int i=0; i<N; i++) {
        idx[i] = -1;
    }

    int minidx = INT_MAX;

    for(int i=0; i<n; i++) {
        if(idx[a[i]] != -1) {
            minidx = min(minidx, idx[a[i]]);
        } else {
            idx[a[i]] = i;
        }
    }
    
    if(minidx == INT_MAX) {
        cout << "-1" << endl;
    } else {
        cout << minidx + 1 << endl;
    }

}

// O(n^2)
void bruteSubarrayWthGivenSum(int a[], int n) {

    int s; cin >> s;
    int curr = 0;
    for(int i=0; i<n; i++) {
        curr = 0;
        for(int j=i; j<n; j++) {
            curr += a[j];
            // cout << curr << " ";
            if(curr == s) {
                cout << i+1 << " " << j+1;
                return;
            }
        }
    }
}

void subarrayWthGivenSum(int a[], int n) {
    int s; cin >> s;

    int i=0, j=0, st=-1, en=-1, sum=0;
    while(j<n && sum+a[j] <= s) {
        sum += a[j];
        j++;
    }

    if(sum == s) {
        cout << i+1 << " " << j << endl;
        return;
    }

    while(j<n) {
        sum += a[j];
        while(sum > s) {
            sum -= a[i];
            i++;
        }
        if(sum == s) {
            st = i+1;
            en = j+1;
            break;
        }
        j++;
    }

    cout << st << " " << en << endl;

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
    // recordBreakingDay(arr, n);
    // firstRepeatingEle(arr, n);
    // bruteSubarrayWthGivenSum(arr, n);
    subarrayWthGivenSum(arr, n);

    return 0;
}