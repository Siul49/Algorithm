#include <iostream>
#include <algorithm>
using namespace std;

struct member {
	int age;
	char name[101];
	int index;

	bool operator <(const member& a) const {
		if (age == a.age) {
			return index < a.index;
		}
		else {
			return age < a.age;
		}
	}
};

int main() {
	int N;
	cin >> N;

	member* p = new member[N];
	for (int i = 0; i < N; i++) {
		cin >> p[i].age >> p[i].name;
		p[i].index = i;
	}

	sort(p, p + N);
	
	for (int i = 0; i < N; i++) {
		cout << p[i].age << " " << p[i].name << '\n';
	}
}