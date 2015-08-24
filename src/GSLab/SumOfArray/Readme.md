#include <iostream>
#include <string>

int func(int array[], int len);

int main()
{
 
    int a[] = {1, 2, 3, 10};
    int sum = func(a, 4);
    printf("%d",sum);
    return 0;
}

int func(int array[], int len){
    int sum = 0;
    
    for(int i=0;i<len;i++){
          sum += array[i]; 
          //printf("%d",sum);
    }  
    return sum;
}
