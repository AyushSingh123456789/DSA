
nums = [7,5,3,1,2,4]
n = len(nums)

def selectionSort(nums):
    for i in range(0, n):
        min_idx = i
        for j in range(i+1, n):
            if nums[j] < nums[min_idx]:
                min_idx = j
        nums[i], nums[min_idx] = nums[min_idx], nums[i]
    return

selectionSort(nums)
print(nums)

# Time Complexity: O(n^2)
# Space Complexity: O(1); variables aren't increasing/decreasing with the length of list.