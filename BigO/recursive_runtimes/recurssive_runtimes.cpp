#include <iostream>

int f(int n){
    if (n <= 1) {
        return 1;
    }
    return f(n - 1) + f(n - 1);
}

int main(){
    std::cout << f(4) << "\n";
    return 0;
}

// 5 
// 4                4
// 3         3
// 2    2
// 1    1