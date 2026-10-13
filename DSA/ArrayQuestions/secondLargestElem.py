nums = [55,32,97,-55,45,32,88,91]
n = len(nums)
max1 = float("-inf")
max2 = float("-inf")

for i in range(0, n):
    if nums[i] > max2 and nums[i] > max1:
        max1 = nums[i]
    elif nums[i] > max2 and nums[i] < max1:
        max2 = nums[i]
    else:
        continue
print(max2)