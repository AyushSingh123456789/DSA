# Approach1: Brute Force:

# num = int(input())
# factor_list = []
# for i in range(1,num+1):
#     if num % i == 0:
#         factor_list.append(i)
# for values in factor_list:
#     print(values, end=" ")
    
# Time Complexity: O(n)
# Space Complexity: O(k); k -> total number of factors for an input num, i.e. space for factor values depending upon the input num.

# Approach2: Better Solution:

# number = int(input())
# result = []
# for i in range(1, (number// 2)+1):
#     if number % i == 0:
#         result.append(i)
# result.append(number)
# for items in result:
#     print(items, end=" ")
    
# Time Complexity: O(n/2) ~ O(n)
# Space Complexity: O(k); k is amount of factors

# Approach3: The Optimal Solution:

from math import sqrt

number2 = int(input())
result2 = []
for i in range(1, int(sqrt(number2))+1): # O(root n)
    if number2 % i == 0:
        result2.append(i)
        if (number2 // i) != i: # jo number2 ke factors hain among 1 to sqrt(number2) , after division unke kuch quotients khud hi number2 ke factors hain.
            result2.append(number2 // i) # append karein aise quotients ko bhi.
result2.sort() # O(nlogn)
for items in result2:
    print(items, end=" ")
    
# Time Complexity = O(root n) + O(nlogn)
# Space Complexity = O(k); k is amount of factors.