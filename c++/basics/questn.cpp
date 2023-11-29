#include <iostream>
using namespace std;

void factorial() {
    int n; 
    cout << "Enter num: "; cin>>n;

    int fact = 1;
    for (int i=1; i<n; i++) {
        fact = fact * i;
    }
    cout <<fact <<endl;
}

void factor() {
    int n;
    cout << "Input num to find it's factors: "; cin>>n;

    for (int i=1; i<=n; i++) {
        if(n%i == 0) 
            cout << i << ", ";
    }
    cout << endl;
}

void fibonacci() {
    int n;
    cout<< "Enter num of terms in series you need: "; cin>>n;
    if(n == 1) 
        cout << "0 ";
    else if (n == 2) 
        cout << "0 1";
    else {
        int i=3, a=0, b=1;
        cout << a << " " << b << " ";
        while(i<=n) {
            int current;
            current = a+b;
            cout << current << " ";
            a = b;
            b = current;
            i++;
        }
        cout << endl;
    }
    
}

void sum_n() {
    // sum of first n natural numbers
    // we can use formula sum=n(n+1)/2
    int n; cout << "input n: "; cin >> n;
    int count=0;
    for(int i=1; i<=n; i++) {
        count += i;
    }
    cout << count;
}

void pythagorean() {
    // check for pythagorean triplet
    // i.e. a^2 + b^2 = c^2;
    int a=2, b=4, c=5;
    if((a*a)+(b*b) == (c*c)) {
        cout << "Yes it is";
    } else {cout << "Not a pytha triplet";}
}

int main() {
    // factorial();
    // factor();
    // fibonacci();
    // sum_n();
    // pythagorean();

    return 0;
}