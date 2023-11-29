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

void lcas(int n, int arr[]) {
    // find the length of longest contiguous arithmetic subarray
    // i.e. difference between adjacent elements will be same
    int pd = arr[1]-arr[0];
    int ans = 2;
    int currLen = 2;
    for(int i=2; i<n; i++) {
        if(pd == (arr[i]-arr[i-1])) {
            // increase the length of subarr
            currLen ++;
        } else if (pd != (arr[i]-arr[i-1])) {
            // change pd to difference betn the elements
            pd = arr[i]-arr[i-1];
            currLen = 2;
        }
        ans = max(currLen, ans);
    }
    cout << ans;

}

void recordBreak() {
    int n; cin>>n;
    int arr[n+1];
    arr[n]= -1;
    for(int i=0; i<n; i++) {
        cin>> arr[i];
    }

    if(n == 1) {
        cout << "1";
    }

    int prevMax = -1;
    int numofRB = 0;
    for(int i=0; i<n; i++) {
        // condn 1: greater than prevMax
        // condn 2: greater than next ele i.e. arr[i+1];
        if(arr[i]>prevMax && arr[i]>arr[i+1]) {
            numofRB++;
        }
        prevMax = max(prevMax, arr[i]);
    }
    cout << numofRB;
}

void firstRepEle(int n, int a[]) {
    // first repeating element
    // i.e. an element that occurs more than once and whose index of first occurence is smallest 
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

    // what if meko minidx mila hi nai (int_max hi raha)
    if(minidx == INT_MAX) {
        cout << "-1" << endl;
    } else {
        cout << minidx + 1 << endl;
    }
}

void subarrWthGivenSum(int n, int a[]) {
    // given an undorted array, non-negative integers
    // find a continous subarray which adds to given number S;
    int S; cin>>S;
    int st=-1, en=-1;
    int currSum=0; // sum betn s & e
    
    int i=0, j=0;
    while(j<n && currSum+a[j] <= S) {
        currSum += a[j];
        j++;
    }

    if(currSum == S) {
        // cout << i+1 << " "<<j;
        st = i+1;
        en = j;
    }

    while(j<n) {
        currSum += a[j];
        while(currSum > S) {
            currSum -= a[i];
            i++;
        }
        if(currSum == S) {
            st = i+1; en = j+1;
            break;
        }
        j++;
    }
    cout << st << " " << en;
}

void missingNum(int n, int a[]) {
    // smallest positive missing number
    int N= 1e6+2;
    bool A[N];
    for(int i=0; i<N; i++) {
        A[i] = false;
    }

    for(int i=0; i<n; i++) {
        if(a[i] >= 0) {
            A[a[i]] = true;
        }
    }

    int ans = -1;
    for(int i=0; i<N; i++) {
        if(A[i] == false) {
            ans = i;
            break;
        }
    }
    cout << ans;
}

int main() {
    int n; cin>>n;
    int arr[n]; 
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    // maxtilli(n,arr);
    // sumSubarray(n,arr);
    // lcas(n,arr);
    // recordBreak();
    // firstRepEle(n,arr);
    // subarrWthGivenSum(n,arr);
    missingNum(n,arr);

    return 0;
}