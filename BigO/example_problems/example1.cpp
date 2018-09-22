#include <iostream>
#include <array>

void foo(int array[]){
    int sum = 0;
    int product = 1;
    for ( int i = 0 ; i < sizeof(array) ; i++){
        sum += array[i];
    }
    for ( int i = 0; i < sizeof(array) ; i++){
        product *= array[i];
    }
    System.out.println(sum + ", " + product);
}

int main(){
    int myArr[3] = [1,2,3,4];
    std::cout << foo(myArr) << "\n";
    return 0;
}