# Approach1: Loop-Based:

number= int(input("Enter an integer value: "))
n = number
count = 0
while n > 0:
    last_digit = n % 10
    count += 1
    n = n // 10
print(count)

# Approach2: Logarithm Based

from math import *

num = int(input("Enter an integer value: "))
print(int(log10(num)+1))

# Imp note: Cause every iteration has a constant division with '10', The time complexity = O(log10(N)), Space complexity = O(1) => only 2 independent variables on constant space.