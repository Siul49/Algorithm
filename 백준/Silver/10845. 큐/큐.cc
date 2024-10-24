#include <iostream>	
#include <queue>
#include <string>
using namespace std;

int main() {
	int n;
	cin >> n;
	

	queue<int> que;
	string* k = new string[n];
	for (int i = 0; i < n; i++) {
		cin >> k[i];
		if (k[i] == "push") {
			int p;
			cin >> p;
			que.push(p);
		}
		else if (k[i] == "front") {
			if (que.empty()) {
				cout << -1 << endl;
				continue;
			}
			cout << que.front() << endl;
		}
		else if (k[i] == "back") {
			if (que.empty()) {
				cout << -1 << endl;
				continue;
			}
			cout << que.back() << endl;
		}
		else if (k[i] == "empty") {
			cout << que.empty() << endl;
		}
		else if (k[i] == "size") {
			cout << que.size() << endl;
		}
		else if (k[i] == "pop") {
			if (que.empty()) {
				cout << -1 << endl;
				continue;
			}
			cout << que.front() << endl;
			que.pop();
		}
	}
}