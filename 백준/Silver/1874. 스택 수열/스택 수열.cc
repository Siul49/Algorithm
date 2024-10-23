#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    stack<int> s;
    vector<char> result;  // 연산 결과를 저장할 벡터
    int current = 1;  // 1부터 n까지 숫자를 넣기 위한 변수
    bool possible = true;  // 수열을 만들 수 있는지 여부

    for (int i = 0; i < n; i++) {
        int target;
        cin >> target;

        // target까지 숫자를 push한다
        while (current <= target) {
            s.push(current);
            result.push_back('+');
            current++;
        }

        // 스택의 top이 target과 같으면 pop한다
        if (s.top() == target) {
            s.pop();
            result.push_back('-');
        } else {
            possible = false;  // 수열을 만들 수 없는 경우
            break;
        }
    }

    if (!possible) {
        cout << "NO" << endl;
    } else {
        for (char c : result) {
            cout << c << '\n';  // 연산 결과 출력
        }
    }

    return 0;
}
