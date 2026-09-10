import math
num = int(input())
length = len(str(num))
n = num
new_number = 0
while n > 0:
    last_digit = n % 10
    new_number = new_number + (last_digit ** length)
    n = n // 10
if new_number == num:
    print("Armstrong")
else:
    print("Not Armstrong")
    
# Time Complexity: O(log n) => log n to the base 10.
# Space Complexity: O(1) => variables independent of input num.

    
    
