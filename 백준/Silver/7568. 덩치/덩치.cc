
#include <iostream>
using namespace std;

class people {
    int weight;
    int tall;

public:
    int grade;
    
    void getWeight(int K){
        weight = K;
    }
    void getTall(int K){
        tall = K;
    }
    void compare(people& a) {
        if (weight < a.weight && tall < a.tall) {
            grade++;
        }
        else if (weight > a.weight && tall > a.tall) {
            a.grade++;
        }
    }
};

int main() {
    int N;
    cin >> N;

    people* p = new people [N];
    int k, q;
    for (int i = 0; i < N; i++) {
        cin >> k >> q;
        p[i].getWeight(k); 
        p[i].getTall(q);
    }

    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            p[i].compare(p[j]);
        }
        cout << p[i].grade + 1 << ' ';
    }

    delete[] p; // 메모리 해제
    return 0;
}