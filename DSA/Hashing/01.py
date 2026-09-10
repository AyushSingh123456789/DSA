#Ques: Count and print all the frequencies of all the elements of list m inside the list n.

# Constraints:
#i) 1 <= n[i] <= 10
# ii) n can have 10^8 elements.
# iii) m can have 10^8 elements.


# Method1: Brute Force(My first approach)

n = [5,3,2,2,1,5,5,7,5,10]
m = [10,111,1,9,5,67,2]
# hash_map = {}
# for i in n:
#     for j in m:
#         if j == i and j in hash_map:
#             hash_map[j] += 1
#             continue
#         elif j == i and j not in hash_map:
#             hash_map.update({j:1})
#             continue
#         else:
#             continue
# for items in m:
#     if items not in hash_map:
#         hash_map.update({items:0})
# print(hash_map)

# Time Complexity: O(MXN); where M is len(m) & N is len(n)
# Space Complexity: O(M); where M is len(m).

# Brute Force(Sir's Approach): just number of appearance print, not in some dictionary manner:

# for num in m:
#     count = 0
#     for x in n:
#         if x == num:
#             count += 1
#     print(count, end=" ")

# Time Complexity: O(MXN)
# Space Complexity: O(1)

# Note: Both the above solutions will throw TLE Error, as the worst case number of operations reach 10^8 * 10^8 = 10^16 operations total, which is too much.

# The Optimal Hashing Solution:

# As, the values inside n can only be >=1 and <=10, we predefine a hashlist of length (10 - 0)+ 1 = 11, with value at every index = 0.

hash_list = [0] * 11
for num in n:
    hash_list[num] += 1 # the values inside list n is used to increment & assign values at that same value Index in the hash_list.
for num in m:
    if num < 1 or num > 10: # if the values inside list m < or > 10, we treat their occurence as 0 in the hash_list, and hence print 0
        print(0, end=" ")
    else:
        print(hash_list[num], end=" ")#if the values inside list m >= 1 && <=10, then we assign & print their occurence in list n, i.e. the value at the index posn. of this value(list m's value) inside hash_list.

# Time complexity = O(M+N); for each of the for-loop;
# Space complexity = O(11) ~ O(1)
# Note: For the worst case, the time complexity = O(10^8 + 10^8) = O(2*10^8), which will not cause any TLE error.

# Optimal Hashing way(BY Gemini, without any constraints):

# # 1. Find the maximum value to size the array safely (plus 1 for 0-indexing)
# max_val = max(max(n), max(m))
# hash_list = [0] * (max_val + 1)

# # 2. Populate the frequency array using elements of n
# for num in n:
#     hash_list[num] += 1

# # 3. Match the output format of the previous approaches using m
# h_dict = {}
# for num in m:
#     h_dict[num] = hash_list[num]

# print(h_dict)


# Another approach using the First method(The Better Dictionary Way):

hash_dict = {}
set_m = set(m)
for items in n:
    if items in set_m:
        if items in hash_dict:
            hash_dict[items] += 1
        else:
            hash_dict[items] = 1
for items in m:
    if items not in hash_dict:
        hash_dict[items] = 0
print(hash_dict)

# Time Complexity: O(M+N)
# Space Complexity: O(1)

        




        
            