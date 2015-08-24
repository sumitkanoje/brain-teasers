Pink and Blue
Xenny was a teacher and he had N students. The N children were sitting in a room. Each child was wearing a white T-shirt, with a unique number from the range 1 to N written on it. T-Shirts of pink and blue color were to be distributed among the students by Xenny. This made the students very happy.

Xenny felt that a random distribution of T-Shirts would be very uninteresting. So, he decided to keep an interesting condition:

Every student would get a T-Shirt that is of a different color than his/her friends. That is, if X and Y are friends and X has a Pink T-Shirt, then Y should compulsorily have a Blue T-Shirt, and vice-versa.

Also, Xenny had a belief that Boys should wear blue T-Shirts and Girls should wear pink T-Shirts. If a boy was given a pink T-Shirt or a girl was given a Blue T-Shirt, he called it an inversion.

So, Xenny wanted to distribute T-Shirts in the above-mentioned interesting manner and also wanted to minimize "inversions". Help him solve the task.

Note: There are no disjoint groups of friends in the room. That is, 2 distinct groups with finite number of students do not exist, but exactly 1 group of students exists in the given situation.

Input Format:
First line contains 2 space-separated integers - N and M - number of students and number of friendships present respectively.

Second line consists of N space-separated characters, where ith character denotes the gender of the ith student. B: Boy, G: Girl.

M lines follow. Each line consists of 2 space-separated integers, u and v, showing that u is a friend of v and vice-versa.

Output Format:
If Xenny could distribute the T-Shirts in the desired way, print the minimum number of inversions required.
Else, print "Not possible".

Constraints:
1 ≤ N ≤ 105
1 ≤ M ≤ 105
1 ≤ u, v ≤ N

Colours of T-Shirt are represented by uppercase characters 'B' and 'G'

Sample Input (Plaintext Link)
3 2
B G B
1 2
1 3
Sample Output (Plaintext Link)
1
Explanation
Student 1 can be given a Blue T-Shirt. Hence, Student 2 and 3 would receive Pink T-Shirts.

Since, Student 3 is a Boy and has received a Pink T-Shirt, number of inversions = 1.
Time Limit: 5 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.
Allowed languages: C, C++, Clojure, Go, Haskell, C#, Java, JavaScript, Objective-C, Perl, PHP, Python, Ruby