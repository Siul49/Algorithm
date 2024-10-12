#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;

    int N, M;
    
    for (int i = 0; i < T; i++){
        cin >> N >> M;
        long long C = 1;
        if (N > M/2){
            N = M-N;
        }
        for (int j = 0; j < N; j++){
            C = C * (M-j) / (j+1);
        }
        
        cout << C << endl;
    }
}