def partition(nums, low, high):
    pivot = nums[low]
    i = low, j = high
    while i < j:
        while nums[i] <= pivot and i <= high - 1:
            i += 1
        while nums[j] > pivot and j >= low + 1:
            j -= 1
        if i < j:
            nums[i], nums[j] = nums[j], nums[i]
    nums[low], nums[j] = nums[j], nums[low]
    return j # the sorted index

def quickSort(nums, low, high):
    if low < high:
        pIndex = partition(nums,low,high)
        quickSort(nums, low, pIndex-1)
        quickSort(nums, pIndex+1, high)
            
    
nums = [4,1,7,6,3,2,8]
n = len(nums)
quickSort(nums, 0, n-1)
print(nums)

#Time complexity: O(n logn)=> Best/Avg Case, O(n^2) => Worst Case(ex: arr = [5,5,5,5,5,5,5])
# Space complexity: O(1); no stack space / extra space, as we're using recursion, and no return values, i.e. no different arrays returned on every call(unlike merge sort).