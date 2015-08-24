# Find Tens Place

Write a function that returns the tens place of a number.

Your function must be called func and should have this signature:
```c++
int func(int num);
```
Here len is the length of array. For example, if your function is called as follows:
```c++
	res = func(137);
    printf("%d",res);
```
Write a program that calculates the tens place of a number for example the function `func(137)` rerturn `3`. If the tens place is not present then the function should return `0`.



And here's the code! :+1: (and Yah!! its working :))

```c++
#include <iostream>
#include <string>

int func(int num);

int main()
{
	res = func(137);
    printf("%d",res);
}
int func(int i){
    if(i<10 && i>=0)
        return 0;
    else{
    int res;
    res = i/10;
    res = res%10;
    return res;
    }
}
```
