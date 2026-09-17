# Question: Find the factorial of a number using recursion.

# Approach-1: Double Parameters:


n = int(input("Enter the number: "))
fact = 1


def func(fact, n):
    if n == 0:
        print(fact)
        return
    fact = fact * n
    func(fact, n - 1)


(func(fact, n))


# Approach-2: Single Parameter(After some minutes of try, help from gemini):

num = int(input("Enter the num: "))


def factorial(num):
    if num == 0 or num == 1:
        return 1
    return num * factorial(num - 1)


print(factorial(num))

# Time Complexity: O(num)
# Space Complexity: O(num) {stack space}
