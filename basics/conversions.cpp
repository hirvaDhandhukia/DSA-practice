#include <iostream>
using namespace std;

void decToBinary (int n) {
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

void binaryToDec(int n) {
    int ans=0, base=1;
    while(n) {
        ans += base*(n%10);
        base = base*2;
        n /= 10;
    }
    cout<< ans;
}

void octalToDec(int n) {
    int ans=0, base=1;
    while(n) {
        ans += (n%10)*base;
        base = base*8;
        n /= 10;
    }
    cout << ans;
}

int reverse (int n) {
    int ans = 0;
    while(n>0) {
        int lastdigit = n%10;
        ans = ans*10 + lastdigit;
        n /= 10;
    }
    return ans;
}

void addTwoBinary(int a, int b) {
    // here a and b both are binary nums;
    int prevCarry=0, ans=0;
    while(a,b) {
        if(a%2==0 && b%2==0) {
            // ans = (prevCarry==0) ? (ans*10) : (ans*10 + 1);
            if(prevCarry == 0) {
                ans = ans*10 + prevCarry;
                prevCarry = 0;
            }
        }
        else if((a%2==0 && b%2==1) || (a%2==1 && b%2==0)) {
            if(prevCarry==1) {
                ans = ans*10 + 0;
                prevCarry = 1;
            } else {
                ans = ans*10 + 1;
                prevCarry = 0;
            }
        }
        else if(a%2==1 && b%2==1) {
            ans = ans*10 + prevCarry;
            prevCarry =1;
        }
        a /= 10;
        b /= 10;
    }

    // what if length of a>b or b>a (to copy remaining digits)
    while (a>0) {
        if(prevCarry == 1) {
            if(a%2 == 1) {
                ans = ans*10 + 0;
                prevCarry = 1;
            } else {
                ans = ans*10 + 1;
                prevCarry=0;
            }
        } else {
            ans = ans*10 + (a%2);
        }
        a /= 10;
    }

    while (b>0) {
        if(prevCarry == 1) {
            if(b%2 == 1) {
                ans = ans*10 + 0;
                prevCarry = 1;
            } else {
                ans = ans*10 + 1;
                prevCarry=0;
            }
        } else {
            ans = ans*10 + (b%2);
        }
        b /= 10;
    }

    // dono barabar length ke hai but last mai ek carry back gai to
    if(prevCarry=1) {
        ans = ans*10 + 1;
    }

    // ans jo hai wo reverse mai aiega so printing ke wakt reverse function call kr lenge
    cout << reverse(ans);
}

int main() {
    // int n; cin>>n;
    // decToBinary(n);
    // binaryToDec(n);

    // octalToDec(n);

    int a,b; cin>>a>>b;
    addTwoBinary(a,b);

    return 0;
}