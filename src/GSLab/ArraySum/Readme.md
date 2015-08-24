# Sum of Elemens in an Array

Write a function C function which takes an array and calculates the some of only those elements which end with 7 or is greater than 100.


And here's some code! :+1: (and Yah!! its working :))

```c++
int func(int array[], int len){
    int i=0,sum=0;
    
    for(i=0;i<len;i++){
        int last = array[i]%10;
        if(last==7 && array[i]>100){
            continue;
        }else if(last==7){
            sum += array[i];
        }
        else if(array[i]>100){
             sum += array[i];
        }
    }
    return sum;
}```
