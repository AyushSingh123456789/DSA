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
            
    
nums = [4,1,7,6,3,2,8]