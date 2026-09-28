
def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr)//2
    left = arr[:mid]
    right = arr[mid:]
    
    left = merge_sort(left)
    right = merge_sort(right)
    
    return merge(left, right)

def merge(left, right):
    result = []
    i = 0
    j = 0
    
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    
    result.extend(left[i:])
    result.extend(right[j:])
    
    return result

nums = [38,42,27,43,9,21,5]
sorted_arr = merge_sort(nums)
print(sorted_arr)

#Time Complexity: O(n log n); log n comes from repeatedly splitting array in half, while n comes from merging elements at each level.
# Space Complexity: O(n) ; worst case if all the elements get inside the result array. Recursion stack: O(log n) space.