#include <iostream>
#include <stack>
using namespace std;
bool compare(char a, char b) {
    if ((a == '(' && b == ')') || (a == '[' && b == ']')) {
        return true;
    }
    else {
        return false;
    }
}

int main() {
    // 괄호 탐색
    int N;
    cin >> N;

    for (int j = 0; j < N; j++) {
        stack<char> s; // 여는 괄호를 넣을 스택 닫는 괄호 나올 때마다 꺼내서 확인한다
        int cnt = 0; //
        string arr;
        cin >> arr;

        // 닫는 괄호만 있을 경우를 봐야한다
        for (int i = 0; i < arr.length(); i++) {
            if (arr[i] == '(' || arr[i] == '[') {
                s.push(arr[i]);
            }
            else if (arr[i] == ')' || arr[i] == ']') {
                cnt++;
                if (!s.empty()) {
                    if (compare(s.top(), arr[i])) {
                        s.pop();
                        cnt--;
                    }
                }
            }

        }
        if (s.empty() && cnt == 0) {
            cout << "YES" << endl;
        }
        else {
            cout << "NO" << endl;
        }
    }

    return 0;
}
