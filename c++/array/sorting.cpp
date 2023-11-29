#include <iostream>
using namespace std;

void selectionSort(int n, int arr[]) {
    for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
            if(arr[j] < arr[i]) {
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

void bubbleSort(int n, int arr[]) {
    int counter = 1;
    while(counter < n) {
        for(int i=0; i<n-counter; i++) {
            if(arr[i+1] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
            }
        }
        counter ++;
    }

    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
}

void insertionSort(int n, int arr[]) {
    for(int i=1; i<n; i++) {
        int current = arr[i];
        int j=i-1;
        while(arr[j]>current && j>=0) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }

    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
}

int main() {
    int n; cin>>n;
    int arr[n];
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }
    
    // selectionSort(n,arr);
    // bubbleSort(n,arr);
    insertionSort(n,arr);

    return 0;
}