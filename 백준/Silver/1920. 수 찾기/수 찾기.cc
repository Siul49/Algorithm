#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

void binarySearch(int* a, int N, int* k, int M) {
	int left, right;
	int mid;
	for (int i = 0; i < M; i++) {
		left = 0;
		right = N-1;
		while (1) {
			mid = (left + right) / 2;

			if (a[mid] == k[i]) {
				cout << 1 << '\n';
				break;
			}
			else if (a[mid] > k[i]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}

			if (right < left) {
				cout << 0 << '\n';
				break;
			}
		}
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int N;
	cin >> N;

	int* a = new int [N];
	for (int i = 0; i < N; i++) {
		cin >> a[i];
	}
	sort(a, a + N);

	int M;
	cin >> M;

	int* k = new int[M];
	for (int i = 0; i < M; i++) {
		cin >> k[i];
	}

	binarySearch(a, N, k, M);
	

}