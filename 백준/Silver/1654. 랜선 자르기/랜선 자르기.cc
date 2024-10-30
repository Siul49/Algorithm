#include <iostream>
using namespace std;


int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	int K, N;
	cin >> K >> N;

	// 이진탐색으로 길이 찾아볼까?
	// 최댓값만 찾아보자 일단
	long long max = 0;
	long long* line = new long long[K];

	for (int i = 0; i < K; i++) {
		cin >> line[i];
		if (max < line[i]) {
			max = line[i];
		}
	}

	long long left = 1, right = max;
	long long sum, result, mid = 0;
	while (left <= right) {
		sum = 0;
		mid = (left + right) / 2;
		
		for (int i = 0; i < K; i++) {
			sum += line[i] / mid;
		}

		if (sum >= N) {
			result = mid;
			left = mid + 1;
		}
		else if (sum < N){
			right = mid - 1;
		}
	}

	cout << result;
	
}