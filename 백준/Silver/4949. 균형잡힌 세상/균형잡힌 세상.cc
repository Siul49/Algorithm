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


    while (1) {
        stack<char> s; // 여는 괄호를 넣을 스택 닫는 괄호 나올 때마다 꺼내서 확인한다
        int cnt1 = 0;
        int cnt = 0;
        string arr;
        getline(cin, arr); // 문자열 입력받기
        if (arr == ".") break; // 종료 조건
        // 닫는 괄호만 있을 경우를 봐야한다
        for (int i = 0; i < arr.length(); i++) {
            if (arr[i] == '.') break;
            if (arr[i] == '(' || arr[i] == '[') {
                s.push(arr[i]);
                cnt1++;
            }
            else if (arr[i] == ')' || arr[i] == ']') {
                cnt++;
                if (cnt1 > 0) {
                    if (compare(s.top(), arr[i])) {
                        s.pop();
                        cnt1--;
                        cnt--;
                    }
                }
            }
        }
        if (s.empty() && cnt == 0) {
            cout << "yes" << endl;
        }
        else {
            cout << "no" << endl;
        }
    }

    return 0;
}
