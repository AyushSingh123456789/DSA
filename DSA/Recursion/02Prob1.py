# Recursion using Parameters:



# Ques: We're given x as an integer number which we've to print, for N  number of times using Recursion.

# x = int(input("Enter the integer: "))
# N = int(input("Enter the number of repetition: "))

# def func(x,N):
#     if N == 0:
#         return 
#     print(x)
#     func(x,N-1)
# func(x,N)

# Method2: Tail Recursion(Backtracking)

a = int(input("Enter the integer: "))
b = int(input("Enter the repetition: "))

def func(a, b):
    if b == 0:
        return
    func(a,b-1)
    print(a)
func(a,b)
