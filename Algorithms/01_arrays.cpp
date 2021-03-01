#include <iostream>
#include <stdio.h>
using namespace std;

struct Rectangle{
    int length;
    int height;
    char x;
};

int main(){
    struct Rectangle r1={10,5};

    r1.length=7;
    r1.height=15;
    
    cout<<r1.length<<endl;
    cout<<r1.height<<endl;
    return 0;
}


// int main(){
    
//     int A[5];
//     A[0]=12;
//     A[1]=15;
//     A[2]=25;

//     cout<<sizeof(A)<<endl;
//     cout<<A[1]<<endl;
//     printf("%d\n",A[2]);

//     return 0;
// }
