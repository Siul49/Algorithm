#include <iostream>
#include <algorithm>
using namespace std;

void swap(int& a, int& b) {
	int tmp = a;
	a = b;
	b = tmp;
}
int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	int times;
	cin >> times;
	
	int arr[10001] = { 0, };
	int a;
	for (int i = 0; i < times; i++) {
		cin >> a;
		arr[a]++;
	}
	

	for (int i = 0; i < 10001; i++) {
		for (int j = 0; j < arr[i]; j++) {
			cout << i << '\n';
		}
	}

}