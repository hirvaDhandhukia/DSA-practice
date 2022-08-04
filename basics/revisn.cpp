#include <iostream>
using namespace std;

bool isPrime(int n) {
    if(n<=1) {
        return false;
    }
    
    for(int i=2; i<n; i++)
        if(n%i == 0) {
            return false;
        } 
    return true;
}

void isArmstrong(int n) {

    int sum =0;
    while(n>0) {
        int lastdigit = n%10;
        sum = sum + (lastdigit*lastdigit*lastdigit);
        n=n/10;
    }
    cout << sum;
}

// void binaryToDec() {

// }

void decToBinary() {

    int n; cin>>n;
    int a[10], i=0;
    while(n>0) {
        a[i] = n%2;
        n=n/2;
        i++;
    }

    // print array in reverse order
    for(int j=i-1; j>=0; j--) {
        cout << a[j];
    }

}

void binaryToDec() {
    int n; cin>>n;
    int ans=0, m=1;
    while(n>0) {
        int lastdigit = n%10;
        ans = ans + lastdigit*m;
        n = n/10;
        m = m*2;
    }

    cout << ans;
}

int main() {
    // sum 2 nums 
    // int a,b; cin>>a>>b;
    // int c = a+b;
    // cout << c;

    // area of square
    // int a; cin>>a;
    // int area = a*a;
    // cout << area;

    // odd or even
    // int a; cin>>a;
    // if(a%2 == 0) {
    //     cout << "even";
    // } else cout << "odd";

    // factorial
    // int n; cin>>n;
    // int fact =1;
    // for(int i=1; i<=n; i++) {
    //     fact = fact * i;
    // }
    // cout << fact;

    // prime num or not
    // int n; cin>>n;
    // isPrime(n) ? cout<<"prime" : cout<<"not prime";

    // num given is armstrong or not
    // int n; cin>>n;
    // isArmstrong(n);


    // fibonacci series
    // int a=0, b=1;
    // int n; cin>>n;
    // cout << a << " " << b << " ";

    // for(int i=2; i<n; i++) {
    //     int c=a+b;
    //     cout << c << " ";
    //     a=b;
    //     b=c;
    // }
    

    // decToBinary();
    binaryToDec();

    return 0;
}