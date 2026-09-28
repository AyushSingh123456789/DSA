nums = [5,1,6,8,2,4,9]
n = len(nums)

def bubbleSort(nums):  
    for i in range(n):
        for j in range(0, n-1-i):
            if nums[j+1] < nums[j]:
                nums[j], nums[j+1] = nums[j+1], nums[j]
    return
bubbleSort(nums)
print(nums)

# Time complexity: 0(n^2); avg/worst case
# Space complexity: O(1)

# Optimized Bubble Sort:

def optBubbleSort(nums):
    for i in range(n):
        swap = False
        for j in range(0, n-1-i):
            if nums[j+1] < nums[j]:
                nums[j] , nums[j+1] = nums[j+1], nums[j]
                swap = True
        if swap == False:
            break
    return
optBubbleSort(nums)
print(nums)

#Time complexity: O(n); Best case
# Space complexity: O(1)
