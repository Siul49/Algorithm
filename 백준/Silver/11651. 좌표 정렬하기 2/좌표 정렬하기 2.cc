#include <iostream>
#include <algorithm>
using namespace std;

struct Spot {
	int x;
	int y;

	bool operator<(const Spot& d) const {
		if (y == d.y) {
			return x < d.x;
		}
		else {
			return y < d.y;
		}
	}
};

int main() {
	int N;
	cin >> N;

	Spot* spot = new Spot[N];
	for (int i = 0; i < N; i++) {
		cin >> spot[i].x >> spot[i].y;

	}
	
	sort(spot, spot + N);
	
	for (int i = 0; i < N; i++) {
		cout << spot[i].x << " " << spot[i].y << '\n';
	}
}