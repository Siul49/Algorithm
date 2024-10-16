#include <iostream>
#include <string>
using namespace std;

int main() {
	string a[3];
	int b[3];
	for (int i = 0; i < 3; i++) {
		cin >> a[i];
	}

	int k = 0;
	while (1) {
		k++;
        for (int i = 0; i < 3; i++){
            if (a[i] == "Fizz") {
                b[i] = (k - 3 + i) % 3;
            }
            else if (a[i] == "Buzz") {
                b[i] = (k - 3 + i) % 5;
            }
            else if (a[i] == "FizzBuzz") {
                b[i] = (k - 3 + i) % 15;
            }
            else {
                b[i] =  stoi(a[i]) + 3 - i;
                if (b[i] % 3 == 0 && b[i] % 5 != 0) {
                    cout << "Fizz";
                    return 0;
                }
                else if (b[i] % 5 == 0 && b[i] % 3 != 0) {
                    cout << "Buzz";
                    return 0;
                }
                else if (b[i] % 5 == 0 && b[i] % 3 == 0) {
                    cout << "FizzBuzz";
                    return 0;
                }
                else {
                    cout << to_string(b[i]);
                    return 0;
                }
            }
        }
		if (b[1] == 0 && b[2] == 0 && b[0] == 0) {
			
            if (k % 3 == 0 && k % 5 != 0) {
                cout << "Fizz";
            }
            else if (k % 5 == 0 && k % 3 != 0) {
                cout << "Buzz";
            }
            else if (k % 5 == 0 && k % 3 == 0) {
                cout << "FizzBuzz";
            }
            else {
                cout << to_string(k);
            }
			break;
		}
	}
}