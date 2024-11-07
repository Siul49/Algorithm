#include <iostream>
#include <vector>
using namespace std;



int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int M;
	cin >> M;
	
	int arr[21] = { 0, };

	string s;
	int n;
	for (int i = 0; i < M; i++) {
		cin >> s;
		
		if (s == "add") {
			cin >> n;
			arr[n] = 1;
		}
		else if (s == "check") {
			cin >> n;
			if (arr[n] == 1) {
				printf("1\n");
			}
			else {
				printf("0\n");
			}
		}
		else if (s == "remove") {
			cin >> n;
			arr[n] = 0;
		}
		else if (s == "toggle") {
			cin >> n;
			if (arr[n] == 1) {
				arr[n] = 0;
			}
			else {
				arr[n] = 1;
			}
		}
		else if (s == "all") {
			for (int j = 1; j <= 20; j++) {
				arr[j] = 1;
			}
		}
		else if (s == "empty") {
			for (int j = 1; j <= 20; j++) {
				arr[j] = 0;
			}
		}
	}

}
