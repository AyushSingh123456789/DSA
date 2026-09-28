nums1 = [1,2,3,4]
nums2 = [1,3,5,6,7,8]
n = len(nums1)
k = len(nums2)
result = []
i= 0
j = 0


while i < n and j < k:
    if nums1[i] <= nums2[j]:
        result.append(nums1[i])
        i += 1
    else:
        result.append(nums2[j])
        j += 1

result.extend(nums1[i:])
result.extend(nums2[j:])

print(result)