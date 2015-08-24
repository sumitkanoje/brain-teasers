# No Century

Consider the following struct:
```c++
struct match_score {   
	char country[30];    
	int score;
};
```
This struct holds the score of a particular cricket batsman in a particular match. country indicates the country against which this match was played.

Write a function C function which takes an array of struct match_scores and returns the number of countries against which this batsman has not scored any centuries. A batsman is said to have scored a century in a match if the score is greater than or equal to 100.

Your function must be called func and should have this signature:
```c++
Int func(struct match_score *array, int len);
```
Here len is the length of array. For example, if your function is called as follows:
```c++
struct match_scores[] = {
    {"Pakistan", 23},
    {"Pakistan", 127},
    {"India", 3},
    {"India", 71},
    {"Australia", 31},
    {"India", 22},
    {"Pakistan", 81},
};
int no_century_countries = func(match_scores, 7);
```
After this code is executed, the value of no_century_countries should be 2 (since this batsman has not scored a century against India or Australia.

In the comments in your code, indicate what is the running time of your program e.g. O(n^2) or O(n log n). You get bonus points if your program has a average running time of O(n log n). You get even more bonus points if you can give pseudo code for an O(n) algorithm assuming you already have access to the appropriate data structures. (But remember, first get your program working. A working, slow program will score better than a non-working efficient one.)

And here's some code! :+1: (that needs to be corrected)

```c++
// Example program
#include <iostream>
//#include <string>

struct match_score {
    char country[30];
    int score;
};

int func(struct match_score *array, int len);

int main()
{
    match_score match_scores[] = {
        {"Pakistan", 23},
        {"Pakistan", 127},
        {"India", 3},
        {"India", 71},
        {"Australia", 31},
        {"India", 22},
        {"Pakistan", 81},
    };
    
    int no_century_countries = func(match_scores, 7);
    
    printf("%d",no_century_countries);
    return 0;
}

int func(struct match_score *array, int len){
    int count=0;
    while(len>0){
        int i=len;
        if(array[len].score>=100){
            printf("%s",array[len].country);
            continue;
        }
        else {
        while(i<len){
            if(array[len].country == array[i].country){
                break;
                i++;
            }
            else
                count++;
        }
        }
        len--;
    }
    //sum = array[i].score;
    return count;
}
```
