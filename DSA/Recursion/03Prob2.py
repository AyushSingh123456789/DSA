# Ques: Print 1 to n using Recursion.
from token import NL


x = 1
n = int(input("Enter the limit: "))

# Head recursion method(1 to n):

# def func(x, n):
#     if x > n:
#         return
#     print(x)
#     func(x+1,n)
# func(x,n)

# Tail Recursion method(n to 1): 

# def func(x, n):
#     if x > n:
#         return
#     func(x+1,n)
#     print(x)
# func(x,n)

# Head recursion method(n to 1):

# def func(n):
#     if n == 0:
#         return
#     print(n)
#     func(n-1)
# func(n)

# Tail recursion method(1 to n):

def func(x, n):
    if n == 0:
        return
    func(x,n-1)
    print(n)
func(x,n)
