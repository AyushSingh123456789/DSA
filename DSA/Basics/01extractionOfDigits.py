n = int(input("Enter an integer value: "))
num = n
while num > 0:
    last_digit = num % 10
    print(last_digit)
    num = num // 10
