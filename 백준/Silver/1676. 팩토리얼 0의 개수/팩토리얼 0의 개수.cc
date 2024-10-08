#include<iostream>
using namespace std;


int main(){
    int n;
    cin >> n;

    int cntTwo = 0;
    int cntFive = 0;
    for (int i = n; i > 1; i--){
        int a = i;
        while (1){
            if (a%2 == 0){
                cntTwo++;
                a /= 2;
            }
            else{
                break;
            }
        }
        while(1){
            if (a%5 == 0){
                cntFive++;
                a /= 5;
            }
            else {
                break;
            }
        }
    }
    if (cntTwo >= cntFive){
        cout << cntFive;
    }
    else {
        cout << cntTwo;
    }

}