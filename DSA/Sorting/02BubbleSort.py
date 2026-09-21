nums = [5,1,6,8,2,4,9]
n = len(nums)

def bubbleSort(nums):  
    for i in range(n-1, -1, -1):
        for j in range(0, i):
            if nums[j] > nums[j+1]:
                nums[j], nums[j+1] = nums[j+1], nums[j]
    return
bubbleSort(nums)
print(nums)

# Imp note: We can also use the range of i: (n-2, -1, -1), if we just modify the range of j: (0, i+1).
# Time complexity: 0(n^2); avg/worst case
# Space complexity: O(1)

# Optimized Bubble Sort:

def optBubbleSort(nums):
    for i in range(n-2, -1, -1):
        isSwap = False
        for j in range(0, i+1):
            if nums[j] > nums[j+1]:
                nums[j] , nums[j+1] = nums[j+1], nums[j]
                isSwap = True
        if isSwap == False:
            # break
            return
    return
optBubbleSort(nums)
print(nums)

#Time complexity: O(n); Best case
# Space complexity: O(1)
