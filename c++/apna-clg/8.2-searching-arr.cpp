#include <bits/stdc++.h>
using namespace std;

bool linearSearch() {
    int n, key; cin>>n>>key;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    // int arr[6] = {12,18,20,42,8,10};
    // int key = 8;

    for(int i=0; i<n; i++) {
        if(arr[i] == key) {
            return true;
            break;
        }
    }
    return false;
}

int binarySearch(int arr[], int n, int key) {
    // key = 27
    // {8,10,12,21,27,34,42}

    int s=0, e=n;
    while(s<=e) {
        int mid((s+e)/2);
        
        if(arr[mid] == key) {
            return mid;
        }
        else if (arr[mid] > key) {
            e=mid-1;
        } else {
            s = mid+1;
        }
    }
    return -1;    
}

int main() {
    
    // cout << linearSearch();
    
    int n, key; cin>>n>>key;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    cout << binarySearch(arr, n, key);

    return 0;
}