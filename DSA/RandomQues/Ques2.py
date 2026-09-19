# Given the strings, return true, if they contain the exact same character with the exact same frequencies, just possibly in different order.

first = "listen"
second = "silent"
charDict1 = {}
charDict2 = {}

sortedFirst = ''.join(sorted(first))
sortedSecond = ''.join(sorted(second))

for char in sortedFirst:
    if char not in charDict1:
        charDict1[char] = 1
    else:
        charDict1[char] += 1

for char in sortedSecond:
    if char not in charDict2:
        charDict2[char] = 1
    else:
        charDict2[char] += 1
        

flag = False   
for k1, v1 in charDict1.items():
    for k2, v2 in charDict2.items():
        if k1 == k2:
            if v1 == v2:
                flag = True
            else:
                flag = False
                break
    if flag == False:
        break
if flag == True:
    print("true")
else:
    print("false")