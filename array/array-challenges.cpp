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

void firstRepEle(int n, int arr[]) {
    // first repeating element
    // i.e. an element that occurs more than once and whose index of first occurence is smallest 
    
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
    firstRepEle(n,arr);

    return 0;
}