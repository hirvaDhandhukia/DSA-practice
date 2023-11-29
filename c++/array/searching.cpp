#include <iostream>
using namespace std;

int linearSearch(int n, int arr[], int key) {
    for(int i=0; i<n; i++) {
        if(arr[i] == key) {
            return i;
        }
    }
    return -1;
}

int binarySearch(int n, int arr[], int key) {
    // array will be sorted here
    int s=0, e=n;
    while(s<=e) {
        int mid = (s+e)/2;
        if(key > arr[mid]) {
            s = mid+1;
        }   
        else if(key < arr[mid]) {
            e = mid-1;
        }
        else if(key == arr[mid]) {
            return mid;
        }
    }
    return -1;
}

int main() {
    int n; cin>>n;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    int key; cin>>key;
    // cout << linearSearch(n, arr, key);
    cout << binarySearch(n,arr,key);

    return 0;
}