
# The Best Approach(For Interview):

number = int(input())
n = number
reversed_num = 0
while n > 0:
    last_digit = n % 10
    reversed_num = (reversed_num * 10) + last_digit
    n = n // 10
if reversed_num == number:
    print("Palindrome.")
else:
    print("Not a Palindrome.")

# The continuos dependency on the n = n//10 proves that, Time Complexity = log n to the base 10 = O(log n), where n is the number, and as the variables are independent of the number, so this proves that the space used is constant, so Space Complexity = O(1).


# # My First Approach:

# num = int(input())
# n = num
# palindrome_seq = []
# while n > 0:
#     last_digit = n % 10
#     palindrome_seq.append(last_digit)
#     n = n // 10
# i = 0
# for x in palindrome_seq:
#     flag = False
#     if str(x) == (str(num)[i]):
#         flag = True
#         i += 1
#     else:
#         flag = False
#         print("Not a palindrome.")
#         break
# if flag == True:
#     print("Palindrome.")

    