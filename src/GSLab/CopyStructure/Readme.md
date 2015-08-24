# Copy one Structure to Another

Consider the following struct:
```c++
struct s {
        char student[30];
         int marks;
};
```
This struct holds the marks of a particular student in a particular class. Studnet indicates the student name and marks indicate obatined marks.

Write a function C function which takes an array of copies values of one structure to another without using a c libarary function.

Your function must be called func and should have this signature:
```c++
void func(struct s *src, struct s *dest);
```
Here len is the length of array. For example, if your function is called as follows:
```c++
    struct s s1 = {"Navin", 99}, s2 = {"Amit", 100};
    func(&s1, &s2);
```

And here's some code! :+1: (and Yah!! its working :))

```c++
#include <iostream>
#include <string>

struct s {
        char student[30];
         int marks;
    };
    
void func(struct s *src, struct s *dest);

int main()
{
 
    struct s s1 = {"Navin", 99}, s2 = {"Amit", 100};
    func(&s1, &s2);
    return 0;
}

void func(struct s *src, struct s *dest){
    dest->marks = src->marks;
    int i = 0;
    while(i<30){
    (dest->student)[i] = (src->student)[i];
    i++;
    }    
}

```
