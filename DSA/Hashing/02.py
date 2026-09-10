# Character Hashing:
# Constraints: 'a' <= S[i] <= 'z'

S = "azyxyyzaaaa"
Q = ['d', 'a', 'y', 'x']

# Solution Approach:
#1. As, only the small characters are involved, so the ASCII value would be b/w 97 to 122.
#2. Lets create a list of length 122, where every index contain 0 as the initial value.
#3. But, wait all the length of list prior to 97, containing 0 would just be waste of space, as we don't need them.
#4 So, Let's create a list containing all the elements = (122 - 97)+ 1 = 26. (Total no. elements = High - low) + 1.

hash_list = [0] * 26
for char in S:
    ascii_val = ord(char)
    index = ascii_val - 97
    hash_list[index] += 1
for char in Q:
    ascii_val2 = ord(char)
    index = ascii_val2 - 97
    print(hash_list[index], end=",")
    
# Time Complexity: O(M+N); where M is the length of S, and N is the length Q.
# Space Complexity: O(26)= O(1)

print() # empty line
# H.W: Try this same question if there were no constraints, and the variable S also contained some Capital Alphabet letters.

A = "aZyXTbaANM"
B = ['a', 'n', 'm', 'y']

# Solution Approach:
#1. So, both the lowercase and uppercase characters involved b/w 65 to 90, and 97 to 122.
#2. Here, the index = ascii_val - 97 method won't work, so let's create a list of length 122.

hash_li = [0] * 122
for char in A:
    ascii_value = ord(char)
    hash_li[ascii_value] += 1
for char in B:
    ascii_value2 = ord(char)
    print(hash_li[ascii_value2], end=",")
