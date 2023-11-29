#include <iostream>
#include <limits.h>
using namespace std;

void printAllSubarr(int n, int a[]) {
    for(int i=0; i<n; i++) {
        for(int j=i; j<n; j++) {
            for(int k=i; k<=j; k++) {
                cout << a[k] << " ";
            }
            cout << endl;
        }
    }
}

void maxSubarrSum(int n, int a[]) {
    // BRUTE FROCE APPROACH
    // TC = O(n^3);
    int ans = INT_MIN;

    for(int i=0; i<n; i++) {
        for(int j=i; j<n; j++) {
            int sum = 0;
            for(int k=i; k<=j; k++) {
                sum += a[k];
            }
            ans = max(ans, sum);
        }
    }
    cout << ans;
}

void maxSubarrSum2(int n, int arr[]) {
    // cumulative sum array approach
    // TC = O(n^2);
    int currSum[n+1];
    currSum[0] = 0;

    for(int i=1; i<=n; i++) {
        currSum[i] = currSum[i-1] + arr[i-1];
    }

    int maxSum = INT_MIN;
    // i ko 1 se start kia because currSum[0] is 0
    for(int i=1; i<=n; i++) {
        int sum =0;
        for(int j=0; j<i; j++) {
            sum = currSum[i] - currSum[j];
            maxSum = max(sum, maxSum);
        }
    }
    cout << maxSum;

}

void maxSubarrSum3(int n, int arr[]) {
    // kadane's algo
    // if currSum < 0 then update it to 0 && output the value of greatest currSum[i]
    int currSum = 0;
    int maxSum = INT_MIN;
    for(int i=0; i<n; i++) {
        currSum += arr[i];
        if(currSum < 0) {
            currSum = 0;
        }
        maxSum = max(maxSum, currSum);
    }
    cout << maxSum;
}

int kadane(int arr[], int n) {
    int currSum =0;
    int maxSum = INT_MIN;
    for(int i=0; i<n; i++) {
        currSum += arr[i];
        if(currSum < 0) {
            currSum =0;
        }
        maxSum = max(maxSum, currSum);
    }
    return maxSum;
}

void circularSum(int n, int arr[]) {
    // find maximum circular subarr sum
    int wrapsum;
    int nonwrapsum = kadane(arr,n);

    // wrapped sum
    int totalsum = 0;
    for(int i=0; i<n; i++) {
        totalsum += arr[i];
        arr[i] = -arr[i];
    }

    wrapsum = totalsum + kadane(arr,n);

    cout << max(wrapsum, nonwrapsum);
}

void pairSum(int n, int arr[]) {
    
}

int main() {
    int n; cin>>n;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    // printAllSubarr(n,arr);
    // maxSubarrSum(n, arr);
    // maxSubarrSum2(n, arr);
    // maxSubarrSum3(n,arr);
    circularSum(n, arr);
    pairSum(n, arr);

    return 0;
}