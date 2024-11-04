#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
    int n;
    cin >> n;

    // 예외 처리: n이 0인 경우
    if (n == 0) {
        cout << 0 << endl;
        return 0;
    }

    int* arr = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr + n);

    int a = round(n * 0.15);  // 절사할 개수 계산
    int sum = 0;
    for (int i = a; i < n - a; i++) {
        sum += arr[i];
    }

    // 평균 계산과 반올림
    double average = (double)(sum) / (n - 2 * a);
    cout << round(average) << endl;

    return 0;
}
