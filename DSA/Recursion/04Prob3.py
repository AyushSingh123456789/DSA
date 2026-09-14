# Print sum of n natural numbers using recursion( both Parametrized and Functional way).

# n = int(input("Enter the limit: "))
# x = 1

# First Try(Parameterised way):

# summation = 0
# def func(x, n):
    
#     if n == 1:
#         return
#     func(x + 1, n-1)
#     summation += x + n
# func(x,n)
# print(summation)

# Second Try(Parametrised way):

# def func(x,n):
#     if n == 1:
#         return
#     x = x + n
#     print(x)
#     func(x, n-1)
# func(x,n)


# Sir's method(parmetrised way):
sum = 0
i = 1
n = int(input("Limit: "))

def func(sum, i, n):
    if i > n:
        print(sum)
        return
    func(sum + i, i + 1, n)
func(sum, i, n)


