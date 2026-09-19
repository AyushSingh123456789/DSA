# Given a string, return the first character that appears for the second time as you scan left to right.

text = "abca"

charDict = {}
for char in text:
    if char not in charDict:
        charDict[char] = 1
    else:
        charDict[char] += 1

flag = False
for k, v in charDict.items():
    if v == 2:
        print(k)
        flag = True
        break
if flag == False:
    print("NULL")