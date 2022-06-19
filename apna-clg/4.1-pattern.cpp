#include <iostream>
using namespace std;

void rectangle() {
    int n; cin>>n;
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            cout << "*";
        } cout << endl;
    }
}

void hollowrect() {
    int row, col;
    cin >> row >> col;

    for(int i=1; i<=row; i++) {
        for(int j=1; j<=col; j++) {
            if(i==1 || i==row || j==1 || j==col) {
                cout << "*";
            } else cout << " ";
        }
        cout << endl;
    }
}

void invertedHalfPyramid() {
    int n; cin >> n;
    for(int i=n; i>0; i--) {
        for(int j=i;j>0; j--) {
            cout << "*";
        } cout << endl;
    }
}

void rightHalfPyramid() {
    int n; cin>>n;
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            if(j<n-i-1) {
                cout << " ";
            } else cout << "*";
        }
        cout << endl;
    }
}

int main() {   

    // rectangle();
    // hollowrect();
    // invertedHalfPyramid();
    rightHalfPyramid();

    return 0;
}