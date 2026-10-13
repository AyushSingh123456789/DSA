# Method-1:

arr = [2,-32,5,6,23,54,22]
n = len(arr)
largest = arr[0]
for i in range(1,n):
    largest = max(largest, arr[i])
print(largest)

# Time Complexity = O(n)
# Space Complexity = O(1)

# Method-2:

arr = [2,-32,5,6,23,54,22]
n = len(arr)
largest = float("-inf") # -infinity
for i in range(1,n):
    largest = max(largest, arr[i])
print(largest)

# Time Complexity = O(n)
# Space Complexity = O(1)