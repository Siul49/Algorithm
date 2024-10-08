#include <iostream>
using namespace std;

int main(){
	int N, K;
	cin >> N >> K;
	
	int u=1;
	for (int i = N; i >= N-K+1; i--){
		u *= i; 
	}
	int d =1;
	for (int i = K; i >= 1; i--){
		d*=i;
	}
	cout << u/d << endl;
	
	return 0;
}