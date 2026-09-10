# Method-1:

freq = {}
nums = [5,6,7,7,1,9,111,1,1,5,1,1]
for items in nums:
    if items not in freq:
        freq.update({items: 1})
    else:
        freq[items] += 1
print(freq)
        
# Time complexity = O(n)
# Space complexity = O(1)

# Method-2:

hash_map = {}
nums2 = [5,6,7,7,1,9,111,1,1,5,1,1]
n = len(nums2)
for i in range(0,n):
    hash_map[nums2[i]] = hash_map.get(nums2[i], 0) + 1 # O(1) Time complexity
print(hash_map)
    


# Rough work for understanding the .get method solution:
# let i = 0: => hash_map[nums[0]] = hash_map.get(nums2[0], 0)+1 = hash_map.get(5,0)+1 => This checks if 5 exists inside the hash_map dict., and it does not, so it returns 0 => hash_map[nums[0]] = 0+1 = 1 => hash_map[5] = 1 => {5:1} is added to the hash_map dict.