#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;

struct document {
	int ip;
	int index;
};

int main() {
	int T;
	cin >> T;

	for (int k = 0; k < T; k++) {
		int N, M;
		cin >> N >> M;
		
		int* a = new int [N];
		document* importance = new document[N];
		queue<document> ip;
		for (int i = 0; i < N; i++) {
			cin >> importance[i].ip;
			importance[i].index = i;
			a[i] = importance[i].ip;
			ip.push(importance[i]);
		}
		sort(a, a + N, greater<int>());

		int p = 0;
		int cnt = 0;
		bool d = true;
		while (d) {	
			for (int i = 0; i < ip.size(); i++) {
				if (a[p] == ip.front().ip) {
					cnt++;
					if (ip.front().index == M) {
						cout << cnt << endl;
						d = false;
						break;
					}
					ip.pop();
					p++;
				} 
				else {
					ip.push(ip.front());
					ip.pop();
				}
			}
		}
	}
}