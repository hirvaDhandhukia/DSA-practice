#include <bits/stdc++.h>
using namespace std;

void selectionSort(int arr[], int n) {

    for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
            if(arr[j] < arr[i]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
}

void bubbleSort(int arr[], int n) {

    for(int i=1; i<=n; i++) {
        for(int j=0; j<n-i; j++) {
            if(arr[j+1]<arr[j]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
}


void insertionSort(int arr[], int n) {

    for(int i=1; i<n; i++) {
        int current = arr[i];
        int j = i-1;

        while(arr[j] > current && j>=0) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }

}

int main() {
    int n; cin>>n;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    // selectionSort(arr, n);
    // bubbleSort(arr, n);
    insertionSort(arr, n);

    return 0;
}